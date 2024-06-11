package study.lang.string;

public class Test02 {
  public static void main(String[] args) {
    String s = "aaa";
    String s2 = "aaa";


    System.out.println(s);
    System.out.println(s == s2); // 래퍼런스에 들어 있는 (주소)값을 비교
    // 같은 문자들을 가진 인스턴스가 있다면 기존 인스턴스의 주소를 리턴한다

  }
}
