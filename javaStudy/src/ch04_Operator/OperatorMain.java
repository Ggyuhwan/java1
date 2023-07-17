package ch04_Operator;

public class OperatorMain {
	public static void main(String[] args) {
		// 연산자 Operator
		// 1. 증감 연산자
		int num = 10;
		System.out.println(num);
		num ++; //후위 증가 1
		System.out.println(num);
		num --; //후위 감소 1
		System.out.println(num);
		++ num; //전위 증가 1
		System.out.println(num);
		// 증감연산자가 앞, 뒤에 따라 실행순서가 다름.
		int a,b;
		a = num ++;
		b = ++ num ;
		System.out.printf("a: %d 는 할당 후 증가, b : %d는 증가 후 할당.", a , b);
		
		System.out.println("===========대입 연산자==============");
		num = 10;
		num += 1;
		System.out.println(num); // 11
		num -= 2;
		System.out.println(num); // 9
		num *=2;
		System.out.println(num); // 18
		num /=2;
		System.out.println(num);// 9
		// 나누기의 나머지 리턴
		num %=2;
		System.out.println(num);
		
		System.out.println("============산술 연산자===============");
		// + = * / %
		int numA = 10;
		int numB = 3;
		numA = numA +1;
		System.out.println(numA);
		System.out.printf("numA:%d numB:%d \n", numA, numB);
		System.out.println("더하기\t:" + (numA + numB));
		System.out.println("빼기\t:" + (numA - numB));
		System.out.println("곱하기\t:" + (numA * numB));
		System.out.println("나누기\t:" + (numA / numB));
		System.out.println("나머지\t:" + (numA % numB));
		
	}

}
