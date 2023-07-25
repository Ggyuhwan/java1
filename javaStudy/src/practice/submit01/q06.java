package practice.submit01;

public class q06 {
	public static void main(String[] args) {
		
		//q1
		
//		
//		 이름 연락처 이메일 스트링배열 입력
//		 인덱스 호출로 출력
		
		BusinessCard("이규환", "45163549", "메일.com");
		
		
		//q2
		
		// 이름명단 스트링배열 입력
		// 앞글자 
		// 배열에서 성씨 찾기(.contains)
		// 찾은 성씨 카운트
		// 찾은 성씨 출력
		
		
		
		
		String[] nameList = { "김규영", "김동현", "김상준", "김성운", "김세준", "노윤기", "박근혜", "사원기", "송현지", "신가희", "예준서", "윤가영", "윤서준",
				"이규환", "이상희", "이영규", "이재우", "이호제", "임지윤", "정민형", "조하은", "최민혁", "최성웅", };
		
		
		
		int [] intArr = {2400,456,2311,32};
		MinMax(intArr);
		
	}
	
	public static void BusinessCard(String name,String phone,String email) {
		System.out.println("이름\t:"+name);
		System.out.println("연락처\t:"+phone);
		System.out.println("이메일\t:"+email);
	}
	public static void SearchName(String first, String [] arr) {
		int count = 0;
		String nm = "";
		for(int i =0; i < arr.length; i++) {
			if(arr[i].substring(0,1).equals(first)) {
				count++;
				nm += arr[i] +" 씨 ";
			}
		}
		System.out.println(first+"씨 성을 가진 동기분은 총"+count+"명 있습니다");
		System.out.println(nm);
		System.out.println("==========================================");
		
	}
	public static void MinMax(int [] intArr) {
		int maxVal = intArr[0];
		int minVal = intArr[0];
		for(int i=1; i<intArr.length; i++) {
			if(maxVal < intArr[i]) {
				maxVal = intArr[i];
			}
			if (minVal > intArr[i]) {
				minVal = intArr[i];
				//{2400,456,2311,32};		
			}
		}
		System.out.println("최댓값:"+ maxVal);
		System.out.println("최솟값:"+ minVal);
		
	}
}

