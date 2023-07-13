package by.academy.homework4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class DemoPrimery {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		LocalDate today = LocalDate.now();

		int year = today.get(ChronoField.YEAR);
		int day = today.get(ChronoField.DAY_OF_MONTH);

		System.out.println("year " + year);
		System.out.println("day " + day);

		LocalDate data1 = LocalDate.of(2024, 7, 1);
		LocalDate data2 = LocalDate.of(2024, 7, 10);

		long daysOfBetween = ChronoUnit.DAYS.between(data1, data2);

		System.out.println("dayto  " + data1);
		System.out.println("dayto2  " + data2);

		System.out.println("------------------------------");

		int inclusiveDays = 0;
		long finaldaysOfBetween = daysOfBetween + inclusiveDays;

		System.out.println("Количество дней между датами:-----" + finaldaysOfBetween);
		System.out.println(data1.isLeapYear() + "являеться весокостным годом? " + finaldaysOfBetween);

		System.out.println("----------------------------");

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss", Locale.US);//Один из конструкторов - строка в формате dd-mm-yyyy, добавить статический метод-валидацию для этой строки. 
																										
		LocalDateTime localDateTime1 = LocalDateTime.of(2024, 2, 3, 4, 5, 6);
		System.out.println(localDateTime1);
		String stringDate1 = localDateTime1.format(formatter1);
		System.out.println(stringDate1);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		LocalDate localDateTime2 = LocalDate.of(2024, 07, 04);
		System.out.println(localDateTime2);
		String stringDate2 = localDateTime2.format(formatter2);
		System.out.println(stringDate2);

		LocalDateTime dateTime = LocalDateTime.parse("July 04, 2024 12:00:00", DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss"));
		LocalDate date = LocalDate.parse("July 04, 2024", DateTimeFormatter.ofPattern("MMMM dd, yyyy"));

		System.out.println(dateTime);
		System.out.println(date);

	}

}
