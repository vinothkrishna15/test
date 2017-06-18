/**
 * 
 */
package au.com.myvfgold.familymemberdetails;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import au.com.myvfgold.familymemberdetails.model.Response;
import au.com.myvfgold.familymemberdetails.wrapper.SpringRequestHandler;


/**
 * @author Tcs
 * 
 *         Main handler to initialize the Application context for injecting
 *         spring dependency for AWS lambda services
 *
 */
public class MainHandler extends SpringRequestHandler<Map<String, Object>, Response> {

	private static final ApplicationContext context = new AnnotationConfigApplicationContext(
			ApplicationConfiguration.class);

	/**
	 * Returns the application context for the defined bean from application
	 * configuration class.
	 */
	public ApplicationContext getApplicationContext() {
		return context;
	}
}
