package ch09_class.typing;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingMain {
	public static void main(String[] args) {
		int num;
		if(args.length > 0) {
			num = Integer.parseInt(args[0]);
	}else {
		num = Dictionary.OPTION_RANDOM_ALPHABET;
	}
		System.out.println(num);
		Scanner scanner = new Scanner(System.in);
		ArrayList<String>wordList = Dictionary.makeArrayList(num);
		
		// 시작 시간 저장 1970년 1월 1일 기준으로 경과된 시간
		// 현재까지 경과된 시간을 밀리초 단위로 리턴(1초 1000밀리초)
		long before = System.currentTimeMillis();
		while (true) {
			int randIdx = (int)Math.random()* (wordList.size());
			// 단어배열에서 랜덤하게 단어 출력
			System.out.println(wordList.get(randIdx));
			System.out.println(">>> ");
			String input = scanner.nextLine();
			//문제 단어와 입력단어가 일치하면
			if(wordList.get(randIdx).equals(input)) {
				wordList.remove(randIdx); //삭제
			}
			//단어가 없으면 종료
			if(wordList.size()==0) {
				break;
			}
		}
		long after = System.currentTimeMillis();
		long diff = after - before ; // 소요시간계산
		double result = diff / 1000.0; // 밀리초 이기때문에 일반 초로
		System.out.println(result + "초 걸리셨습니다.");
	}
}
