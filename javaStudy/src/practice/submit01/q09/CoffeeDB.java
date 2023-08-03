package practice.submit01.q09;

import java.util.ArrayList;
import java.util.List;

public class CoffeeDB {
	private String name; //카피 브랜드
	private List<Coffee> menu; //메뉴
	
	public  CoffeeDB(String name) {
		this.name = name;
		this.menu = new ArrayList<>();
	}
	 public void addCoffee(Coffee coffee) {
	        menu.add(coffee);
	    }
	 public void printMenu() {
	        
	        for (Coffee coffee : menu) {
	            System.out.println(coffee.getName() +  " : " + coffee.getPrice() + "원");
	        }
	        System.out.println();
	    }
	

}
