package by.academy.lesson18;

import java.util.Arrays;

public class WrongLoginException extends Exception {

	public WrongLoginException() {
		super();
	}

	public WrongLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WrongLoginException(String message, Throwable cause) {
		super(message, cause);
	}

	public WrongLoginException(String message) {
		super(message);
	}

	public WrongLoginException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return getMessage();
	}

}
