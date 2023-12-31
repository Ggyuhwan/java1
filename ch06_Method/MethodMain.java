package ch06_Method;
// javadoc 주석 단축키 shift + alt + j

// 자동 주석 생성 설정 
// windows -> preferencs -> Java -> Code templactes -> Comments

/**
 * @파일명 ch06_Method 프로젝트명 javaStudy
 * @작성일 2023. 7. 21.
 * @작성자 202-07
 */
public class MethodMain {

	public static void main(String[] args) {
		// 메소드 클래스에 종속된 함수.
		// java 는 모두 class에 작성되기 때문에 사용되는 함수를 메소드라고 부름.
		// function 은 클래스에 독립적인 함수
		// 1 ~ 100까지 더 하면 결과는?
		// 1 ~ 50까지 더 하면 결과는?
		// 1 ~ 25까지 더 하면 결과는?
		// 30 ~ 60 까지 더하면?
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		// 메소드 호출
		printSum(1, 100);
		printSum(1, 50);
		printSum(30, 60);
		int hap = returnSum(50, 60);
		System.out.println("리턴 받음" + hap);
		print("hi");
		MakeTree(5);
		// abs 절대값을 리턴하는 메소드
		int num1 = Math.abs(-10);
		print(num1);
		print(MyAbs(-10));
	}

	/**
	 * @Method Name : printSum
	 * @작성일 : 2023. 7. 21.
	 * @작성자 : 202-07
	 * @메소드설명 :
	 * @param :from시작값,to종료값
	 * @return :from~to까지 값을 합하여 리턴
	 */
	public static void printSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.println((from + " 부터" + to + "까지 더한결과는" + sum));

	}
	// 메소드 생성
	// [접근제어자 static] 리턴타입 메소드명(파라미터){

	public static int returnSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.println((from + " 부터" + to + "까지 더한결과는" + sum));
		return sum;
	}

	public static void print(String msg) {
		System.out.println(msg);

	}

	// 메소드 오버로딩 동일한 이름 입력타입이 다른 함수로 정의할 수 있음.
	public static void print(int msg) {
		System.out.println(msg);

	}

	int num = 5;

	public static void MakeTree(int num) {
		for (int i = 0; i < 5; i++) {
			// 공백
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			// 별
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 다이아몬드

		for (int i = num - 2; i >= 0; i--) {
			for (int j = num - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static int MyAbs(int num) {
		if (num < 0) {
			num *= -1;
		}
		return num;
	}

}
