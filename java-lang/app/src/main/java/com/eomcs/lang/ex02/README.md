# 주석 - 일반 주석
- 코드에 대한 이해를 돕기 위해 붙이는 설명
- 컴파일할 때 무시된다. 즉 .class파일에 존재하지 않는다.

## 여러 줄 주석 (traditional comment)
- 주석의 끝 표시를 만날 때까지 주석으로 간주된다.
- 여러 줄의 설명을 붙일 때 유용하다.
```
/*
    주석 작성
*/
```

## 한 줄 주석 (end-of-line comment)
- 줄이 끝날 때 까지 주석으로 간주한다

<br>

# 주석 - Javadoc 주석
- "java document comment(doc comment)"
- javadoc에서 HTML 문서를 만들 때 사용하는 주석이다.
- 주로 API 문서를 자동 생성할 때 사용한다.
- 클래스나 메서드, 변수 선언에 붙일 수 있다.

```
/**
*   클래스에 대한 설명
*   @author ftfg777
*
*/
public class Exam0200 {}
```
```
/**
*   변수에 대한 설명
*   변수 선언 앞에 설명을 붙여 놓으면 나중에 HTML 문서를 만들 때 추출할 수 있다.
*
*/
public static String message = "Hello, world!"
```
```
/**
*   메서드에 대한 설명
*   HTML 문서를 만들 때 추출할 수 있다.
*   @param args 애플리케이션 아규먼트 값을 보관한 배열
*/
public static void main(String[] args){
    System.out.println(message);
}
```

## 실습
1) Java API Document 만들기
   - javadoc.exe 도구를 사용하여 Javadoc HTM 파일을 생성해 보기
   - javadoc
     - encoding [소스 파일의 문자집합]
     - charset [생성될 때 HTML 파일의 문자집합]
     - -d [생성된 파일을 놓아둘 디렉토리]
     - sourcepath [자바 소스 경로] [자바 패키지]
   - 예) $ javadoc -encoding UTF-8 -charset UTF-8 -d javadoc -sourcepath src/main/java com.eomcs.lang.ex02

2) Javadoc으로 생성한 HTML 문서 확인하기
   - javadoc 디렉토리를 보면 자바 소스 파일에서 추출한 Javadoc로 만든 HTML 문서를 확인할 수 있다.

<br>

# 주석 - 애노테이션 (annotation)
- 클래스, 변수(필드, 아규먼트, 로컬 변수), 메서드 선언에 붙이는 주석이다.
- 컴파일러나 JVM에서 사용할 주석이다.
- 컴파일 한 후에도 클래스 파일에 주석을 유지할 수 있다.
- 클래스 파일을 메모리에 로딩할 때 주석도 함께 로딩할 수 있다.
- 실행 중에 클래스와 함께 로딩된 주석을 추출할 수 있다.
- '프로퍼티 = 값' 형태로 값을 설정한다.
  
## 애노테이션 문법
- 작성 방법
  - @애노테이션명 (프로퍼티명=값, 프로퍼티명=값, ...)
  - 예 1) @Override
  - 예 2) @SuppressWarnings(value="deprecation")
  - 예 3) @SuppressWarnings(value={"unchecked", "deprecation"}) 