package 연습용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class 연습연습 {
	public static void main(String[] args) throws ParseException {
	
	
//		String [] data = {"팽수","길수","수잔","수촨","길동","동길","호섭"};
//		int cnt =0;
//		for(int i = 0 ; i <data.length; i++) {
//			if(data[i].indexOf("수") >= 0) {
//				cnt++;
//			}
//		}
		String [] data = {"팽수","길수","또치","희동"};
		int cnt = 0;
		for(int i =0; i<data.length;i++) {
			if(data[i].indexOf("수") >= 0){
				cnt++;
			}
		}System.out.println(cnt);
		int [][][] arr3 = {{{1,2,3,},{1,2}},{{5,5},{8,9}},{{5,5},{8,9}}};
		System.out.println(arr3[2][1][1]);
		// 아래 배열에서 짝수의 개수 카운팅
//		int [] arr = {1,2,3,4,5,6,7,8,9};
//		int count = 0;
//		for(int num : arr) {
//			if(num % 2==0) {
//				count++;
//			}
//		}
		int[]arr = {1,2,3,4,5,6,7,87,};
		int count = 0;
		for(int sum : arr) {
			if(sum % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		int a = 0;
		String aa= "";
		for(int i= 0; i<=5;i++) {
			  aa += "*";
			 
			 System.out.println(aa);	
		}
 	}

}