package ch08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q.01
//		로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 오름차순으로 출력하
//		는 makeLotto() 만들어주세요 (로또 번호는 중복이 없습니다.)
		// 수도
		// 1.Set 활용
		// 2.로또번호 생성 메소드 만들기

		ArrayList<Integer> intLotto = null;
		String[] numArr = {};
		intLotto = makeLotoo(numArr);
		System.out.println(intLotto.toString());

		System.out.println(shuffleLotto());
		System.out.println(setLotto());

	}

	public static ArrayList<Integer> makeLotoo(String[] arr) {
		Random random = new Random();
		ArrayList<Integer> intLotto = new ArrayList<Integer>();
		// 랜덤한 값을 넣어준다.
		// 스트링 리스트를 정수타입으로 변환해서 넣어준다

		for (String s : arr) {
			intLotto.add(Integer.parseInt(s));
		}
		while (intLotto.size() != 6) {
			intLotto.add(random.nextInt(1, 45));

			for (int i = 0; i < intLotto.size(); i++) {
				for (int j = 0; j < intLotto.size(); j++) {
					if (i == j) {

					}
				}
			}

		}
		Collections.sort(intLotto);
		return intLotto;

	}

	public static ArrayList<Integer> shuffleLotto() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int maxNum = 45;
		for (int i = 1; i <= maxNum; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		Collections.shuffle(numbers);
		System.out.println("shuffle" + numbers);
		ArrayList<Integer> result = new ArrayList<Integer>(numbers.subList(0, 6));

		return result;

	}

	public static ArrayList<Integer> setLotto() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		while (lottoSet.size() < 6) {
			int num = (int) (Math.random() * 45 + 1);
			lottoSet.add(num);
		}
		for (Integer val : lottoSet) {
			numbers.add(val);
		}
		Collections.sort(numbers);
		return numbers;
	}

}
