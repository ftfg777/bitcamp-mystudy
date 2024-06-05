package study.lang.variable;

public class Test01 {
  public static void main(String[] args) {


    byte b1 = Byte.MAX_VALUE;
    byte b2 = Byte.MIN_VALUE;
    // byte b3 = 128;
    System.out.println("byte max = " + b1);
    System.out.println("byte min = " + b2);


    short s1 = Short.MAX_VALUE;
    short s2 = Short.MIN_VALUE;
    // short s3 = 32768;

    System.out.println("short max = " + s1);
    System.out.println("short min = " + s2);


    int i1 = Integer.MAX_VALUE; // 2,147,483,648
    int i2 = Integer.MIN_VALUE; // -2,147,483,648
    // int i3 = 21_4748_3648;

    System.out.println("int max = " + i1);
    System.out.println("int min = " + i2);

    long l1 = Long.MAX_VALUE;
    long l2 = Long.MIN_VALUE;
    // long l3 = 922_3372_0368_5477_5809L;

    System.out.println("long max = " + l1);
    System.out.println("long min = " + l2);

    float f1 = Float.MAX_VALUE; // 유효숫자 약 6~7자
    float f2 = Float.MIN_NORMAL;
    // float f3 = 3.4028235E39f;

    System.out.println("float max = " + f1);
    System.out.println("float min = " + f2);

    double d1 = Double.MAX_VALUE; // 유효숫자 약 15~16자
    double d2 = Double.MIN_NORMAL;
    // double d3 = 1.7976931348623157E309; The literal 1.7976931348623157E309 of type double is out
    // of range

    System.out.println("double max = " + d1);
    System.out.println("double min = " + d2);

    System.out.println("float = " + f1);
    System.out.println("double = " + d1);

    char c1 = Character.MAX_VALUE;
    char c2 = Character.MIN_VALUE;

    System.out.println("char max = " + (int) c1);
    System.out.println("char min = " + (int) c2);


    boolean bool1 = true;
    boolean bool2 = false;

  }
}
