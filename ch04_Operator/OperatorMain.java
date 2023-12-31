package ch04_Operator;

import java.util.Scanner;

public class OperatorMain {
	public static void main(String[] args) {
		// 연산자 Operator
		// 1. 증감 연산자
		int num = 10;
		System.out.println(num);
		num++; // 후위 증가 1
		System.out.println(num);
		num--; // 후위 감소 1
		System.out.println(num);
		++num; // 전위 증가 1
		System.out.println(num);
		// 증감연산자가 앞, 뒤에 따라 실행순서가 다름.
		int a, b;
		a = num++;
		b = ++num;
		System.out.printf("a: %d 는 할당 후 증가, b : %d는 증가 후 할당.\n", a, b);

		System.out.println("===========대입 연산자==============");
		num = 10;
		num += 1;
		System.out.println(num); // 11
		num -= 2;
		System.out.println(num); // 9
		num *= 2;
		System.out.println(num); // 18
		num /= 2;
		System.out.println(num);// 9
		// 나누기의 나머지 리턴
		num %= 2;
		System.out.println(num);

		System.out.println("============산술 연산자===============");
		// + = * / %
		int numA = 10;
		int numB = 3;
		numA = numA + 1;
		System.out.println(numA);
		System.out.printf("numA:%d numB:%d \n", numA, numB);
		System.out.println("더하기\t:" + (numA + numB));
		System.out.println("빼기\t:" + (numA - numB));
		System.out.println("곱하기\t:" + (numA * numB));
		System.out.println("나누기\t:" + (numA / numB));
		System.out.println("나머지\t:" + (numA % numB));

		System.out.println("============비교 연산자===============");
		// 비교 결과에 따라 true / false 가 리턴된다.
		int numFive = 5;
		double pi = 3.14;
		int numOne = 1;

		System.out.println(numFive > numOne);
		boolean result = numFive < numOne;
		System.out.println(result);
		// 타입이 다른 숫자도 비교가능
		System.out.println(numFive >= pi);
		// == 같다 != 같지않다.
		System.out.println(numFive == pi);
		System.out.println(numFive == 5);
		// 문자에 대해서도 비교 연산이 가능
		System.out.println("가 > 나");
		System.out.println('가' < '나'); // char 데이터 타입

		String styA = "김길동";
		String styB = "홍길동";
		System.out.println("김 > 홍");
		System.out.println(styA.charAt(0) > styB.charAt(0));

		// 문자열이 서로 같은지 비교 .equals 사용
		String ship = "배"; // 문자열 리터럴 사용 String 생성 (constant pool 이라는 공간에 저장)
		String pear = "배";
		String bae = new String("배"); // new 생성자 사용하여 객체 생성시 heap 영역에 저장
		System.out.println(ship == pear); // true
		System.out.println(ship == bae); // false 저장공간이 다름
		System.out.println(ship.equals(bae)); // true 문자열 자체 비교

		// null 은 값이 없음을 의미함.
		String serverDateString = null;
		System.out.println(serverDateString != null);
		// 주소 존재함 문자열 데이터가 없음.
		String inputData = "";
		System.out.println(inputData == null);
		System.out.println(inputData.equals(""));
		System.out.println(inputData.length() == 0);
		System.out.println(inputData.isEmpty());

		System.out.println("=================삼항 연산자=================");
		String inputId = "nick1234";
		// inputId의 길이가 7 이상이면 통과, 아니면 재입력 출력
		// (a) ? (b) : (c) a의 식이 true 이면 b false 이면 c 를 리턴
		String check = (inputId.length() >= 7) ? ("통과") : ("재입력");
		System.out.println(check);
		// 이중 삼항 연산자
		// score 가 90보다 크면 grade "A" 80점 보다 크면 "B", 나머지는 C
		int score = 76;
		String grade = (score > 90) ? ("A") : ((score > 80) ? ("B") : ("C"));
		System.out.println(grade);

		// 문제 1. 사용자의 나이를 입력받아 10대, 20대, 30대...를 출력하고
		// 10대 일 경우에는 입장 불가를 출력하시오
		Scanner scanner = new Scanner(System.in);
		System.out.println("==============");
		System.out.println("나이를 입력해주세요");

		int abc = scanner.nextInt();

		// String abcString = (abc < 20) ? ("입장불가"):("입장가능");
		String abcString = (abc >= 30) ? ("30대") : ((abc >= 20) ? ("20대") : ("10대"));
		System.out.println(abcString);

		int a1 = scanner.nextInt();
		String a2 = (a1 == 20) ? ("정답입니다") : ("노답입니다");
		System.out.println(a2);
		System.out.println("========================논리 연산자================");
		// 조건 체크를 여러번 하지 않고 한번에 끝낼 수 있도록 도와줌

		int inputAge = 24;
		String inputPhone = "01096101000";
		// 나이는 14세 이상, 휴대폰 번호는 11자리 체크
		System.out.println(inputAge >= 14);
		System.out.println(inputPhone.length() == 11);
		// && and 의미 true && true 이면 true
		// || or 의 의미 둘중 하나가 true 이면 true
		System.out.println(inputAge >= 14 && inputPhone.length() == 11);

		// 사용자의 아이디를 입력받아 8자리 이상 14 자리 이하일 경우 : "사용가능한 아이디 입니다."
		// 아닐경우 :"8~ 14 자리로 입력해주세요."
		// 를 출력하시오
		System.out.println("===============");
		System.out.println("id 입력");
		String idString = scanner.nextLine();
		String idString2 = (idString.length() >= 8 && idString.length() <= 14) ? ("사용가능한아이디입니다") : ("8~14자리로 입력해주세요");
		// System.out.println(idString.length() >= 8 && idString.length() <=14 );
		System.out.println(idString2);
		String idString12 = scanner.nextLine();
		int len = idString12.length();
		System.out.printf("입력아이디: %s, 문자열길이: %d \n", idString12, len);
		String idString3 = (len >= 8 && len < 15) ? "사용가능한 아이디" : "8~14 자리로 입력하세요.";
		System.out.println(idString3);

	}

}
