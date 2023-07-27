package ch09_class.commons;
import java.util.Iterator;
// 프로젝트에서 공통으로 사용하는 유용한 메소드를 보통 commons 라는 패키지로 관리
public class UtilClass {
	/** shift + alt + j
	 * @Method Name : weRound
	 * @작성일		: 2023. 7. 27.
	 * @작성자		: 규환
	 * @메소드설명		: 입력한 소수를 반올림하여 소수 n 번쨰 자리로 리턴해주는 메서드.
	 * @param		: num 반올림하고자 하는 소수
	 * @param		: 소수 n번째 자리까지 리턴
	 * @return		: 반올림된 소수를 리턴
	 */
	public static double weRound(double num, int n) {
		// 10의 n 제곱 구하기
		int ten =1;
		for (int i = 0; i< n ; i++) {
			ten *= 10;
		}
		num *= ten;
		long temp = Math.round(num);
		double result = (double) temp / ten;
		return result;	
	}
	

public static void name(String[] args) {
	System.out.println(weRound(75.123456,2));
}
}
