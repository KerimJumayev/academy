package by.academy.homework4;

public enum DayOfTheWeek {

	MONDAY("MONDAY") {
		public String getDayOfTheWeek() {
			return " Day of the Week ";
		}
	},
	THUSDAY("THUSDAY") {
		public String getDayOfTheWeek() {
			return " Day of the Week ";
		}
	},
	WEDNESDAY("WEDNESDAY") {
		public String getDayOfTheWeek() {
			return " Day of the Week ";
		}
	},
	THURSDAY("THURSDAY") {
		public String getDayOfTheWeek() {
			return " Day of the Week ";
		}
	},
	FRIDAY("FRIDAY") {
		public String getDayOfTheWeek() {
			return " Day of the Week ";
		}
	},
	SATURDAY("SATURDAY") {
		public String getDayOfTheWeek() {
			return " Day of the Week ";
		}
	},
	SUNDAY("SUNDAY") {
		public String getDayOfTheWeek() {
			return " Day of the Week ";
		}
	};

	String week;

	DayOfTheWeek(String week) {
		this.week = week;
	}
	public String getDay() {
		return week;
	}

	public String getDayOfTheWeek() {
		return " Day of the Week ";
	}

};// День недели представить в виде перечисления