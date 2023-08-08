package 연습용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class 연습연습 {
	public static void main(String[] args) throws ParseException {
	HashMap<String, Integer> coinMap = new HashMap<String, Integer>();
	HashMap<String, String> stuMap = new HashMap<String, String>();
	stuMap.put("첫째", "길동");
	stuMap.put("둘째", "몽길");
	stuMap.put("셋째", "홍길동");
	
	System.out.println(stuMap);
	coinMap.put("비트코인", 36000000);
	coinMap.put("이더리움", 10000000);
	System.out.println(coinMap.get("비트코인"));
	System.out.println(coinMap.size());
	
 	}

}