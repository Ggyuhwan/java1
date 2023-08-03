package practice.submit01.q09;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1.스타벅스 방문|2.아카 방문|3.사무실 복귀..");
			System.out.println(">>> ");
			int command = Integer.parseInt(scanner.nextLine());
			if(command == 1) {
				break;
			}
			else if (command == 3) {
				System.out.println("사무실 복귀..");
				break;
			}
	}
	}
}
