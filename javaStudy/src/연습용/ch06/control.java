package 연습용.ch06;

public class control {
	// 전역변수
	// Class 중괄호 안에 선언된 변수
	// 해당 클래스 내 어디서든 사용가능하다.
	static String subject = "조건문";

	public static void main(String[] args) {
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int count = 0;
		for (int i = 0; i < findWally.length() - 1; i++) {
			String subWally = findWally.substring(i, i + 2);
			if (subWally.equals("월리")) {
				count += 1;
			}

		}
		System.out.println("월리는?:" + count);

	}

}