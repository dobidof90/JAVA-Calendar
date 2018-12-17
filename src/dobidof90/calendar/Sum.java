package dobidof90.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		System.out.printf("두 수의 합은 %d 입니다.", num1 + num2);
	}

}
