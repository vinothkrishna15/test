/**
 * 
 */
package au.com.myvfgold.familymemberdetails.handler;

import java.util.Map;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import au.com.myvfgold.familymemberdetails.model.Response;
import au.com.myvfgold.familymemberdetails.service.GetFamilyMemberListService;
import au.com.myvfgold.familymemberdetails.utility.MyVfGoldException;
import au.com.myvfgold.familymemberdetails.wsdl.GetCitiesByCountryResponse;

/**
 * @author tcs
 *
 */
@Component
public class GetFamilyMemberListHandler implements RequestHandler<Map<String, Object>, Response> {

	private final GetFamilyMemberListService getFamilyMemberListService;

	/**
	 * Dependency injection is handled via autowiring!
	 */
	@Autowired
	public GetFamilyMemberListHandler(final GetFamilyMemberListService getFamilyMemberListService) {
		this.getFamilyMemberListService = Objects.requireNonNull(getFamilyMemberListService,
				"getFamilyMemberListService");
	}

	final static Logger logger = Logger.getLogger(GetFamilyMemberListHandler.class);

	/**
	 * Handle request method will be called to initiate the entitlement service
	 * request to get the details of msisdn number based on language
	 */
	public Response handleRequest(Map<String, Object> input, Context ctx) {
		//Employee emp = new Employee();
		logger.info("Entering into getEntitilementDetail method ");
		try {
			GetCitiesByCountryResponse response = getFamilyMemberListService.getEmployeeDetails(input.get("name").toString());
			
			/*if (response.getEmployee() != null) {
				emp.setName(response.getEmployee().getName());
				emp.setId(response.getEmployee().getId());
				emp.setDesignation(response.getEmployee().getDesignation());
				emp.setRole(response.getEmployee().getRole());
			}*/
			logger.info("Exiting empDetails Method of EmployeeController");
			return null;
		} catch (MyVfGoldException exception) {
			logger.error("Exception in getting getEntitlement details", exception);
		}
		return null;

	}


}
