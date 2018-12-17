package dobidof90.calendar;

import java.util.Scanner;

public class Prompt {

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
			cal.printCalendar(year, month);
		}
		System.out.printf("Have a nice day!\n");
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
