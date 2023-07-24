package 연습용;

public class _04_ParameterAndReturn {

	
	public static int getPower(int number) {
		int result = number * number;
		return result;
		
	}

	public static int getPowerByExp(int number, int exponent) {
		int result =1;
		for (int i =0; i <exponent;i++) {
			result *= number;
		}
		return result;
	}

	public static void main(String[] args) {
		// 전달값과 반환값이 있는 메소드
		int reVal = getPower(2);
		System.out.println(reVal);
		
		reVal = getPower(3);
		System.out.println(reVal);

		
		reVal = getPowerByExp(3, 3);
		System.out.println(reVal);
		
		
		System.out.println(getPowerByExp(2, 4));
	}

}
