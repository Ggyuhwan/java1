package practice.submit01;

public class q050505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터가
//		이동하는
//		프로그램을 구현해 봅시다.
//		1. 사용자의 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
//		2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
//		3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
//		4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit 중 하나를 입력한다.
//		@. 사용자가 엘리베이터에 탑승하고 층을 입력하면 탑승 중인 엘리베이터가 해당 층으로
//		이동하도록 만드세요.
		/*수도
		 * 1. 엘베 위치 입력
		 * 2. 현재위치를 입력받는다
		 * 3. 입력받은수 랑 A,B를 비교해서 가까운수 구하기
		 * 4. 가까운수로 엘베 이동시키기
		 * 5. 프로그램 종료 시키기*/
		int a1 = 4;
		int A = 10;
		int B = 1;
		
		System.out.println(a1-B);
		int num1 = Math.abs(a1-A);
		int num2 = Math.abs(a1-B);
	}

}
