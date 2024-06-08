package study.lang.operator;


public class Test04 {
  public static void main(String[] args) {
    // 0) ()
    // 1) *, /, %
    // 2) +, -
    // 우선 순위가 같을 경우 먼저 나온 순서로 연산
    System.out.println(3 + 5 * 2);
    System.out.println(5 * 2 + 3);
    System.out.println((3 + 5) * 2);


    // 암시적 형변환 + 연산자 우선 순위
    System.out.println(3.2f + 5 / 2L);

    // 명시적 형변환 + 연산자 우선 순위
    System.out.println(3.2f + (float) 5 / 2L);
  }

}
