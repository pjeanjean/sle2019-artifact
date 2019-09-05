package fr.inria.diverse.ale.repl.ui.parts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.gemoc.dsl.Dsl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.lsp4j.CompletionItem;
import org.eclipse.lsp4j.CompletionList;
import org.eclipse.lsp4j.CompletionParams;
import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.TextDocumentItem;
import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Text;

import fr.inria.diverse.ale.repl.REPLInterpreter;
import fr.inria.diverse.ale.repl.server.ReplLspServer;
import fr.inria.diverse.ale.repl.ui.lsp4j.CompletionClient;
import fr.inria.diverse.ale.repl.ui.lsp4j.Helper;

public class REPLView {
	
	private Text input;
	private StyledText output;
	
	private String prompt;

	private Color errorColor;
	
	private MessageJsonHandler handler;
	private PrintStream serverInput;
	private BufferedReader serverOutput;
	private Socket clientSocket;
	
	private int historyIndex;
	private String tempInstruction;
	
	private String beforeCompletion;
	private List<CompletionItem> completions;
	private int completionsIndex;

	private ReplLspServer lspServer;
	
	private static REPLView instance;
	
	public static REPLView getInstance() {
		return instance;
	}
	
	public REPLView() {
		instance = this;
		
		this.lspServer = null;
	}
	
