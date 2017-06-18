/**
 * 
 */
package au.com.myvfgold.familymemberdetails.validator;

import java.util.Map;

import org.springframework.http.HttpStatus;

import au.com.myvfgold.familymemberdetails.constant.CommonConstants;
import au.com.myvfgold.familymemberdetails.constant.ErrorCodes;
import au.com.myvfgold.familymemberdetails.constant.ErrorMessages;
import au.com.myvfgold.familymemberdetails.model.Response;
import au.com.myvfgold.familymemberdetails.utility.MyVfGoldException;

/**
 * @author 535143
 *
 */
public class InputFieldValidator {

	/**
	 * Method to validate the input language field to check whether its
	 * alphabets only.
	 * 
	 * @param input
	 * @return
	 */
	public boolean validateLanguageFieldFormat(Map<String, Object> input) {
		boolean check = false;
		if (!input.isEmpty() && null != input.get(CommonConstants.Language)) {
			String languageFieldValue = input.get(CommonConstants.Language).toString();
			check = languageFieldValue.matches("^[A-Za-z]+$");
		}
		return check;

	}

	/**
	 * Method to validate the input msisdn field to check whether its numeric
	 * only.
	 * 
	 * @param input
	 * @return
	 */
	public boolean validateMsisdnFieldFormat(Map<String, Object> input) {
		boolean check = false;
		if (!input.isEmpty() && null != input.get(CommonConstants.MSISDN)) {
			String languageFieldValue = input.get(CommonConstants.MSISDN).toString();
			check = languageFieldValue.matches("^[0-9]+$");
		}
		return check;

	}

	/**
	 * Method to throw the error codes and messages based on the type of error
	 * identified.
	 * 
	 * @param input
	 * @param response
	 * @param checkInputs
	 * @throws NumberFormatException
	 * @throws MyVfGoldException
	 */
	public void throwErrorBasedOnInputValidataion(Map<String, Object> input, Response response,
			InputFieldValidator checkInputs) throws NumberFormatException, MyVfGoldException {
		if (input.isEmpty()) {
			response.setCode(ErrorCodes.EMPTY_PAYLOAD_ERROR);
			response.setMessage(ErrorMessages.EMPTY_PAYLOAD_ERROR);
		} else if (!input.isEmpty() && null == input.get(CommonConstants.Language)) {
			response.setCode(ErrorCodes.LANGUAGE_FIELD_EMPTY_ERROR);
			response.setMessage(ErrorMessages.LANGUAGE_FIELD_EMPTY_ERROR);
		} else if (!checkInputs.validateLanguageFieldFormat(input)) {
			response.setCode(ErrorCodes.LANGUAGE_FORMAT_ERROR);
			response.setMessage(ErrorMessages.LANGUAGE_FORMAT_ERROR);
		} else if (!input.isEmpty() && null == input.get(CommonConstants.MSISDN)) {
			response.setCode(ErrorCodes.MSISDN_EMPTY_ERROR);
			response.setMessage(ErrorMessages.MSISDN_EMPTY_ERROR);
		} else if (!checkInputs.validateMsisdnFieldFormat(input)) {
			response.setCode(ErrorCodes.MSISDN_FORMAT_ERROR);
			response.setMessage(ErrorMessages.MSISDN_FORMAT_ERROR);
		} else {
			response.setCode(ErrorCodes.NO_DATA_AVAILABLE);
			response.setMessage(ErrorMessages.NO_DATA_AVAILABLE);
		}
		throw new MyVfGoldException(HttpStatus.NOT_FOUND, "The details for requested MSISDN is not found");
	}

}
