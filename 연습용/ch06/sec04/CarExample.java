package 연습용.ch06.sec04;

public class CarExample {
public static void main(String[] args) {
	
	
	Car car2 = new Car ("자가용");
	System.out.println("제작회사 " + car2.company);
	System.out.println("모델명 " + car2.model);
	System.out.println("색깔 " + car2.color);
	System.out.println("최고속도 " + car2.maxspeed+"\n");
	
	Car car3 = new Car("택시","노랑",200);
	System.out.println("제작회사 " + car3.company);
	System.out.println("모델명 " + car3.model);
	System.out.println("색깔 " + car3.color);
	System.out.println("최고속도 " + car3.maxspeed+"\n");
}
}
