package ch05_control;

import java.util.Scanner;

public class q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		룰렛을 아주 힘차게 돌렸더니 5834도가 돌아갔다고 합니다.
//		한바퀴는 당연히 360도 겠죠?
//		그렇다면 룰렛이 멈추고난 각도에 대한 경품이 뭔지 출력을 해주시고, 총 몇바퀴
//		돌아갔는지도 출력해주세요.
//		경품 조건
//		0도 이상 ~ 60도 미만: 사탕
//		60도 이상 ~ 120도 미만: 초콜릿
//		120도 이상 ~ 180도 미만: 쿠키
//		180도 이상 ~ 240도 미만: 콜라
//		240도 이상 ~ 300도 미만: 아이스크림
//		300도 이상 ~ 360도 미만: 커피
		int a = 360;
		int i = 1;
		int d = 5834;
		System.out.println(d / a);
		System.out.println(d % a);
		int k = d % a;
		if (k < 60) {
			System.out.println("사탕");
		} else if (60 <= k && k < 120) {
			System.out.println("초콜릿");
		} else if (120 <= k && k < 180) {
			System.out.println("쿠키");
		} else if (180 <= k && k < 240) {
			System.out.println("콜라");
		} else if (240 <= k && k < 300) {
			System.out.println("아이스크림");
		} else
			System.out.println("커피");

//		for(i = 1; i <= 17; i++) {
//			int a1 =a*i;
//			System.out.println(a1);
//			int c= a1-5834;
//			System.out.println(c);
//		}

		while (true) {
			int c = a * i;
			System.out.println(i + "바퀴" + c);
			i++;

			if (5760 <= c) {
				System.out.println("바퀴수 :" + (i - 1));
				System.out.println();

				break;
			}
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("거꾸로 할 단어를 입력해주세요:");
		String input = scanner.nextLine();
		String bb = input;
		String aa = "";
		for (int j = bb.length() - 1; j >= 0; j--) {
			aa = aa + bb.charAt(j);
		}
		System.out.println(aa);

	}

}
