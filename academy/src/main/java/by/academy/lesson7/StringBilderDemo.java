package by.academy.lesson7;

public class StringBilderDemo {

	public static void main(String[] args) {

		String str = "i like java";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);

		sb.append(" world");
		System.out.println(sb);

		sb.setCharAt(12, 'W');
		System.out.println(sb);

		sb.insert(0, "abc");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

	}

}