	@PostConstruct
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, true));
		
		this.output = new StyledText(parent, SWT.READ_ONLY | SWT.V_SCROLL);
		this.output.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));

		this.input = new Text(parent, SWT.SINGLE | SWT.BORDER);
		this.input.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, false));
		
		this.prompt = "> ";
		
		this.errorColor = new Color(parent.getShell().getDisplay(), 255, 0, 0);
		
		parent.pack();
	}
	
	public void loadLanguage(Dsl dsl, String xtextExtension, int port, ReplLspServer lspServer) {
		this.historyIndex = -1;
		this.tempInstruction = "";
		
		this.completions = null;
		
		this.stopLspServer();
		
		REPLInterpreter interpreter = new REPLInterpreter(
				org.eclipse.gemoc.ale.interpreted.engine.Helper.gemocDslToAleDsl(dsl),
				xtextExtension);
		
		Listener listeners[] = this.input.getListeners(SWT.Traverse);
		for (Listener listener : listeners) {
			this.input.removeListener(SWT.Traverse, listener);
		}
		this.input.addTraverseListener(new TraverseListener() {	
			@Override
			public void keyTraversed(TraverseEvent e) {
				switch (e.detail) {
					case SWT.TRAVERSE_TAB_NEXT:
					case SWT.TRAVERSE_TAB_PREVIOUS:
						e.doit = false;
				}
			}
		});
		this.output.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				Event newEvent = new Event();
				newEvent.type = SWT.KeyDown;
				newEvent.keyCode = e.keyCode;
				newEvent.character = e.character;
				input.setFocus();
				output.getDisplay().post(newEvent);
				newEvent = new Event();
				newEvent.type = SWT.KeyUp;
				newEvent.keyCode = e.keyCode;
				newEvent.character = e.character;
				output.getDisplay().post(newEvent);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
	
		listeners = this.input.getListeners(SWT.KeyUp);
		for (Listener listener : listeners) {
			this.input.removeListener(SWT.KeyUp, listener);
		}
		this.input.addKeyListener(new KeyListener() {	
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.keyCode) {
					case SWT.ARROW_UP:
						if (historyIndex == -1) {
							tempInstruction = input.getText();
						}
						if (historyIndex < interpreter.getModelHistorySize() - 1) {
							input.setText(interpreter.getModelHistory(++historyIndex));
						}
						break;
						
					case SWT.ARROW_DOWN:
						if (historyIndex > 0) {
							input.setText(interpreter.getModelHistory(--historyIndex));
						} else if (historyIndex == 0) {
							historyIndex--;
							input.setText(tempInstruction);
						}
						break;
				
					case SWT.CR:
						historyIndex = -1;
						tempInstruction = "";
						completions = null;
						String command = input.getText();
						output.append(prompt + command + "\n");
						StyleRange style = new StyleRange();
						style.start = output.getText().length();
						if (interpreter.interpret(command)) {
							String outputString = interpreter.getOutput();
							if (!outputString.equals("")) {
								output.append(interpreter.getOutput() + "\n");
							}
							style.fontStyle = SWT.ITALIC;
						} else {
							output.append(interpreter.getErrors() + "\n");
							style.fontStyle = SWT.BOLD;
							style.foreground = errorColor;
						}
						style.length = output.getText().length() - style.start;
						output.setStyleRange(style);
						ScrollBar sc = output.getVerticalBar();
						sc.setSelection(sc.getMaximum());
						input.setText("");
						break;
						
					case SWT.TAB:
						if (completions != null) {
							setCompletion();
						} else if (port != -1) {
							try {
								serverInput.print(Helper.createNotification(handler, "textDocument/didOpen",
										new DidOpenTextDocumentParams(new TextDocumentItem("inmemory:/model." + xtextExtension,
												xtextExtension, 1, input.getText()))));
								serverInput.flush();
									
								int length = Integer.parseInt(serverOutput.readLine().substring(16));
								serverOutput.readLine();
								char read[] = new char[length];
								serverOutput.read(read);
								
								serverInput.print(Helper.createRequest(handler, "textDocument/completion", new CompletionParams(
										new TextDocumentIdentifier("inmemory:/model." + xtextExtension),
										new Position(0, input.getCaretPosition()))));
								serverInput.flush();
							
								String message = serverOutput.readLine();
								length = Integer.parseInt(message.substring(16));
								message += "\r\n" + serverOutput.readLine() + "\r\n";
								read = new char[length];
								serverOutput.read(read);
								message += new String(read);
								
								Object result = Helper.createResponse(message, handler);
								if (result instanceof Either<?, ?>) {
									Either<List<CompletionItem>, CompletionList> either =
										(Either<List<CompletionItem>, CompletionList>) result;
									if (either.isLeft()) {
										completions = either.getLeft();
									} else if (either.isRight()) {
										completions = either.getRight().getItems();
									}
									completionsIndex = 0;
									beforeCompletion = input.getText();
									setCompletion();
								}
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						break;

					default:
						completions = null;
						break;
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		
		if (port != -1) {
			new Thread(() ->  {
				Display.getDefault().asyncExec(() -> this.input.setEnabled(false));
				this.lspServer = lspServer;
				this.lspServer.runServer(port);
				Display.getDefault().asyncExec(() -> {
					this.input.setEnabled(true);
					this.input.setMessage(this.prompt);
				});
			}).start();
			
			new Thread(() ->  {
				for (int i = 0; i < 5; i++) {
					try {
						this.clientSocket = new Socket("127.0.0.1", port);
						break;
					} catch (ConnectException e) {
						try {
							if (i == 4) {
								System.err.println("Unable to find a running LSP server");
							} else {
								Thread.sleep(2000);
							}
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
						break;
					}
				}
				try {
					this.serverInput = new PrintStream(this.clientSocket.getOutputStream());
					this.serverOutput = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();
			
			this.handler = Helper.createHandler(CompletionClient.class);
		} else {
			this.input.setMessage(this.prompt);
		}
	}

	@Focus
	public void setFocus() {
		this.input.setFocus();

	}

	/**
	 * This method is kept for E3 compatiblity. You can remove it if you do not
	 * mix E3 and E4 code. <br/>
	 * With E4 code you will set directly the selection in ESelectionService and
	 * you do not receive a ISelection
	 * 
	 * @param s
	 *            the selection received from JFace (E3 mode)
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ISelection s) {
		if (s==null || s.isEmpty())
			return;

		if (s instanceof IStructuredSelection) {
			IStructuredSelection iss = (IStructuredSelection) s;
			if (iss.size() == 1)
				setSelection(iss.getFirstElement());
			else
				setSelection(iss.toArray());
		}
	}

	/**
	 * This method manages the selection of your current object. In this example
	 * we listen to a single Object (even the ISelection already captured in E3
	 * mode). <br/>
	 * You should change the parameter type of your received Object to manage
	 * your specific selection
	 * 
	 * @param o
	 *            : the current object received
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object o) {

		// Remove the 2 following lines in pure E4 mode, keep them in mixed mode
		if (o instanceof ISelection) // Already captured
			return;

		// Test if label exists (inject methods are called before PostConstruct)
		//if (myLabelInView != null)
		//	myLabelInView.setText("Current single selection class is : " + o.getClass());
	}

	/**
	 * This method manages the multiple selection of your current objects. <br/>
	 * You should change the parameter type of your array of Objects to manage
	 * your specific selection
	 * 
	 * @param o
	 *            : the current array of objects received in case of multiple selection
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object[] selectedObjects) {

		// Test if label exists (inject methods are called before PostConstruct)
		//if (myLabelInView != null)
		//	myLabelInView.setText("This is a multiple selection of " + selectedObjects.length + " objects");
	}
	
	@PreDestroy
	public void destroy() {
		try {
			this.clientSocket.close();
			this.stopLspServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void setCompletion() {
		if (this.completions.size() == 0) {
			return;
		}
		CompletionItem item = this.completions.get(this.completionsIndex++);
		if (this.completionsIndex >= this.completions.size()) {
			this.completionsIndex = 0;
		}
		
		String newText = this.beforeCompletion.substring(0, item.getTextEdit().getRange().getStart().getCharacter());
		newText += item.getTextEdit().getNewText();
		newText += this.beforeCompletion.substring(item.getTextEdit().getRange().getEnd().getCharacter(),
				this.beforeCompletion.length());
		this.input.setText(newText);
		this.input.setSelection(item.getTextEdit().getRange().getStart().getCharacter()
				+ item.getTextEdit().getNewText().length());
	}
	
	private void stopLspServer() {
		if (this.lspServer != null) {
			this.lspServer.stopServer();
			this.lspServer = null;
		}
	}
}
