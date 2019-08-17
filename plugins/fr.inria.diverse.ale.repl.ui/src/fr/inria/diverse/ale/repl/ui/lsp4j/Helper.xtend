package fr.inria.diverse.ale.repl.ui.lsp4j

import java.io.ByteArrayOutputStream
import java.util.LinkedHashMap
import java.util.Map
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod
import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler
import org.eclipse.lsp4j.jsonrpc.json.StreamMessageConsumer
import org.eclipse.lsp4j.jsonrpc.messages.RequestMessage
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints
import java.util.concurrent.atomic.AtomicInteger
import org.eclipse.lsp4j.jsonrpc.messages.NotificationMessage
import java.io.InputStream
import java.io.ByteArrayInputStream
import org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer
import org.eclipse.lsp4j.jsonrpc.messages.ResponseMessage
import org.eclipse.lsp4j.jsonrpc.MessageConsumer
import org.eclipse.lsp4j.jsonrpc.messages.Message
import org.eclipse.lsp4j.jsonrpc.MessageIssueException
import org.eclipse.lsp4j.jsonrpc.JsonRpcException
import org.eclipse.lsp4j.jsonrpc.json.MethodProvider

class Helper {	

	static final AtomicInteger nextRequestId = new AtomicInteger();	

	/**
	 * Create a JSON-RPC request
	 */
	def static String createRequest(MessageJsonHandler handler, String methodName, Object params) {		
		val ByteArrayOutputStream outputstream = new ByteArrayOutputStream(1024);
		val smc = new StreamMessageConsumer(outputstream,handler)		

		val msg = new RequestMessage()
		msg.method = methodName
		msg.params = params
		msg.id = nextRequestId.incrementAndGet()
		smc.consume(msg)		

		if(handler.methodProvider instanceof RequestRegistry) {
			(handler.methodProvider as RequestRegistry).store(msg.id, msg.method)
		}		

		return outputstream.toString
	}	

	/**
	 * Create a JSON-RPC notification
	 */
	def static String createNotification(MessageJsonHandler handler, String methodName, Object params) {		
		val ByteArrayOutputStream outputstream = new ByteArrayOutputStream(1024);
		val smc = new StreamMessageConsumer(outputstream,handler)		

		val msg = new NotificationMessage()
		msg.method = methodName
		msg.params = params
		smc.consume(msg)		

		return outputstream.toString
	} 	

	def static MessageJsonHandler createHandler(Class<?> clazz) {
		val Map<String, JsonRpcMethod> supportedMethods = new LinkedHashMap<String, JsonRpcMethod>();
		supportedMethods.putAll(ServiceEndpoints.getSupportedMethods(clazz));
		val handler = new MessageJsonHandler(supportedMethods);
		handler.methodProvider = new RequestRegistry()
		return handler
	}	

	def static Object createResponse(String message, MessageJsonHandler handler) {
		val InputStream inputstream = new ByteArrayInputStream(message.bytes);
		val smp = new StreamMessageProducer(inputstream,handler)
		val callback = new MessageConsumer {
			public Object result
			override consume(Message msg) throws MessageIssueException, JsonRpcException {
				if(msg instanceof ResponseMessage) {
					result = (msg as ResponseMessage).result
				}
			}			

		}
		smp.listen(callback)
		return callback.result
	}	

}

/**
 * Link Request to Reply 
 */
class RequestRegistry implements MethodProvider {	

	Map<String, String> idToMethod = newHashMap	

	def void store(String id, String methodName) {
		idToMethod.put(id,methodName)
	}	

	override resolveMethod(String requestId) {
		return idToMethod.get(requestId)
	}	

}