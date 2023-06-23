package by.academy.homework3;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class SimpleDateFormat {

	public static void main(String[] args) {
		System.out.println("write date");
		Scanner scan = new Scanner(System.in);
		String sc = scan.nextLine();

		Date date1 = new Date();

		System.out.println(date1.equals(sc));

	}

	private Object date1;
	private Object scan;
	private Object sc;

	@Override
	public int hashCode() {
		Object date1 = null;
		Object sc = null;
		Object scan = null;
		return Objects.hash(date1, sc, scan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleDateFormat other = (SimpleDateFormat) obj;
		Object date1 = null;
		Object sc = null;
		return Objects.equals(date1, other.date1) && Objects.equals(sc, other.sc) && Objects.equals(scan, other.scan);
	}

}
