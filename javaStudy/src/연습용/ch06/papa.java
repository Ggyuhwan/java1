package 연습용.ch06;

public class papa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="aaaaa";
		String str2="bbbbb";
		String a = "";
		
		for(int i=0; i<str1.length();i++) {
			 a+= str1.charAt(i)+str2.charAt(i);
			
		} 
		String str = String.valueOf(a);
		System.out.println(str);
		
	}

}


