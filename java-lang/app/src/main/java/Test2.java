// 실습
// - 이 파일을 컴파일 했을 때 나온 결과를 확인하고 그 이유를 설명하라.
//
// 결과 및 해설
// 결과 : error: class X is public, should be declared in a file named X.java
// 해설 : public 클래스가 있는 경우
// -Java 컴파일러는 public를 정의하는 파일의 이름이 반드시 그 공용 클래스의 이름과 같아야 한다고 요구
// 이는 자바의 파일명 규칙 중 하나
// class 1 = public 1
// 1소스파일 = 1클래스 1.클래스를 정의한 파일을 찾기 쉽게 2.파일명과 클래스명을 같게

// public class X {
// }

// class Y {
// }

// class Z {
// }
