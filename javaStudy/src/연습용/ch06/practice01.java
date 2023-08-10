package 연습용.ch06;

public class practice01 {

	public static void main(String[] args) {
		String str1 = "aaaa";
		String str2 = "bbbb";
		String answer = "";
		for(int i =0; i< str1.length(); i++) {
			answer += str1.charAt(i);
			answer += str2.charAt(i);
		}System.out.println(answer+" 1번풀이");
		String answer1 = "";
		int length = str1.length();
		String[] str1arr = str1.split("");
		String[] str2arr = str2.split("");
		for(int i= 0; i<length; i++) {
			answer1 += str1arr[i]+str2arr[i];
		}System.out.println(answer1+" 2번풀이");
		
		char[] chars1 = str1.toCharArray();// 문자열을 char 형 배열로 바꿔주는 메서드
		char[] chars2 = str2.toCharArray();
		StringBuilder sb = new StringBuilder();//StringBuilder 긴 문자열을 더할때
		for (int i =0; i<chars1.length; i++){
			sb.append(chars1[i]).append(chars2[i]);
		}System.out.println(sb+ " 3번풀이");

	}

}
