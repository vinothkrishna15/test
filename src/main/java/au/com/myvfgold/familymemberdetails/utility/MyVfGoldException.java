/**
 * 
 */
package au.com.myvfgold.familymemberdetails.utility;

import org.springframework.http.HttpStatus;

/**
 * @author TCS
 *
 *
 *         Custom Exception will be returned for all the services if any
 *         exception thrown.
 */
public class MyVfGoldException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message = null;
	private HttpStatus httpStatus = null;

	/**
	 * Constructor to call the parent class.
	 */
	public MyVfGoldException() {
		super();
	}

	/**
	 * Constructor overloading with message
	 * 
	 * @param message
	 *            - defined in any class as per the user requirement.
	 */
	public MyVfGoldException(String message) {
		super(message);
		this.message = message;
	}

	/**
	 * Constructor overloading with message and http status.
	 * 
	 * @param message
	 *            - defined in any class as per the user requirement.
	 * @param httpStatus
	 *            - Respective Http status based on the response.
	 * 
	 */
	public MyVfGoldException(HttpStatus httpStatus, String message) {
		super(message);
		this.message = message;
		this.httpStatus = httpStatus;
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}
