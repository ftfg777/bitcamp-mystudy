package study.lang.operator;


public class Test03 {
  public static void main(String[] args) {
    byte b = 1;
    char c = 2;
    short s = 3;
    int i = 4;
    long l = 5;
    float f = 6.0f;
    double d = 7.0;


    int r = b + c + s; // 암시적 형변환(기존변수의 타입을 바꾸는 것이 아니고 임시 변수를 생성하는 것)

    long r2 = i + l;

    // float --> long X long --> float O
    // long r3 = f;

    // 8바이트에서 4바이트로 저장되기 때문에
    // 값이 잘릴 수 있음 에러가 안 뜨기 때문에 매우 치명적임
    float f4 = l;
  }

}
