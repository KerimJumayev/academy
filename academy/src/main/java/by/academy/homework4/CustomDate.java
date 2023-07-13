package by.academy.homework4;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Objects;

public class CustomDate extends DemoPrimery {

	LocalDate today = LocalDate.now();

	class Year {

		public Year() {
			super();
		}

		protected int year = today.get(ChronoField.YEAR);
		LocalDate year1 = LocalDate.of(year, year, year);

		public Year(int year) {
			this.year = year;

		}

		public void isYearLeap() {
			System.out.println(year1.isLeapYear() + " Является год високосным? ");

		}

		public void printYear() {
			System.out.println("year " + year);
		}

	}

	class Month {
		public Month() {
			super();
		}

		protected int month = today.get(ChronoField.MONTH_OF_YEAR);

		public Month(int month) {
			this.month = month;
		}

		public void printMonth() {
			System.out.println("month of the year " + month);
		}
	}

	class Day {
		public Day() {
			super();
		}

		protected int day = today.get(ChronoField.DAY_OF_MONTH);

		public Day(int day) {
			this.day = day;
		}

		public void printDay() {
			System.out.println("day of the month " + day);
		}

		public void daysBetwen() {

		}

	}

	DayOfTheWeek day1 = DayOfTheWeek.MONDAY;
	DayOfTheWeek day2 = DayOfTheWeek.THUSDAY;
	DayOfTheWeek day3 = DayOfTheWeek.WEDNESDAY;
	DayOfTheWeek day4 = DayOfTheWeek.THURSDAY;
	DayOfTheWeek day5 = DayOfTheWeek.FRIDAY;
	DayOfTheWeek day6 = DayOfTheWeek.SATURDAY;
	DayOfTheWeek day7 = DayOfTheWeek.SUNDAY;

	public void dayOfTheWeek() {
		switch (day1) {
		case MONDAY:
			System.out.println("day of the week its MONDAY");
			break;
		case THUSDAY:
			System.out.println("day of the week its THUSDAY");
			break;
		case WEDNESDAY:
			System.out.println("day of the week its WEDNESDAY");
			break;
		case THURSDAY:
			System.out.println("day of the week its THURSDAY");
			break;
		case FRIDAY:
			System.out.println("day of the week its FRIDAY");
			break;
		case SATURDAY:
			System.out.println("day of the week its SATURDAY");
			break;
		case SUNDAY:
			System.out.println("day of the week its SUNDAY");
			break;

		}
		for (DayOfTheWeek x : DayOfTheWeek.values()) {
			System.out.println(x.name() + " " + x.getDay() + " " + x.getDayOfTheWeek());
		}
	}

	/**
	 * @return the today
	 */
	public LocalDate getToday() {
		return today;
	}

	/**
	 * @param today the today to set
	 */
	public void setToday(LocalDate today) {
		this.today = today;
	}

	/**
	 * @return the day1
	 */
	public DayOfTheWeek getDay1() {
		return day1;
	}

	/**
	 * @param day1 the day1 to set
	 */
	public void setDay1(DayOfTheWeek day1) {
		this.day1 = day1;
	}

	/**
	 * @return the day2
	 */
	public DayOfTheWeek getDay2() {
		return day2;
	}

	/**
	 * @param day2 the day2 to set
	 */
	public void setDay2(DayOfTheWeek day2) {
		this.day2 = day2;
	}

	/**
	 * @return the day3
	 */
	public DayOfTheWeek getDay3() {
		return day3;
	}

	/**
	 * @param day3 the day3 to set
	 */
	public void setDay3(DayOfTheWeek day3) {
		this.day3 = day3;
	}

	/**
	 * @return the day4
	 */
	public DayOfTheWeek getDay4() {
		return day4;
	}

	/**
	 * @param day4 the day4 to set
	 */
	public void setDay4(DayOfTheWeek day4) {
		this.day4 = day4;
	}

	/**
	 * @return the day5
	 */
	public DayOfTheWeek getDay5() {
		return day5;
	}

	/**
	 * @param day5 the day5 to set
	 */
	public void setDay5(DayOfTheWeek day5) {
		this.day5 = day5;
	}

	/**
	 * @return the day6
	 */
	public DayOfTheWeek getDay6() {
		return day6;
	}

	/**
	 * @param day6 the day6 to set
	 */
	public void setDay6(DayOfTheWeek day6) {
		this.day6 = day6;
	}

	/**
	 * @return the day7
	 */
	public DayOfTheWeek getDay7() {
		return day7;
	}

	/**
	 * @param day7 the day7 to set
	 */
	public void setDay7(DayOfTheWeek day7) {
		this.day7 = day7;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day1, day2, day3, day4, day5, day6, day7, today);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomDate other = (CustomDate) obj;
		return day1 == other.day1 && day2 == other.day2 && day3 == other.day3 && day4 == other.day4
				&& day5 == other.day5 && day6 == other.day6 && day7 == other.day7 && Objects.equals(today, other.today);
	}

	@Override
	public String toString() {
		return "CustomDate [today=" + today + ", day1=" + day1 + ", day2=" + day2 + ", day3=" + day3 + ", day4=" + day4
				+ ", day5=" + day5 + ", day6=" + day6 + ", day7=" + day7 + "]";
	}

}
