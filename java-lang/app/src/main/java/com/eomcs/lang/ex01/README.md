# 클래스 블록과 컴파일
- 자바 컴파일러는 클래스 블록 단위로 컴파일 수행
- 클래스 블록 단위로 클래스 파일(.class) 생성
- 클래스 파일의 이름은 클래스 블록의 이름과 같음
- 한 소스 파일에 여러 개의 클래스 블록이 있을 경우 각 블록 당 한 개의 클래스 파일(.class)이 생성된다

## 실습
1) 컴파일하기
   - $javac -d bin/main -encoding UTF-8 src/main/java/com/eomcs/lang/ex01/Exam0110.java

2) 생성된 클래스 파일 확인하기
   - bin/main/com/eomcs/lang/ex01 디렉토리에 Exam0110.class파일이 생성됨

<br>

# 클래스 이름과 소스 파일 이름
- 공개 클래스의 경우 소스 파일명이 클래스 이름과 같아야 한다. 다르면 컴파일 오류 발생
- 비공개 클래스의 경우 클래스명과 소스 파일명이 일치하지 않아도 된다.

## 클래스 접근 제어
- 클래스를 선언할 때 사용 범위를 조정할 수 있다.
  - public : 다른 패키지의 클래스가 사용할 수 있게 공개
  - (default) : 같은 패키지에 소속된 클래스만 사용할 수 있다.
- 문법
  - 공개 : public class 클래스명 {...}
  - 비공개 : class 클래스명 {...}

## 클래스와 소스 파일
- 클래스의 공개 여부와 상관없이 보통 한 소스 파일에 한 클래스를 작성한다.
- 클래스명과 소스 파일명을 같게 하여 유지보수할 때 클래스를 찾기 쉽게 한다.

  
## 실습
**class Exam2_1x { } : 비공개 클래스**

1) 컴파일하기
   - $javac -d bin/main -encoding UTF-8 src/main/java/com/eomcs/lang/ex01/Exam2_1.java
  
2) 생성된 클래스 파일 확인하기
   - bin/main/com/eomcs/lang/ex01 디렉토리에 Exam2_1x.class가 생성됨

<br>

**public lass Exam2_2x { } : 공개 클래스**

1) 컴파일하기
   - $javac -d bin/main -encoding UTF-8 src/main/java/com/eomcs/lang/ex01/Exam2_2.java
   - 컴파일 오류

<br>

# 소스 파일의 인코딩 지정하기
- 컴파일 할 때 소스 파일의 문자집합(Character Set)을 지정하는 방법

## 컴파일할 때 소스 파일의 인코딩 문자집합을 지정하기
- 컴파일할 때 소스 파일의 인코딩 문자집합을 지정하지 않으면, 운영체제의 기본 문자 집합으로 저장되어 있다고 간주하고 컴파일함.
- 만약 소스 파일의 인코딩 문자집합이 운영체제의 기본 문자표와 다르다면, 컴파일 오류가 발생
> Java SE 18 버전부터는 기본 인코딩을 UTF-8 설정됨 따라서 Windows OS에서 -encoding 옵션을 붙일 필요가 없음.

## 실습
1) 컴파일하기
   - $javac -encoding [문자집합] [소스파일명]
   - 예) $javac -d bin/main -encoding UTF-8 src/main/java/com/eomcs/lang/ex01/Exam0300.java

2) 실행하기
   - java -cp bin.main com.eomcs.lang.ex01.Exam0300
   - 실행할 때 패키지 구조는 .으로 연결

<br>

# main() 메서드
- JVM을 통해 클래스를 실행하면 JVM은 그 클래스에서 main() 메서드를 찾아 실행한다.
- main()메서드가 없으면 실행 오류가 발생
- 프로그램 실행하는 시작점이라는 의미에서 "Entry point" 라 부른다.

## JVM이 클래스를 실행하는 과정
1) 실행할 클래스 파일을 CLASSPATH에 등록된 디렉토리 경로에서 찾는다

2) 클래스 파일이 유효한 바이트코드(bytecode)인지 검사한다.

3) 메모리에 바이트코드를 적재(load)한다.

4) public static void main(String[] 변수명은 상관없음) {} 블록을 찾는다.

5) main() 블록에 들어 있는 코드를 실행한다.