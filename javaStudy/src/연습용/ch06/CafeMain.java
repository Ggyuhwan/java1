package 연습용.ch06;

import java.util.Scanner;



public class CafeMain {

	public static void main(String[] args) {
		Cafe starBucks = new Cafe("스타벅스","starbuks");
		starBucks.addCoffee(new Coffee("아메리카노",  5000));
		starBucks.addCoffee(new Coffee("카푸치노",  6000));
		starBucks.addCoffee(new Coffee("오곡라떼",  7000));
	
		 Cafe aka = new Cafe("아카","Aka");
	        aka.addCoffee(new Coffee("아메리카노", 2500));
	        aka.addCoffee(new Coffee("바닐라라떼", 3000));
	        aka.addCoffee(new Coffee("아이스티", 3500));
	        
	        Scanner scanner = new Scanner(System.in);
	    	while (true) {
				System.out.println("행동을 선택해주세요");
				System.out.println("1.스타벅스 방문|2.아카 방문|3.사무실 복귀..");
				System.out.println(">>> ");
				int select = Integer.parseInt(scanner.nextLine());
				if(select == 1) {
					System.out.println("어서오세요 스벅입니다");
					starBucks.ShowMenu();
					starBucks.buyCoffee(scanner);
				}else if(select==2) {
					System.out.println("어서오세요 아카입니다");
					aka.ShowMenu();
					aka.buyCoffee(scanner);
					
				}else {
					System.out.println("사무실 복귀...");
					break;
				}
	    	}

	}

}
