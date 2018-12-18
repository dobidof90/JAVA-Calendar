package dobidof90.calendar;

import java.util.Scanner;

public class Prompt {
	//String으로 입력받은 WEEKDAY 정보를 int 타입으로 변경하는 함수를 따로 만들어준다.
	public int parseDay(String str_weekday) {
		int weekday = 0;
		switch (str_weekday) {
		case "SU":
			weekday = 0;
			break;
		case "MO":
			weekday = 1;
			break;
		case "TU":
			weekday = 2;
			break;
		case "WE":
			weekday = 3;
			break;
		case "TH":
			weekday = 4;
			break;
		case "FR":
			weekday = 5;
			break;
		case "SA":
			weekday = 6;
			break;
		}
		return weekday;
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.printf("연도를 입력하세요.\n");
			System.out.printf("YEAR> ");
			int year = scanner.nextInt();
			System.out.printf("월을 입력하세요.\n");
			System.out.printf("MONTH> ");
			int month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12 || month < 1) {
				continue;
			}
			System.out.printf("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)\n");
			System.out.printf("WEEKDAY> ");
			String str_weekday = scanner.next();
			int weekday = parseDay(str_weekday);
			cal.printCalendar(year, month, weekday);
		}
		System.out.printf("Have a nice day!\n");
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
