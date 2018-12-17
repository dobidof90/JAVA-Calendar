package dobidof90.calendar;

import java.util.Scanner;

public class Calendar {

	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("  일    월    화    수    목    금    토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.printf("반복 횟수를 입력하세요.\n");
		int repeat = scanner.nextInt();
		System.out.printf("월을 입력하세요.\n");
		int[] month = new int[repeat];
		//for 문을 이용하여 작성한다.
//		for (int i = 0; i < repeat; i++) {
//			month[i] = scanner.nextInt();
//		}
//		for (int j = 0; j < repeat; j++) {
//			System.out.printf("%d월은 %d일까지 있습니다.\n", month[j], cal.getMaxDaysOfMonth(month[j]));
//		}
		//while 문을 이용하여 작성한다.
		int i = 0, j = 0;
		while(i < repeat) {
			month[i] = scanner.nextInt();
			i++;
		}
		while(j < repeat) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", month[j], cal.getMaxDaysOfMonth(month[j]));
			j++;
		}
		scanner.close();
	}

}
