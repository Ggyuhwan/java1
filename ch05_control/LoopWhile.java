package ch05_control;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		// 조건이 true이면 반복 (무한루프 조심)
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		int j = 1;

		while (true) {
			System.out.println(j);
			j++;
			if (j == 10) {
				break;
			}
		}

		boolean flag = true;
		while (flag) {
			j++;
			System.out.println(j);
			if (j == 20) {
				flag = false;
			}
		}

		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("이름입력(종료 q or Q");
			System.out.println(">>>");
			String input = scanner.nextLine();
			// 대소문자 구분없이 같은 문자인지 true false
			if (input.equalsIgnoreCase("q")) {
//			if(input.equals("q") || input.equals("Q")) {
				isRun = false;

			} else {
				System.out.println(input + "님 환영합니다^^");
			}
			System.out.println("=============================");
		}

		// do-while 문
		// 최소 한번은 실행해야할때
		isRun = false;
		do {
			System.out.println("hi");
		} while (isRun);
		System.out.println("++++++++++++++++++++++++++++++++++");
		// while 구구단 출력
		// 증가값을 만들어줘야함!

		int a = 2;

		outer: while (a <= 9) {
			int b = 1;
			System.out.println(a + "단");

			while (b <= 9) {

				System.out.printf("%d x %d = %d \n", a, b, (a * b));
				b++;
				if (a == 5) {
					break;
				}
				if (a == 4) {
					break outer;
				}
			}
			a++;
		}

		// label 특정시점까지 break를 하고 싶을때
		// 단순 break는
		out1: for (int x = 0; x < 5; x++) {
			out2: for (int y = 0; y < 5; y++) {
				out3: for (int z = 0; z < 5; z++) {
					if (x * y * z > 10) {
						break out2;
					}
					System.out.println(x + " " + y + " " + z);
				}
			}
		}

	}
}
