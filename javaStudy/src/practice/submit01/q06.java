package practice.submit01;

public class q06 {
	public static void main(String[] args) {
		
		//q1
		
		
		// 이름 연락처 이메일 스트링배열 입력
		// 인덱스 호출로 출력
		String [] BusinessCard = {"이앞길", "010-9610-2428", "leeapgil@gmail.com"};
		System.out.println("이름\t: "+BusinessCard[0]);
		System.out.println("연락처\t: "+BusinessCard[1]);
		System.out.println("이메일\t: "+BusinessCard[2]);
		
		//q2
		
		// 이름명단 스트링배열 입력
		// 앞글자 
		// 배열에서 성씨 찾기(.contains)
		// 찾은 성씨 카운트
		// 찾은 성씨 출력
		int a = 0;
		String[] nameList = { "김규영", "김동현", "김상준", "김성운", "김세준", "노윤기", "박근혜", "사원기", "송현지", "신가희", "예준서", "윤가영", "윤서준",
				"이규환", "이상희", "이영규", "이재우", "이호제", "임지윤", "정민형", "조하은", "최민혁", "최성웅", };
		System.out.println(nameList.length);
		for(int i =0; i <nameList.length; i++) {
			if(nameList[i].contains("이")) {
				a += 1;
				
				
		}
	}
		System.out.println(a);
	}
}

