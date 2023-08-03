package ch11_java_api;

import java.util.Calendar;

public class Mon_Fri {

	public static void main(String[] args) {
		// 월 ~ 금 까지 출력하는 메서드를 만들어보세요
		// input : 년,월
		// Mon Tue Wed Thu Fri
		makeCalendar(2023, 8);
	}
	
	public static void makeCalendar(int year, int month) {
		
	
	Calendar calendar = Calendar.getInstance();
	
	calendar.set(year,month-1,1);
	System.out.println(calendar.getTime());
	int startDay = calendar.get(Calendar.DAY_OF_WEEK);
	int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	int currentDay =1;
	System.out.println(year + "년" + month + "월 달력");
	System.out.println("Mon\tTue\tWen\tThu\tFri");
	for(int i=2; i <42; i++) {
		if(i < startDay) {
			System.out.print("\t");
		}else {
			if(!(i%7==1||i%7==0)) {
				System.out.printf("%d\t", currentDay);
			}else {
				System.err.printf("", currentDay);
			}
			currentDay++;
			
			if(currentDay > lastDay) {
				break;
			}
		}
		if( i % 7 ==0) {
			System.out.println();
		}
	}
	System.out.println();
	
	}
}
