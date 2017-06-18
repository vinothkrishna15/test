/**
 * 
 */
package au.com.myvfgold.familymemberdetails.service;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import au.com.myvfgold.familymemberdetails.WebserviceTemplateExtended;
import au.com.myvfgold.familymemberdetails.wsdl.GetCitiesByCountry;
import au.com.myvfgold.familymemberdetails.wsdl.GetCitiesByCountryResponse;

/**
 * @author tcs
 *
 */

public class GetFamilyMemberListService {
	
	public GetFamilyMemberListService() {
		
	}

	final static Logger logger = Logger.getLogger(GetFamilyMemberListService.class);

	@Autowired
	WebserviceTemplateExtended templateExtended;

	/**
	 * Dependency injection is handled via autowiring!
	 */
	@Autowired
	public GetFamilyMemberListService(final WebserviceTemplateExtended templateExtended) {
		this.templateExtended = Objects.requireNonNull(templateExtended,
				"templateExtended");
	}
	
	public GetCitiesByCountryResponse getEmployeeDetails(String name) {
		GetCitiesByCountry request = new GetCitiesByCountry();
		request.setCountryName(name);
		GetCitiesByCountryResponse response = (GetCitiesByCountryResponse) templateExtended.getMarshalSupport(request);
		return response;
}
}
