package 연습용.ch08;

public class Ex0101 {
	public static void main(String[] args) {
	
	     int int1 = add(2, 3);
	        System.out.println(int1);

	        System.out.println(add(4, 5));

	        int int2 = add(add(2, 8), add(8, 2));
	        System.out.println(int2);
        
	        int int3 = add(int1, int2);
	        
	        System.out.println(int3);
	        
	    	System.out.println("\n- - - - -\n");

			System.out.println(
		            checkIfContain(
		                "Hello World",
		                "hello"
		            ) ? "포함됨" : "포함 안 됨"
		        );
			System.out.println(count);
			int count1 = getCount();
	        int count2 = getCount();
	        int count3 = getCount();
	        int count4 = getCount();
	        System.out.println(count);
        
	}

	static int add (int num1, int num2) {
        return num1 + num2;
    }
	
	static boolean checkIfContain (String text, String token) {
        return text.toLowerCase().contains(token.toLowerCase());
    }
	static int count = 0;
    
    //  매개변수 없이 값만 반환하는 메소드
    //  외부 변수 값을 변화시킴 (static이므로 static 변수만 가능)
    static int getCount () {
        System.out.println("카운트 증가");
        return ++count;
    }
}
