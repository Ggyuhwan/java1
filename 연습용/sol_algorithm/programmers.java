package 연습용.sol_algorithm;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class programmers {
	public static void main(String[] args) {
	
	String[] abc = new String[3];
	System.out.println(abc.length);
	
	abc[0] = "a";
	abc[1] = "b";
	abc[2] = "c";
	String answer = "";
	for (int i =0; i < abc.length; i++) {
		answer += abc[i];
	}
	System.out.println(answer+"1");
	System.out.println(String.join("", abc)+"2");
	StringBuilder sb = new StringBuilder();
	for(String a : abc) {
		sb.append(a);
		System.out.println(a);
	}
	System.out.println(sb+"3");
}

 
	
	 
}
