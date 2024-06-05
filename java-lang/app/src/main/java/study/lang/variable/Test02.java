package study.lang.variable;

// 문자 코드를 저장하는 방법
//
public class Test02 {
  public static void main(String[] args) {

    // 문자의 코드값(유니코드)이 메모리에 저장되기 때문에 숫자로 넣어도 됨

    char c0 = 44032; // 변수에 '가' 문자의 코드를 정수 값으로 저장
    char c1 = '\uAC00'; // 변수에 '가' 문자의 코드를 \ u x x x x 형태의 유니코드 표현법으로 저장
    char c2 = '가'; // 변수에 '가' 문자의 코드를 가장 쉬운 방법으로 저장
    char c3 = 0xAC00;

    System.out.println(c0);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);


  }
}
