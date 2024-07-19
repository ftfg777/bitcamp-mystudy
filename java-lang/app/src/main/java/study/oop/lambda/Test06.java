package study.oop.lambda;

import java.util.Arrays;
import java.util.List;

public class Test06 {


  // 로컬 메소드
  static class MyCalculator {
    public static int plus(int a, int b) {return a + b;}
    public static int minus(int a, int b) {return a - b;}
    public static int multiple(int a, int b) {return a * b;}
    public static int divide(int a, int b) {return a / b;}
    public static int test(int a) {return a;}
  }

  // 인스턴스 메소드
  public static class MyCalculator2 {
    public int plus(int a, int b) {return a + b;}
    public int minus(int a, int b) {return a - b;}
    public int multiple(int a, int b) {return a * b;}
    public int divide(int a, int b) {return a / b;}
    public int test(int a) {return a;}
  }

  interface Calculator {
    int compute(int x, int y);
  }

  interface Calculator2 {
    Object create();
  }

  public static void main(String[] args) {

    // 정적 메소드
    Calculator c1 = MyCalculator::plus;
    c1.compute(1, 2);

    // 인스턴스 메소드
    MyCalculator2 test = new MyCalculator2();
    Calculator c2 = test::multiple;
    c2.compute(1, 2);

    // 특정 타입 인스턴스 메소드 참조
    List<String> list = Arrays.asList("a", "b", "c");
    list.forEach(System.out::println);

    Calculator2 test2 = MyCalculator2::new;




  }
}
