package fr.inria.diverse.ale.repl.ui.lsp4j;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.CompletionItem;
import org.eclipse.lsp4j.CompletionList;
import org.eclipse.lsp4j.CompletionParams;
import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface CompletionClient {
	
	@JsonNotification("textDocument/didOpen")
	void didOpen(DidOpenTextDocumentParams params);
	
	@JsonRequest("textDocument/completion")
	CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(CompletionParams params);
	
}
