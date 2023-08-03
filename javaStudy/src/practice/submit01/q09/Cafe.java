package practice.submit01.q09;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		
		CoffeeDB starbucks = new CoffeeDB("스타벅스");
		starbucks.addCoffee(new Coffee("아메리카노",  5000));
	    starbucks.addCoffee(new Coffee("카푸치노",  6000));
        starbucks.addCoffee(new Coffee("오곡라떼",  7000));
        starbucks.printMenu();
        
        CoffeeDB aka = new CoffeeDB("aka");
        aka.addCoffee(new Coffee("아메리카노", 2500));
        aka.addCoffee(new Coffee("바닐라라떼", 3000));
        aka.addCoffee(new Coffee("아이스티", 3500));
		
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1.스타벅스 방문|2.아카 방문|3.사무실 복귀..");
			System.out.println(">>> ");
			int command = Integer.parseInt(scanner.nextLine());
			if (command == 1) {
				System.out.println("안녕하세요 스타벅스 입니다.");
				starbucks.printMenu();
				command = Integer.parseInt(scanner.nextLine());
				if (command == 1) {System.out.println("아메리카노를 5000원에 구매했습니다");
					
				}else if(command == 2) {
					System.out.println("카푸치노를 6000원에 구매했습니다");
				}else if(command == 3) {
					System.out.println("오곡라떼를 7000원에 구매했습니다");
				}
			}else if (command == 2) {
				System.out.println("안녕하세요 아카 입니다.");
				aka.printMenu();
				command = Integer.parseInt(scanner.nextLine());
				if (command == 1) {System.out.println("아메리카노를 2500원에 구매했습니다");
					
				}else if(command == 2) {
					System.out.println("바닐라라떼를 3000원에 구매했습니다");
				}else if(command == 3) {
					System.out.println("아이스티를 3500원에 구매했습니다");
				}
			} 
			else if (command == 3) {
				System.out.println("사무실 복귀..");
				break;
			}
		}
	}
}
