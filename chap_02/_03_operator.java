package chap_02;

public class _03_operator {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); // 5는 3보다 크다 true
        System.out.println(5 >= 3); // 5는 3보다 크거나 같다  true
        System.out.println(5 >= 5); // 5는 5 보다 크거나 같다 true
        System.out.println(5 >= 7); // 5는 7 보다 크거나 같다 false

        System.out.println(5 < 3); // 5는 3 보다 작다 false
        System.out.println(5 <= 3);// 5는 3 보다 작거나 같다 false

        System.out.println(5 == 5);// 5는 5와 같다 true
        System.out.println(5 == 3);// 5는 3 과 같다 false

        System.out.println(5 != 5);// 5는 5 와 같지 않다 false
        System.out.println(5 != 3);// 5는 3 과 같지않다 true


    }
}
