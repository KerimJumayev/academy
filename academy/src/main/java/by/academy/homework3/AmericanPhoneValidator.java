package by.academy.homework3;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private static final String PHONE_PATTERN = "\\\\+1\\\\d{10}";

	@Override
	public boolean isValid(String dateStr) {
		return Pattern.matches(PHONE_PATTERN, dateStr);
	}
}
