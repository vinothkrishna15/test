package au.com.myvfgold.familymemberdetails.wrapper;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * 
 * @author TCS
 *
 *         Abstract class to initialize the application context for the
 *         respective handler class.
 * @param <I>
 * @param <O>
 */
public abstract class SpringRequestHandler<I, O> implements RequestHandler<I, O>, ApplicationContextProvider {

	@SuppressWarnings("rawtypes")
	private final RequestHandler handler;

	public SpringRequestHandler() {
		handler = getApplicationContext().getBean(RequestHandler.class);
	}

	@SuppressWarnings("unchecked")
	public O handleRequest(final I input, final Context context) {
		return (O) handler.handleRequest(input, context);
	}
}
