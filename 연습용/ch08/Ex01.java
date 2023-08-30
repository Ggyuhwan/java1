package 연습용.ch08;

public class Ex01 {
	public static void main(String[] args) {
		char[] yutnori = {'도','개','걸','윷','모'};
		
		int length = yutnori.length;
		
		// []안에 인덱스 정수를 넣어 접근
		// 0부터 시작
		char first = yutnori[0];
		char last = yutnori[yutnori.length -1];
		
		//초기화 블록을 사용한 선언 동시 초기화
		// 두 가지 방법 사용 가능
		char[] dirAry1 = {'동','서','남','북'};
		char[] dirAry2 = new char[] {'동','서','남','북'};
	}
}
