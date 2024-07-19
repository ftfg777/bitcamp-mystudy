package study.oop.lambda;

public class Test04 {

  interface InterestCalculator{
    double compute(int money);
  }

  // 1) 일반 클래스 (로컬 클래스의 특징 이용 안함)
  static InterestCalculator create1(double rate) {
    class My implements InterestCalculator{
      double rate;

      public My(double rate) {
        this.rate = rate;
      }

      @Override
      public double compute(int money) {
        return money + (money * rate);
      }
    }
    return new My(rate);
  }

  // 1) 일반 클래스 (로컬 클래스의 특징 이용)
  static InterestCalculator create2(double rate) {
    class My implements InterestCalculator{
      @Override
      public double compute(int money) {
        return money + (money * rate);
      }
    }
    return new My();
  }

  // 3) 익명 클래스
  static InterestCalculator create3(double rate) {
    InterestCalculator c = new InterestCalculator(){
      @Override
      public double compute(int money) {
        return money + (money * rate);
      }
    };
    return c;
  }

  // 4) 익명 클래스 (직접 대입)
  static InterestCalculator create4(double rate) {
    return new InterestCalculator(){
      @Override
      public double compute(int money) {
        return money + (money * rate);
      }
    };
  }

  // 5) 람다
  static InterestCalculator create5(double rate) {
    InterestCalculator c = money ->  money + (money * rate);
    return c;
  }

  // 6) 람다 (직접 대입)
  static InterestCalculator create6(double rate) {
    return money ->  money + (money * rate);
  }


  // 1) 일반 로컬 특징 x
  static InterestCalculator newCreate1(double rate) {
    class C implements InterestCalculator{
      double rate;
      public C(double rate) {
        this.rate = rate;
      }
      @Override
      public double compute(int money) {
        return money + (money *rate);
      }
    }
    return new C(rate);
  }

  // 2) 일반 로컬 특징 o
  static InterestCalculator newCreate2(double rate) {
    class C implements InterestCalculator{
      @Override
      public double compute(int money) {
        return money + (money *rate);
      }
    }
    return new C();
  }

  // 3) 익명
  static InterestCalculator newCreate3(double rate) {
    InterestCalculator i = new InterestCalculator() {
      @Override
      public double compute(int money) {
        return money + (money * rate);
      }
    };
    return i;
  }

  // 4) 익명 직접 대입
  static InterestCalculator newCreate4(double rate) {
    return new InterestCalculator() {
      @Override
      public double compute(int money) {
        return money + (money * rate);
      }
    };
  }

  // 5) 람다
  static InterestCalculator newCreate5(double rate) {
    InterestCalculator c1 = money -> money + (money * rate);
    return c1;
  }

  // 6) 람다 직접 대입
  static InterestCalculator newCreate6(double rate) {
    return money -> money + (money * rate);
  }



  public static void main(String[] args) {
    InterestCalculator c1 = create1(0.035);

    System.out.println(c1.compute(1000_0000));
    System.out.println(create2(0.035).compute(1000_0000));
    System.out.println(create3(0.035).compute(1000_0000));
    System.out.println(create4(0.035).compute(1000_0000));
    System.out.println(create5(0.035).compute(1000_0000));
    System.out.println(create6(0.035).compute(1000_0000));



  }
}
