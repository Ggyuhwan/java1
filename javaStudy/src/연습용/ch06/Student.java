package 연습용.ch06;

public class Student {
//필드 선언
	String company = "현대차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	Student() {
	}

	Student(String model) {
		this.model = model;
	}

	Student(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Student(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
