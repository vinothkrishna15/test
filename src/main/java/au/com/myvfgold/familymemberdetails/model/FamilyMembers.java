/**
 * 
 */
package au.com.myvfgold.familymemberdetails.model;

import java.io.Serializable;

/**
 * @author TCS
 *
 */
public class FamilyMembers implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int msisdn;
    private String message;
    private String avatarUrl;
	/**
	 * @return the msisdn
	 */
	public int getMsisdn() {
		return msisdn;
	}
	/**
	 * @param msisdn the msisdn to set
	 */
	public void setMsisdn(int msisdn) {
		this.msisdn = msisdn;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the avatarUrl
	 */
	public String getAvatarUrl() {
		return avatarUrl;
	}
	/**
	 * @param avatarUrl the avatarUrl to set
	 */
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
    
	   
	
}
