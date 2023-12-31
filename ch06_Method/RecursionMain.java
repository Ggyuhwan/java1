package ch06_Method;

public class RecursionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func(3);

		long no = factorial(4);
		System.out.println(no);
		no = recFactorial(6);
		System.out.println(no);

	}

	public static void Func(int num) {
		if (num == 0) {
			return;
		} else {
			System.out.println("hi");
			// 자신을 호출
			Func(num - 1);
		}

	}

	public static long recFactorial(int num) {
		if (num == 1) {
			return 1;
		}
		// 3을넣었다면
		// 3 * recFactorial(2)
		// 3 * 2 * recFactorial (1)...
		return num * recFactorial(num - 1);
	}

	public static long factorial(int num) {
		long sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}

}
