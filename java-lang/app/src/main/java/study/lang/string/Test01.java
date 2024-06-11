package study.lang.string;

public class Test01 {
  public static void main(String[] args) {
    String s;
    s = new String("aaa");

    String s2 = new String("aaa");

    System.out.println(s);
    System.out.println(s == s2); // 래퍼런스에 들어 있는 (주소)값을 비교
    // = new 새로운 메모리 주소 할당

  }
}
