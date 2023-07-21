package by.academy.lesson.Array.Task;
//4. Перепишите программу:

//Продолжить пример, добавить расчет и вывод суток 
//и недель. (месяц по желанию)

public class OperatoryTask4 {

	public static void main(String[] args) {

		int s = 370_000;
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int d;
		int day;
		int week;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour = h % 24;
		d = (h - hour) / 24;
		day = d % 7;
		week = (d - day) / 7;

		System.out.println(h + " часов " + min + " минут " + sec + " секунд " + d + " day " + week + " week");

	}

}
