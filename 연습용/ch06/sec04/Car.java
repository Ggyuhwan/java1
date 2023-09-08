package 연습용.ch06.sec04;

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;	
	String color;
	int maxspeed;	
	
	Car(String model){
		//20라인 생성자 호출
		this(model,"은색",250);
	}
	Car(String model, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	
}
