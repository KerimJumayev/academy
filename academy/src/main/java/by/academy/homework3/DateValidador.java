package by.academy.homework3;

import java.text.DateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidador implements Validator {

	private static final String DATE_PATTERN_1 = "\\d{2}/\\d{2}/\\d{4}";
	private static final String DATE_PATTERN_2 = "\\d{2}/\\d{2}/\\d{4}";
	Pattern pattern = Pattern.compile("^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$");
	Matcher matcher = pattern.matcher(DATE_PATTERN_1);
	Matcher matcher2 = pattern.matcher(DATE_PATTERN_2);

	@Override
	public boolean isValid(String dateStr) {
		String pattern = "(" + DATE_PATTERN_1 + ")|(" + DATE_PATTERN_2 + ")";
		return pattern.matches(pattern);
	}

}
