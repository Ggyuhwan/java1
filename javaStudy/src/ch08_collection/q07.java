package ch08_collection;

import java.util.ArrayList;
import java.util.Random;

public class q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q.01
//		로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 오름차순으로 출력하
//		는 makeLotto() 만들어주세요 (로또 번호는 중복이 없습니다.)
		//수도
		//1.Set 활용
		//2.로또번호 생성 메소드 만들기
		
		
		ArrayList<Integer> weekLotto = null ;
		weekLotto = ran();
		
		
		
		
	
		
	
	}
	public static ArrayList<Integer> ran() {
	ArrayList<Integer> intList = new ArrayList<Integer>();
	Random random = new Random();
	
	
	for(int i = 0; i <6; i++) {
		intList.add = (random.nextInt(1,45));
		System.out.println(intList);
	}
	}

}
