package study.lang.operator;


public class Test02 {
  public static void main(String[] args) {
    byte b1 = 100;
    byte b2 = 20;

    // byte 자료형에 대한 연산 결과를 할당하는 과정에서 발생하는 문제로 인해
    // 에러가 발생합니다.
    // byte는 8비트 정수형으로 -128에서 127까지의 값을 저장할 수 있습니다.
    // 그러나 자바에서 byte 타입 변수 간의 산술 연산은 기본적으로 int 타입으로 승격됩니다.
    // 따라서 b1 + b2의 결과는 int 타입이 됩니다.

    // byte,short, char 타입 끼리의연산 결과는 int 타입으로 승격됨 따라서 값을 byte타입으로 저장하고 싶으면
    // 타입캐스팅을 해줘야 함

    byte b3 = (byte) (b1 + b2); // b1 + b2 값을 넣고 출력


    System.out.println(b3);

    int r = b1 + b2;

    char c = 20;
    short s = 30;
    short r2 = (short) (c + s);

    int i1 = 21_0000_0000;
    int i2 = 21_0000_0000;
    int i3 = i1 + i2;
    // int의 최대값인 2,147,483,647를 초과
    // 오버플로가 발생하여 음수 값인 -1981284352가 됩니다.

    System.out.println(i3);

    long r3 = i1 + i2;
    System.out.println(r3);
    // i1 + i2 연산이 먼저 int 타입으로 수행되고, 그 결과가 long 타입 변수 r3에 할당.
    // 따라서 r3에는 오버플로가 발생한 결과인 -1981284352가 그대로 저장됩니다.

    long r4 = (long) i1 + i2;
    System.out.println(r4);

    // long l1 = 22_0000_0000;
    // long타입의 값으로 표현해 주지 않으면 int값으로 간주해서
    // int의 유효범위를 벗어나기 때문에 오류


  }

}
