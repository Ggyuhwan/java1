package ch08_collection;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet {

	public static void main(String[] args) {
		// 집합(Set) 중복을 허용하지 않음.
		HashSet<String> stuSet = new HashSet<String>();
		// . add값
		stuSet.add("팽수");
		stuSet.add("팽순");
		System.out.println(stuSet);
		// 중복된 값이 추가되지 않으며 에러는 안남.
		stuSet.add("팽수");
		// .size
		System.out.println(stuSet.size()); // 2
		// .contains(값) true, false
		System.out.println(stuSet.contains("팽수")); // true
		// set은 순서정보가 없음
		for (String stu : stuSet) {
			System.out.println(stu);
		}
		// Iterator 사용
		Iterator<String> itertor = stuSet.iterator();
		while (itertor.hasNext()) {
			String name = itertor.next();
			System.out.println(name);
		}

	}

}
