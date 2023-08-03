package 연습용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class 연습연습 {
	public static void main(String[] args) throws ParseException {
	
		ArrayList<String> students = new ArrayList<String>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(5);
		intList.add(1);
		intList.add(2);
		intList.add(4);
		System.out.println(intList);
		
		students.add("팽수");
		students.add("길동");
		students.add("동길");
		System.out.println(students);
		students.set(0,"펭퀸");
		System.out.println(students);
		System.out.println(intList.get(0));
		System.out.println(students.size());
		intList = new ArrayList<>();
		System.out.println(intList);
		students.add("김규영");
		students.add("김동현");
		students.add("김상준");
		students.add("김성운");
		students.add("김세준");
		System.out.println(students);
		for (int i= 0; i < students.size(); i++) {
			students.set(i,(i+1)+"."+students.get(i));
		}
		System.out.println(students);
		
		for (String str : students) {
			System.out.println(str);
		}
		String[] strArr = {"1","2","3"};
		for (String str : strArr) {
			System.out.println(str);
		}
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(30,23,1,44,56));
		Collections.sort(numbers);
		System.out.println(numbers);
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
		
 	}

}