package ch04_Operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String aString = scanner.nextLine();
		System.out.println("국어 점수를 입력해주세요");
		int bString = scanner.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		int cString = scanner.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		int dString = scanner.nextInt();

		System.out.println("이름\t:" + aString);
		System.out.println("국어\t:" + bString);
		System.out.println("영어\t:" + cString);
		System.out.println("수학\t:" + dString);
		System.out.println("평균점수\t:" + (bString + cString + dString) / 3);

		scanner.close();

		String idBack = "1231476";
		int intNum = Integer.parseInt(idBack);
		int last = intNum / 1000000;
		String grade = (last % 2 == 1) ? ("남성") : ("여성");
		System.out.println(grade);

	}

}
