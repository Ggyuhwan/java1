package practice.submit01;

import java.util.Iterator;
import java.util.Scanner;

public class q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("국어 점수를 입력해주세요");
//		int a = scanner.nextInt();
//		System.out.println("영어 점수를 입력해주세요");
//		int b = scanner.nextInt();
//		System.out.println("수학 점수를 입력해주세요");
//		int c = scanner.nextInt();
//		double d = (a+b+c)/3;
//		
//		System.out.println("평균:\t"+d);
//		if (d>=90) {
//			System.out.println("등급:\tA등급");
//		}else if (d>=80) {
//			System.out.println("등급:\tB등급");
//			}else if (d>=70) {
//				System.out.println("등급:\tC등급");
//		}else {
//			System.out.println("등급:\tD등급");
//		}
//		팩토리얼 다들 기억하시나요?
//				수학기호로 4! 는 4 팩토리얼을 의미하며,
//				그 값은 4x3x2x1 = 24 입니다.
//
//				for문을 사용해서 10팩토리얼의 값을 출력해주세요.
//				결과: 3628800
//				@ 15 팩토리얼의 값을 출력해주세요.
//				결과: 1307674368000
		int sum = 1;
		for (int i = 1; i <= 10; i++) {
			sum *= i;
			
		}System.out.println(sum);
		long sum1 = 1;
		
		for (long i = 1; i <= 15; i++) {
			sum1 *= i;
			
		}System.out.println(sum1);
		
//		월리를 찾아라!!
//		String findWally =
//		“윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월
//		리월리윌리울리윌리울리일리울리울리윌리일리”;
//		위의 문자열 변수 findWally 중에 월리가 몇개 들어있는지 콘솔에 출력해주세요.
//
//		결과: 5
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int all = findWally.length();
		int after = findWally.replaceAll("월리", "").length();
		System.out.println((all - after)/2);
		
		int count = 0;
		for(int i=0; i<findWally.length()-1; i++) {
			String subwally = findWally.substring(i,i+2);
			if(subwally.equals("월리")) {
				count +=1;
			}
		}System.out.println("월리는?:"+count);
		
		
		String star="*****";
		
		for(int i = 5; i>0; i-- ) {
			String substar = star.substring(0,i);
			System.out.println(substar);
		}
		
		for(int i =0; i < 5; i++) {
			System.out.println(star.substring(i));
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
