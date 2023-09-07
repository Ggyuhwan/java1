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
	        
	        double avg = getAverage(new int[] {100,80,80,100});
	        System.out.println( avg);
	        int[] numbers = {3,5,9,2,8,1,4};
	        int maxOfNumbers = getMaxAndMin(numbers)[0];
	        int minOfNumbers = getMaxAndMin(numbers)[1];
	        System.out.println(minOfNumbers);
        
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
    // 평균 구하는 메소드
    static double getAverage (int[] nums) {
    	
    	double sum = 0;
    	for(int num : nums) {
    		sum += num;
    	}return sum / nums.length;
    }
    // 자바의 메소드는 하나의 값만 반환 가능
    // 여러 값을 반환하려면 배열 또는 이후 배울 객체를 활용
    static int[] getMaxAndMin (int[] nums) {
    	int max = nums[0];
    	int min = nums[0];
    	for (int num:nums) {
    		max = max > num ? max:num;
    		min = min < num ? min:num;
    	}return new int [] {max,min};
    }
}
