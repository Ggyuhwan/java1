package ch05_control;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		// 숫자 입력받고 , 숫자가 짝수인지 홀수인지 판별하는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		scanner.close();

	}

}
