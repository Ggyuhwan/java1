package practice.submit01;

public class q66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] BusinessCard = {"이앞길", "010-9610-2428", "leeapgil@gmail.com"};
		System.out.println("이름\t: "+BusinessCard[0]);
		System.out.println("연락처\t: "+BusinessCard[1]);
		System.out.println("이메일\t: "+BusinessCard[2]);
		
		int a = 0;
		String name1 = "";
		String[] nameList = { "김규영", "김동현", "김상준", "김성운", "김세준", "노윤기", "박근혜", "사원기", "송현지", "신가희", "예준서", "윤가영", "윤서준",
				"이규환", "이상희", "이영규", "이재우", "이호제", "임지윤", "정민형", "조하은", "최민혁", "최성웅", };
		
		for(int i =0; i <nameList.length; i++) {
			if(nameList[i].contains("이")) {
				a += 1;
				}
			
			if(nameList[i].contains("이")) {
				name1 += nameList[i]+"씨 ";
			
			}
			
		}System.out.print("이씨 성을가진 동기분이 총"+a+"명 있습니다.\n");
		System.out.println(name1);
	}

}
