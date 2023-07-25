package 연습용;

import java.util.Scanner;

public class 연습연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	MyMath mm = new MyMath();
	long result1 = mm.add(5L,3L);
	long result2 = mm.subtract(2, 1);
	long result3 = mm.max(14,25);
	System.out.println(result3);
	System.out.println(result1);
	System.out.println(result2);
	
	}

}
class MyMath{
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	long max(long a, long b){
		
		return a > b ? a : b;
	}
	long subtract(long a, long b) {return a - b;}
	long multply(long a, long b) {return a * b;}
	Double subtract(Double a, Double b) {return a / b;}
	
}