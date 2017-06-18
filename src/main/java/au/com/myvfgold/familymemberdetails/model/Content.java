/**
 * 
 */
package au.com.myvfgold.familymemberdetails.model;

import java.util.List;

/**
 * @author TCS
 *
 */
public class Content {

	private List<FamilyMembers> familyMembers;

	/**
	 * @return the familyMembers
	 */
	public List<FamilyMembers> getFamilyMembers() {
		return familyMembers;
	}

	/**
	 * @param familyMembers
	 *            the familyMembers to set
	 */
	public void setFamilyMembers(List<FamilyMembers> familyMembers) {
		this.familyMembers = familyMembers;
	}

}
