package ch10_extends_interface.ramen.practice;

// 인터페이스를 구현 implements
public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("부릉 부르릉");
	}

	@Override
	public void stop() {
		System.out.println("...탈....탈..탈");
	} 

}
