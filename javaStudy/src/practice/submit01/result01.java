package practice.submit01;

public class result01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// q.01본인의 이름과 나이, 키, 연락처, 이메일을 각각 타입에 맞는 변수에 저장한 후 아래와 같이
//		콘솔창에 출력해주세요.
//
//		변수명: name, age, height, phone, email 사용
//		키는 소수 첫번째자리를 포함
		String name= "이규환";
		int age = 28;
		float height = 171.2f; 
		long phone = 45163549L;
		String email= "rbghks4677@naver.com" ;
		
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("키\t: " + height);
		System.out.println("번호\t: " + phone);
		System.out.println("이메일\t: " + email);
		
		// q.02
		String  enigms ="너오구늘리뭐너먹구지리";
		System.out.println(enigms.replace("너",""));
		System.out.println(enigms.replaceAll("[너,구]",""));
		System.out.println(enigms.replaceAll("[너,구,리]",""));
		
		
		
		// q.03
		int example = 278;
		int a = example %10;
		int b =example/10 %10;
		int c =example/100;
		
		System.out.println(a+b+c);
		
		
	}

}
