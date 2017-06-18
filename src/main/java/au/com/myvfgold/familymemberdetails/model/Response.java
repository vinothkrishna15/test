/**
 * 
 */
package au.com.myvfgold.familymemberdetails.model;

/**
 * @author 535143
 *
 */
public class Response {

	private String code;
	private Object message;
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public Object getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(Object message) {
		this.message = message;
	}
}
