package practice.submit01;

public class q0404 {

	public static void main(String[] args) {
		
		
		//1. 5번반복
		//2. 별1, 3, 5, 7, 9
		//3. 공백4, 3, 2, 1, 0
		String star = "*";
		String blank = "";
		for(int i=0; i < 5; i++) {
			if(i > 0) {
				star += "**";
			}
			blank= "";
			for(int j =1; j<5-i; j++) {
				blank +=" ";
			}System.out.println(blank + star);
		}
		//공백이 0,1,2,3,4
		//별이 9,7,5,3,1
		blank= "";
		for(int i = 0; i < 5; i++) {
			if(i > 0) {
				blank += " ";
			}
			star="*";
			for(int j = 0; j < 4-i; j++) {
				star += "**";
			}
			System.out.println(blank+star);
		}
		System.out.println("===================================");
		//frint 사용
		int num = 5;
		for(int i=0; i<5; i++) {
			//공백
			for(int j=5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			//별
			for (int j=0; j<=2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 다이아몬드
	
		for(int i = num-2; i>=0; i--) {
			for(int j= num -i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
