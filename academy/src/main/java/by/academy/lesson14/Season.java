package by.academy.lesson14;

public class Season {
	public static void main(String[] args) {

		SeasonTime sb = SeasonTime.SPRING;

		switch (sb) {
		case SPRING:
			System.out.println(" i like spring");
			break;

		}
		switch (sb) {
		case AUTUMN:
			System.out.println(" i like atumun");
			break;

		}
		switch (sb) {
		case SUMMER:
			System.out.println(" i like summer");
			break;

		}
		switch (sb) {
		case WINTER:
			System.out.println(" i like winter");
			break;

		}
		for (SeasonTime sb1 : SeasonTime.values()) {
			System.out.println(sb1.name());
		}

	}

}
