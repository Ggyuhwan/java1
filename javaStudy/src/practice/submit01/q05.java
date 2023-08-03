package practice.submit01;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q. 01
//		1~50 사이의 랜덤한 수를 5번 안에 맞춰야하는 업다운 게임을 만들어보세요.
//		실행 시 1~50 사이의 랜덤한 수가 생성되며, 사용자가 입력한 숫자에 대해 업, 다운을
//		알려준다.
//		5번의 기회 동안 사용자가 정답을 맞추지 못한다면 "실패하였습니다" 문구 출력 후
//		프로그램이 종료, 사용자가 정답을 맞춘다면 "정답입니다" 문구 출력 후 프로그램이
//		종료된다.
//		실행 결과 예시
		/*
		 * 수도 1. 1~50 까지의 랜덤함수 호출 2. 사용자 입력 숫자 받기 3. 반복문 5번 돌리기 4. 5번안에 맞추면 정답 아니면 실패 5.
		 * if문으로 작성
		 */

		Random random = new Random();
		int ran = random.nextInt(1, 50);
		Scanner scanner = new Scanner(System.in);
		System.out.println("업다운 게임!! 1~50까지 입력해보세요");

		int i = 4;

		while (i >= 0) {
			int a = scanner.nextInt();
			System.out.println("기회가" + i + "번남았습니다");
			i--;
			System.out.println(ran);
			if (ran == a) {

				System.out.println("정답입니다");

				break;
			}
			if (ran > a) {
				System.out.println("업!!");
			} else if (ran < a) {
				System.out.println("다운!!");
			}

		}
//		Q. 02
//		엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터가
//		이동하는
//		프로그램을 구현해 봅시다.
//		1. 사용자의 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
//		2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
//		3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
//		4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit 중 하나를 입력한다.
//		@. 사용자가 엘리베이터에 탑승하고 층을 입력하면 탑승 중인 엘리베이터가 해당 층으로
//		이동하도록 만드세요.
		/*
		 * 수도 1. 엘베 위치 입력 2. 현재위치를 입력받는다 3. 입력받은수 랑 A,B를 비교해서 가까운수 구하기 4. 가까운수로 엘베 이동시키기
		 * 5. 프로그램 종료 시키기
		 */
		int a1 = 4;
		int A = 10;
		int B = 1;

		System.out.println(a1 - B);
		int num1 = Math.abs(a1 - A);
		int num2 = Math.abs(a1 - B);
	}
}
