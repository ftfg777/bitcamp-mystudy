package study.lang.method;

public class Test01 {
  //(리턴타입 메서드명 (파라미터, ...)) -< 메소드 시그니처 method signature
  public static void main(String[] args) {
    // 메소드 바디 method body

    m1(); //메소드 호출
    m1();
    m1();

  }

  //메소드 정의
  static void m1 () {
    System.out.println("Hello");
  }
}
