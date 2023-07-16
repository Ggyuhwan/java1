package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이기구 탑승 가능 여부확인 프로그램 작성

        // 조건
        // 키 120 cm 이상인 경우에만 탑승가능
        // 삼항 연산자 이용

        int a = 121;
        int b = 115;
        int c = 120;
        int yes = (a > c) ? a : c;
        System.out.println("키가 " + yes + "cm 이므로 탑승 가능합니다");
        int no = (b > c) ? c : b;
        System.out.println("키가 " + no + "cm 이므로 탑승 불가능합니다");

        boolean yes1 = (a >= c) ? true : false;
        System.out.println("120cm 이상이면 탑승가능" + yes1);
        boolean no1 = (b >= c) ? true : false;
        System.out.println("120cm 이상이면 탑승가능" + no1);

        String yes2 = (a >= c) ? "탑승가능 ": "탑승불가";
        String no2 = (b >= c) ? "탑승가능 ": "탑승불가";
        System.out.println("키가"+ a + yes2);
        System.out.println("키가"+ b + no2);

        // 모범답안

        int height = 111;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가" + height + "cm 이므로" + result);
    }
}
