package 연습용.ch06;

public class programmers1 {

	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
	        String answer = "";
	        for (int i=0; i<arr.length; i++) {
	        	answer += arr.hashCode();
	        }
	        
	}

}
