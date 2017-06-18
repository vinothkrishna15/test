/**
 * 
 */
package au.com.myvfgold.familymemberdetails;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * @author TCS
 *
 */
public class WebserviceTemplateExtended extends WebServiceGatewaySupport {

	
	public Object getMarshalSupport(Object request) {
		return getWebServiceTemplate().marshalSendAndReceive(
				request, new SoapActionCallback("http://www.webservicex.com/globalweather.asmx/GetCitiesByCountry"));
		
	}
	
}
