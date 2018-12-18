package dobidof90.calendar;

public class Calendar {

	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] WEEKDAY = { 0, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2 };
	private final int[] LEAP_WEEKDAY = { 0, 3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2 };

	public int firstDayOfYear(int year) {
		int a = 1;
		for (int i = 1900; i < year; i++) {
			if (isLeapYear(i)) {
				a += 2;
			} else {
				a++;
			}
		}
		return (a % 7);
	}

	public int firstDayOfMonth(int year, int month) {
		int a = firstDayOfYear(year);
		if (isLeapYear(year)) {
			for (int i = 0; i < month; i++) {
				a += LEAP_WEEKDAY[i];
			}
		} else {
			for (int i = 0; i < month; i++) {
				a += WEEKDAY[i];
			}
		}
		return (a % 7);
	}

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year))
			return LEAP_MAX_DAYS[month - 1];
		else
			return MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month) {
		System.out.printf("     <<%4d년 %3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		int maxDay = getMaxDaysOfMonth(year, month);

		int weekday = firstDayOfMonth(year, month);

		for (int i = 0; i < weekday; i++) {
			System.out.printf("   ");
		}
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if ((i + weekday) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
