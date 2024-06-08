package study.lang.operator;

// 정수 연산 정수 = 정수
// 부동소수점 연산 부동소수점 = 부동소수점
// 정수 연산 부동소수점 = 부동소수점
// 부동소수점 연산 정수 = 부동소수점
// 연산은 반드시 같은 타입만 가능
// 타입이 다르면 타입을 맞춘 후 연산을 수행
// 타입을 맞추는 규칙 = 크기가 큰쪽으로 맞춤
// 예를 들어, 정수(4byte) => 부동소수점(8byte)
// 정수의 기본 = int, 부동소수점의 기본 = double
// byte,short,char,int,long -> float,double

public class Test01 {
  public static void main(String[] args) {

    // 정수의 연산
    System.out.println(5 + 2);
    System.out.println(5 - 2);
    System.out.println(5 * 2);
    System.out.println(5 / 2);
    System.out.println(5 % 2); // 정수와 정수의 연산 결과는 정수이다.

    // 부동소수점의 연산(소수점 최소 한 자리)

    System.out.println(5.0 + 2.0);
    System.out.println(5.0 - 2.0);
    System.out.println(5.0 * 2.0);
    System.out.println(5.0 / 2.0);
    System.out.println(5.0 % 2.0); // 부동소수점과 부동소수점의 연산 결과는 부동소수점이다.

    // 정수와 부동소수점의 연산 결과
    System.out.println(5 / 2.0); // 정수와 부동소수점의 연산 결과는 부동소수점이다.
    System.out.println(5.0 / 2);
  }

}
