package dobidof90.calendar;

import java.util.HashMap;
import java.util.Scanner;

public class Prompt {

	public void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록             ");
		System.out.println("| 2. 일정 검색             ");
		System.out.println("| 3. 달력 보기	    ");
		System.out.println("| h. 도움말 q. 종료	");
		System.out.println("+----------------------+");
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		HashMap<String, String> map = new HashMap<String, String>();

		printMenu();
		int loop = 1;
		while (loop == 1) {
			System.out.printf("명령 (1, 2, 3, h, q)\n");
			System.out.printf("> ");
			String cmd = scanner.next();

			switch (cmd) {
			case "1":
				cmdRegister(map, scanner);
				break;
			case "2":
				cmdSearch(map, scanner);
				break;
			case "3":
				cmdCal(cal, scanner);
				break;
			case "h":
				printMenu();
				break;
			case "q":
				loop = 0;
				break;
			}
		}

		System.out.printf("Have a nice day!\n");
		scanner.close();
	}

	private void cmdCal(Calendar cal, Scanner scanner) {
		System.out.printf("연도를 입력하세요.\n");
		System.out.printf("YEAR> ");
		int year = scanner.nextInt();
		System.out.printf("월을 입력하세요.\n");
		System.out.printf("MONTH> ");
		int month = scanner.nextInt();
		cal.printCalendar(year, month);
	}

	private void cmdSearch(HashMap<String, String> map, Scanner scanner) {
		System.out.printf("[일정 검색] 날짜를 입력하세요. (0000-00-00)\n");
		System.out.printf("> ");
		String date = scanner.next();
		String plan = map.get(date);

		if (plan != null) {
			System.out.printf("1개의 일정이 있습니다.\n");
			System.out.printf("1. %s\n", plan);
		} else {
			System.out.printf("일정이 없습니다.\n");
		}
	}

	private void cmdRegister(HashMap<String, String> map, Scanner scanner) {
		System.out.printf("[일정 등록] 날짜를 입력하세요. (0000-00-00)\n");
		System.out.printf("> ");
		String date = scanner.next();

		System.out.printf("일정을 입력하세요.\n");
		System.out.printf("> ");
		String plan = scanner.next();

		map.put(date, plan);

		System.out.printf("일정이 등록되었습니다.\n");
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
