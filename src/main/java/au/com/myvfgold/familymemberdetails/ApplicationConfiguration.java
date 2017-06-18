package au.com.myvfgold.familymemberdetails;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import au.com.myvfgold.familymemberdetails.service.GetFamilyMemberListService;

@Configuration
@ComponentScan
public class ApplicationConfiguration {

	@Bean
	public GetFamilyMemberListService getFamilyMemberListService() {
		return new GetFamilyMemberListService();
	}
	
	@Bean
	public WebserviceTemplateExtended setFamilyMemberListService(Jaxb2Marshaller marshaller) {
		WebserviceTemplateExtended client = new WebserviceTemplateExtended();
		client.setDefaultUri("http://www.webservicex.net/globalweather.asmx?WSDL");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
