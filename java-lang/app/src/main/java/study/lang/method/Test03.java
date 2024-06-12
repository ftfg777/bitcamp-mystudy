package study.lang.method;

public class Test03 {

  public static void main(String[] args) {

    m1();
    String name = m1();
    System.out.println(name);
  }

  static String m1() {
    return "홍길동님 안녕!!";
  }

}
