package ch10_extends_interface.ramen.practice;

public class Car2 implements Vehicle{

	@Override
	public void start() {
		System.out.println("슝~~");
		
	}

	@Override
	public void stop() {
		System.out.println("--");
		
	}

}
