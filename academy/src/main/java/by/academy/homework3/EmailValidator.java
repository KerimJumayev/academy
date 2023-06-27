package by.academy.homework3;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	private static final String EMAIL_PATTERN = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

	@Override
	public boolean isValid(String dateStr) {
		return Pattern.matches(EMAIL_PATTERN, dateStr);
	}
}
