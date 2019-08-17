package fr.inria.diverse.ale.repl.server;

public interface ReplLspServer {
	
	void runServer(int port);
	
	void stopServer();

}
