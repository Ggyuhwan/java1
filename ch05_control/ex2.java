package ch05_control;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// 메뉴를 입력받아 가격을 출력하는 프로그램 작성
		// (아아는 호칭이 2개)

		// 아아 or 아이스아메리카노 : 3000
		// 라뗴 : 4500
		// 에스프레소 : 2500
		// 위에 메뉴로 입력하면 "입력메뉴"는 000원 입니다. 출력

		// 위에 메뉴가 아닌 메뉴는
		// "입력메뉴" 메뉴는 저희 매장에 없습니다. 출력

		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴를 주문 하세요");
		System.out.println(">>>");
		String aString = scanner.next();

//		int salePrice = 3000;
//		if (aString == "아아" || aString == "아이스아메리카노") {
//			int ab =3000;
//			System.out.println(aString);
//		}else {
//			System.out.println("아아아");
//		}

		switch (aString) {
		case "아아":

		case "아이스아메리카노":
			System.out.println("입력메뉴 는 3000원 입니다");
			break;
		case "라떼":
			System.out.println("입력메뉴 는 4500원 입니다");
			break;
		case "에스프레소":
			System.out.println("입력메뉴 는 2500원 입니다");
			break;
		default:
			System.out.println("입력메뉴 는 저희 매장에 없습니다");
		}

	}
}
