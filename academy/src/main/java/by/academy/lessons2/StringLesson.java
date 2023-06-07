package by.academy.lessons2;

public class StringLesson {

	public static void main(String[] args) {

		String str;

		StringBuilder sb = new StringBuilder();

		sb.append("Lorem ").append("\"Ipsum is simply dummy text\"");
		System.out.println(sb);

		String result = sb.toString();
		// sb.insert(0, false);
		int startIndex = result.indexOf("is");
		int endIndex = startIndex + "is".length();
		sb.replace(startIndex, endIndex, "abc");

		System.out.println(sb);

	}

}
