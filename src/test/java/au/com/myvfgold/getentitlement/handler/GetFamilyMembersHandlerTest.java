package au.com.myvfgold.getentitlement.handler;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import au.com.myvfgold.familymemberdetails.MainHandler;
import au.com.myvfgold.familymemberdetails.model.Response;
import au.com.myvfgold.familymemberdetails.utility.MyVfGoldException;
import junit.framework.TestCase;

/**
 * @author Tcs
 *
 */
public class GetFamilyMembersHandlerTest extends TestCase {

	private static Map<String, Object> input;

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testGetFamiliyMemberDetailsHandler() {
		final MainHandler handler = new MainHandler();
		input = new HashMap<String, Object>();
		input.put("language", "en");
		input.put("msisdn", null);
		final Response response = handler.handleRequest(input, null);
		assertThat(response.getMessage()).isNotNull();
	}

	@SuppressWarnings("unused")
	@Ignore
	public void testGetEntitlementsThrowsException() {
		final MainHandler handler = new MainHandler();
		input = new HashMap<String, Object>();
		input.put("language", "n");
		input.put("msisdn", 6141);
		exception.expect(MyVfGoldException.class);
		final Response response = handler.handleRequest(input, null);
	}
}
