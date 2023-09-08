package 연습용.ch06.sec04;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student("그랜졀","검정",250);
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println(s1.model +"= "+s1.color + "최고 속도는" + s1.speed);
		
		Student s2 = new Student("싼타페","롸잇트",250);
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		System.out.println(s2.model + s2.speed);
	}
}
