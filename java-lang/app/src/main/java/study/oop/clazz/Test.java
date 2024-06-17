package study.oop.clazz;

public class Test {

  static void m1(int a) {
    int b;
    b= 200;

  }
  void m2(int a) {
    int b;
    b=300;
  }

}

class TestOk{
  public static void main(String[] args) {
    Test.m1(1);

    Test m2 = new Test();
    m2.m2(2);


  }
}

