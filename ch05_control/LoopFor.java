package ch05_control;

import java.util.Iterator;
import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) throws InterruptedException {
		// 콘솔창에 1~10 까지 출력하시오!

		int num = 1;
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println("===============for===============");

		// for 문
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// for문 밖에서 쓰고 싶다면
		int one = 1;
		for (int i = 1; i < 11; i++) {
			System.out.println(one++);
		}
		System.out.println(one);
		// 1 ~ 20까지 더하기
		int sum = 0;
		// for 문을 작성해주세요
		for (int i = 1; i <= 20; i++) {
			sum += i;
			System.out.println(sum);
		}
		int sum2 = 0;
		for (int i = 21; i <= 45; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
		// 1부터 40까지중에 짝수만 더한 값을 출력하시오
		System.out.println("=========1-40 짝수 더하기===============");
		int sum3 = 0;
		// for 문과 if문을 사용해서 출력
		for (int i = 0; i <= 40; i++) {
			if (i % 2 == 0) {
				sum3 += i; // sum3 = sum3 + i
			}
		}
		System.out.println(sum3);
		int sum4 = 0;
		for (int i = 0; i <= 40; i += 2) {
			sum4 += i;

		}
		System.out.println(sum4);
		// for문을 이용해서 2단을 출력해봐
//		int sum6 =0;
//		int sum5 = 2;
//		for(int i = 1; i <=9; i++) {
//			 
//			System.out.println(sum5 * i);
//		}
//		System.out.println("===========입력받은 구구단을 출력===============");
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		
//		for(int i = 0; i <=9; i ++) {
//			int b = a*i;
//			System.out.printf(a+"x"+i+"="+b+"\n");
//		}scanner.close();
//		
//		String star = "";
//		for(int i=1; i<6; i++) {
//			star += "가";
//			System.out.println(star);
//		}
		// 10부터 1까지 출력
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		// 국수공장에서 면을 100cm 뽑고 있는데 5cm 마다 잘라줘야 합니다.
		for (int i = 0; i < 20; i++) {
			System.out.println("|||||||");
//			if (i==4||i==9||i==14) {
//				System.out.println("------------------");
//			}
			if (i % 5 == 4) {
				System.out.println("------------------");
			}
		}

		// 라면공장 면을 30 cm 뽑고 있는데
		// 6cm마다 잘라주어야 한다.
//		for(int i = 0; i <30; i++){
//			sum6= i%6;
//			
//			
//			if (i % 2== 0) {
//				System.out.println("///////");
//			}else if(i % 2 ==1) {
//				System.out.println("\\\\\\\\\\\\\\");
//			}
//			if(i%6==5) {
//				System.out.println("========");
//			}
//			Thread.sleep(400);
//		}System.out.println(sum6);
		// 해당 숫자의 각자리의 수를 더한 값을 출력하시오
		int example = 478941533;
		int result = 0;
		String strNum = example + "";
		for (int i = 0; i < strNum.length(); i++) {
			result += Integer.parseInt(strNum.substring(i, i + 1));
		}
		System.out.println("각 자리를 더한 값:" + result);

		/*
		 * break 문 반복문 내에서 break 문이 실행되면 해당 반복문을 즉시 종료!
		 */
		// 1 ~ n 까지 더한 값이 100 이상이 되는 지점의 n을 구하시오!

		int summ = 0;
		for (int i = 1; i < 9999; i++) {
			summ += i;
			if (summ >= 100) {
				System.out.println("100 이상이되는 n: " + i);
				break;
			}
		}

// 구구단 출력 2~9단
		int gu = 1;
		for (int i = 2; i <= 9; i++) {

			if ((i == 5) || (i == 8)) {
				// 반복문에서 continue를 만나면 해당 반복문의 아래 로직은
				// 건너뛰고 다음 반복으로 넘어감
				continue;
			}
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d \n", i, j, (i * j));
			}
		}

	}
}
