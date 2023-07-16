package chap_02;

public class _05_operator {
    public static void main(String[] args) {
        // 삼항 연산자
        //결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max); // 5

        int min = (x < y) ? x : y;
        System.out.println(min); // 3

        x = 3;
        y = 3;
        boolean b = (x == y) ? true : false;
        System.out.println(b); // true

        String s = (x != y) ? "같아요" : "달라요";
        System.out.println(s); // 달라요
        
        String a = (x == y) ? "같아요" : "달라요";
        System.out.println(a); // 같아요



    }
}
