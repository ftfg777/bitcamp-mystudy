package study.lang.method;

public class Test02 {

  public static void main(String[] args) {

    m1("정찬우", 19);
    m1("임꺽정", 12);
    m1("유관순", 13);



  }

  static void m1(String name, int age) {
    System.out.printf("%s(%d)님 반갑습니다\n", name, age);
  }

}
