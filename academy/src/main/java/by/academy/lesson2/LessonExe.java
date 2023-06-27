package by.academy.lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonExe {

	public static void main(String[] args) {

		String f = "[,.?!:]";
		Pattern pattern = Pattern.compile(f);
		Matcher m = pattern.matcher(
				"Инструмент проверки текста на орфографические и грамматические ошибки онлайн, позволит исправить самые громоздкие ошибки, с высокой степенью точности и скорости, а также улучшить свой письменный русский язык.");
		int counter = 0;
		while (m.find()) {
			counter++;
		}
		System.out.println(counter + " symbol");

	}

}

//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество!