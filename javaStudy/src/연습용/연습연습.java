package 연습용;

import java.util.ArrayList;
import java.util.Scanner;

public class 연습연습 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isrun = true;
		while( isrun) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			int hi =Integer.parseInt(scanner.nextLine());
			if(hi==1) {
				System.out.println("선택1\n예금액>10000");
				int a = 10000;
				a++;
			}else if(hi==2) {
				System.out.println("선택2\n출금액>2000");
				
			
		}else if(hi==3) {
			System.out.println("선택3\n예금액>8000");	
		}
		else if(hi == 4) {
			System.out.println("종료");
			isrun = false;
		}
		}	
	}
}
