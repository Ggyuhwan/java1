package ch12_exception;
// 사용자 정의 예외 처리
import java.text.ParseException;

public class ExceptionMain {
public static void main(String[] args) throws ParseException {
	System.out.println("메인 시작");
	int[] intArr = {1,2,3};
	try {
		System.out.println(intArr[3]);
			
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("인덱스 문제!!! 사이즈에 맞게 사용하셈!!");
		e.printStackTrace();
	}
	catch (Exception e) {
		// printStackTrace 오류 출력
		e.printStackTrace();
		System.out.println("오류났어!!!");
		System.out.println("오류 났을때 처리구간");
	}
	System.out.println("메인 종료");
	
	
	try {
		System.out.println(ExMethod.deteMillSec("2023.07.12"));
	} catch (ParseException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println(ExMethod.deteMillSec("2023.07.12"));
	try {
//		ExMethod.printName("");	
		ExMethod.printName("길");	
	} catch (BizException e) {
		System.out.println(e.getErrCode());
		System.out.println(e.getMessage());
	}
	
}
}
