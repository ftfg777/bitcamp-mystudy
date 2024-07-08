package study.patterns.ex01;

import study.patterns.ex01.step2.Sedan;


// 2) private 생성자 + Factory Method 설계 패턴
public class Test02 {
  public static void main(String[] args) {

    Sedan s = Sedan.create("소나타");
    Sedan s2 = Sedan.create("K7");

    System.out.println(s.toString());
    System.out.println(s2.toString());

  }

}
