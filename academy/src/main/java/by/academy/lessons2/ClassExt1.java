package by.academy.lessons2;

public class ClassExt1 {

	public static void main(String[] args) {
		printlastChar(" i like java");

		endWithSing("i like java");
		printlastChar("i like java");
		chek1("i like java");
		chek2("i like java");
		chek3("i like java");
		chek4("i like java");
		chek5("i like java");
		chek6("i like java");

	}

	private static void endWithSing(String s) {
		System.out.println(s.endsWith("!!!"));

	}

	private static void printlastChar(String s) {
		System.out.println(s.charAt(s.length() - 1));

	}

	public static void chek1(String s) {
		System.out.println(s.contains("java"));

	}

	public static void chek2(String s) {
		System.out.println(s.indexOf("java"));

	}

	public static void chek3(String s) {
		System.out.println(s.replace("a", "o"));

	}

	public static void chek4(String s) {
		System.out.println(s.toUpperCase());

	}

	public static void chek5(String s) {
		System.out.println(s.toLowerCase());

	}

	public static void chek6(String s) {
		System.out.println(s.substring(0, s.length() - 4));

	}

}
//Задание 1.
//
//a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”. 
//б) Распечатать последний символ строки. Используем метод String.charAt().
//в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith(). 
//д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
//ж) Заменить все символы “а” на “о”. 
//з) Преобразуйте строку к верхнему регистру.
//и) Преобразуйте строку к нижнему регистру.
//к) Вырезать строку Java c помощью метода String.substring().