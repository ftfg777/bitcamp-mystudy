package study.lang.method;

public class Test09 {

  public static void main(String[] args) {
    int value = 100;

    m1(value);
    System.out.println(value);

  }

  static void m1(int n) {
    n = 200;
  }


}
