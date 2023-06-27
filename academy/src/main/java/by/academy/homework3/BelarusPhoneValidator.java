package by.academy.homework3;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	private static final String PHONE_PATTERN = "\\\\+375\\\\d{9}";

	@Override
	public boolean isValid(String dateStr) {
		return Pattern.matches(PHONE_PATTERN, dateStr);
	}

}
