package practice.submit01;

import java.util.Scanner;

public class q050505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int ran = (int)(Math.random()*50+1);
//		Scanner scanner = new Scanner(System.in);
//		int chance = 5;
//		while (true) {
//			System.out.println("숫자입력");
//			int userPick = Integer.parseInt(scanner.nextLine());
//			
//			
//		}
//		scanner.close();
		for(int i = 4; i >=0; i--) {
			System.out.println("기회가"+ i +" 번 남음");
			
		}
		int elevA = 10;
		int elevB = 4;
		Scanner scanner = new Scanner(System.in);
		
		final int ACTIVE_ELEVATOR_A =1;
		final int ACTIVE_ELEVATOR_B =2;
		int active = 0;
		while (true) {
			System.out.println("\n ==============엘베 ===================\n");
			System.out.println("승강기 A위치"+ elevA);
			System.out.println("승강기  B위치"+ elevB);
			System.out.println("몇층에 계시나요? [ 종료하려면 q exit 입력]:");
			
			String inputText = scanner.nextLine();
			if(inputText.equalsIgnoreCase("q") ||
					inputText.equalsIgnoreCase("exit")){
				System.out.println("종료");
				break;
			}
			//층ㅅ구 입력
			int custFloor = Integer.parseInt(inputText);
			System.out.println(custFloor + "층에서 호출");
			int diffFloorA = (custFloor>elevA)? (custFloor - elevA)
					:(elevA -elevB);
			int diffFloorB = Math.abs(custFloor - elevB);
			//위치에 따른 엘베 이동
			//에이 승강기가 멀때
			if(diffFloorA > diffFloorB) {
			
				System.out.println("승강기 b가"+custFloor+"층으로 이동");
				elevB =custFloor;
				active = ACTIVE_ELEVATOR_B;
				//비 승강기가 더멀때	
			}else if(diffFloorA > diffFloorB) {
				System.out.println("승강기 a가"+custFloor+"층으로 이동");
				elevA =custFloor;
				active = ACTIVE_ELEVATOR_A;
			}
			//같을때
			else {
				if(elevA > elevB) {
					System.out.println("승강기 a가"+custFloor+"층으로 이동");
					elevA =custFloor;
					active = ACTIVE_ELEVATOR_A;
		}
				else {
			System.out.println("승강기 b가"+custFloor+"층으로 이동");
			elevB =custFloor;
			active = ACTIVE_ELEVATOR_B;
		}
			}
		System.out.println("어느 층으로 이동?");
		inputText = scanner.nextLine();
		int goToFloor = Integer.parseInt(inputText);
		if(active == ACTIVE_ELEVATOR_A) {
			System.out.println("승강기 a가"+ goToFloor+"층으로 이동");
			elevA = goToFloor;
		}else {
			System.out.println("승강기 b가"+ goToFloor+"층으로 이동");
			elevB = goToFloor;
		}
		
		break;
	}
	}
			
	
}
