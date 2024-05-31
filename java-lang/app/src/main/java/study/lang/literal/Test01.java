package study.lang.literal;
// 실습

// -리터럴을 사용하여 다음과 같이 출력되게 하라
// - 출력
// 100
// 3.14
// 가
// 가나다
// true
// 기본 자료형(Primitive Data Type)의 값을 표현(Literal)하는 방법을 설명하라

public class Test01 {
    public static void main(String[] args) {
        // 정수
        byte by = 1; // 1byte
        short s = 1; // 2byte
        int a = 100; // 4byte
        long b = 100L; // 8byte
        System.out.println(a);
        // 부동소수점
        float c = 3.14f; // 4byte
        double d = 3.14; // 8byte
        System.out.println(d);

        // 문자
        char e = '가'; // 2byte
        System.out.println(e);

        // 문자열
        String f = "가나다";
        System.out.println(f);

        // 논리값
        boolean g = true; // 4byte (기본적으로 int 배열인 경우 byte)
        System.out.println(g);

        // null = 주소 없음

    }

}
