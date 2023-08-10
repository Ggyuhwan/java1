package 연습용.ch06;

import java.util.Iterator;

public class programmers {
	public static void main(String[] args) {
	 System.out.println(solution("기억니은", "가나다라"));
}


	 public static String solution(String str1, String str2) {
	        String answer = "";
	        for(int i=0; i<str1.length(); i++) {
	        	answer+= str1.substring(i,i+1);
	        	answer+= str2.substring(i,i+1);
	        }
	        return answer;
}
}
