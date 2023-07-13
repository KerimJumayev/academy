package by.academy.lesson18;

import java.util.regex.Pattern;

public class ExceptionDemo extends Exception {

	// Password должен содержать только латинские буквы, цифры и знак подчеркивания.
	// Длина password должна быть меньше 20 символов.
	// Также password и confirmPassword должны быть равны.
	// Если password не соответствует этим требованиям, необходимо выбросить
	// WrongPasswordException.

	// WrongPasswordException и WrongLoginException - пользовательские классы
	// исключения с двумя конструкторами – один по умолчанию,
	// второй принимает сообщение исключения и передает его в конструктор класса
	// Exception. Обработка исключений проводится внутри метода.
	// Используем multi-catch block. Метод возвращает true, если значения верны или
	// false в другом случае. (Задание с урока)

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		try {
			registretion("login", "password", "password");
		} catch (WrongLoginException | WrongPasswordException e) {
			e.printStackTrace();
		}

	}

	public static void registretion(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {

		if (login.length() > 20 || !Pattern.matches("[A-Za-z0-9_]+", login)) {

			throw new WrongLoginException(" login wrong ");
		}
		if (password.length() > 20 || !Pattern.matches("[A-Za-z0-9_]+", password)) {

			throw new WrongPasswordException("password wrong ");
		}

		if (!password.equals(confirmPassword)) {

			throw new WrongPasswordException("wrong password");
		}

		
	}

}
