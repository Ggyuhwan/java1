package 연습용.sol_algorithm;

import org.w3c.dom.ls.LSOutput;

public class programmers2 {
	public static void main(String[] args) {
		
		String a = "string";
		int k = 3;
		String b = (a.repeat(k));
		
		System.out.println(b); // 문자열 곱하기 
		String c = "";
		for (int i = 0; i < k; i++) {
			c += a;
		}
		System.out.println(c);
		
		String my_string = "abc";
		StringBuffer sb = new StringBuffer();
        for (int i = 0;i < k;i++)
            sb.append(my_string);
        System.out.println(sb);
	}
	 
}
