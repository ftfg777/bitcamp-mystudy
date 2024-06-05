# bitcamp-mystudy
***
[5월 27일 (월) : GIT소개 / 웹 애플리케이션 구동 원리 / CPU, 기계어, OS의 관계 이해](#5월-27일-월)   
[5월 28일 (화) : 컴파일, 인터프리터, 하이브리드 방식 / JAVA 컴파일 및 실행 원리](#5월-28일-화)   
[5월 29일 (수) : JAVA컴파일과 실행 / 프로젝트 디렉토리 구조 / 빌드 도구](#5월-29일-수) <br>
[5월 30일 (목) : Bytecode로 프로그래밍하기 / 자바 기초 프로그래밍](#5월-30일-목) <br>
[5월 31일 (금) : 패키지 / 데이터 타입과 리터럴 / 문자와 문자집합](#5월-31일-금) <br>
[6월 3일 (월) : 문자와 문자집합 정수,부동소수점을 메모리에 저장하는 원리 ](#6월-3일-월)
[6월 4일 (화) : 변수 선언 의미와 방법 / 저장 값의 유효 범위 / Eclipse IDE 프로젝트 임포트 방법 ](#6월-4일-화)
[6월 5일 (수) : 실습 프로젝트 준비 / 인텔리제이 설치 및 설정 ](#6월-5일-수)




## 5월 27일 (월)
##### Git 이란?
형상관리 시스템 (Software Configuration Management) = 버전관리시스템 

Version = 변경에 대해 부여한 구분 번호 = (식별자)

저장소 = repository = Repo 

[저장소 가져오기]
- $ git clone https://github.com/사용자이름/리포지토리이름

[백업할 파일 저장]
- $ git add 파일이름 || . (.모든 파일)

[백업파일 목록에 등록된 파일 저장소에 저장]
- $ git commit -m "커밋메시지"

[서버 저장소에 업로드]
- $ git push

[서버저장소의 변경내용 가져오기]
- $ git pull

>커맨드 작성 시 현재 위치 확인 잘하기 👍

<br>

##### 웹 애플리케이션 구동 원리
    1. 웹 브라우저에서 사용자가 데이터 요청

    2. 웹 서버는 데이터 요청 수신
            * 정적 파일인 경우 웹서버에서 직접 응답
            -> HTML, CSS 등 변경되지 않는 파일

    3. 동적 파일인 경우 애플리케이션(APP) 서버로 전달
            ->사용자의 요청에 따라 실시간으로 생성되는 파일(user_id=123)

    4. APP 서버에서 비즈니스 로직 처리 -> 필요한 경우 데이터베이스 요청

    5. 데이터베이스에서 데이터 처리 후 반환

    6. APP 서버에서 웹 서버로 응답 전달

    7. 웹 서버에서 사용자에게 응답 전송 -> 사용자 브라우저 응답 수신 -> 페이지 렌더링 및 인터페이스 갱신

##### CPU, 기계어, OS의 관계 이해
프로그램 실행 과정

        1. 소스 코드 작성
        개발자가 고수준 프로그래밍 언어(C, Java 등)로 프로그램 작성
        소스 코드 → 고수준 프로그래밍 언어 파일
        
        2. 컴파일
        컴파일러가 소스 코드를 기계어 또는 바이트코드로 변환
        소스 코드 → 기계어/바이트코드
        
        3. 실행 파일 생성
        컴파일된 기계어 코드가 실행 파일로 저장
        기계어 코드 → 실행 파일
        
        4. 프로그램 실행 요청
        사용자가 프로그램 실행을 요청
        사용자 요청 → 운영 체제


기계어는 CPU의 아키텍처에 종속적임 (OS마다 실행파일 양식이 다르기 때문에)
         * 하나의 기계어로 서로 다른 OS에 사용할 수 없음
         * 하나의 컴파일러로 서로 다른 OS에 사용할 수 없음
         * 같은 OS의 컴파일러라도 CPU가 다르면 사용할 수 없음
    

  **마이그레이션**: 시스템 간 데이터나 애플리케이션을 이동하는 과정.



  **옵티마이징**: 시스템의 성능을 최적화하는 과정. 주요 영역은 코드, 데이터베이스, 서버 최적화.
  


  **커스터마이징**: 특정 요구사항에 맞게 시스템이나 소프트웨어를 수정하는 작업.


**LTS**: "Long-Term Support"의 약자로, 장기 지원 버전을 의미 소프트웨어의 LTS 버전은 일반 버전보다 더 오랜 기간 동안 업데이트와 보안 패치가 제공되는 버전 
>안전성을 위해 기업이 주로 사용함


***

## 5월 28일 (화)
##### 컴파일러, 인터프리터, 하이브리드 방식
컴파일, 인터프리터, 하이브리드 방식은 프로그래밍 언어의 소스 코드를 기계어로 변환하여 실행하는 방법을 말함
<br>
1. 컴파일 방식 (Compiler) 
   프로그램의 소스 코드를 한 번에 기계어로 변환하여 실행 파일을 생성하는 방식   
   단점 : OS 별로 컴파일 해야 함
   예시: C, C++, Rust, Go 등
   <br>
   
2. 인터프리터 방식 (Interpreter)
   소스 코드를 한 줄씩 읽어 해석하고 실행하는 방식
   예시: Python, Ruby, JavaScript 등
   단점 : 실행할 때 마다 소스파일이 있어야 함 (소스 파일 공개됨)
         실행할 때 마다 문법 검사 -> 실행 속도 느림
         실행하기 전에는 문법오류를 알 수 없음
   <br>   

3. 하이브리드 방식 (Hybrid)
   컴파일러와 인터프리터 방식을 결합한 것.
   소스 코드를 ***중간 단계*** 의 바이트코드로 컴파일하고, 이를 인터프리터 또는 JIT 컴파일러가 실행
   장점 : 한 번만 컴파일 하면 여러 OS에서 실행할 수 있음
   예시: Java, C#, Python(PyPy), JavaScript(Node.js)

   <br>

##### JAVA 컴파일 및 실행 원리
JAVA는 JAVA컴파일러에 의해 바이트 코드(중간 코드)로 컴파일 됨

바이트 코드의 특징
**1. 플랫폼 독립성** 
        특정 운영 체제나 하드웨어에 종속되지 않으며, Java 가상 머신(JVM)이 있는 어떤 플랫폼에서도 실행될 수 있음

**2. 중간 코드**
        바이트코드는 기계어가 아니며, JVM이 해석하거나 JIT 컴파일러를 통해 기계어로 변환됨.


***

## 5월 29일 (수)
##### JAVA 컴파일과 실행
*컴파일
        javac 소스파일명 => Hello.class 파일 생성

##### 윈도우에서 컴파일할 때 문자집합(charset) 오류가 발생하는 이유
        윈도우 시스템 기본 인코딩과 소스 파일 인코딩의 불일치
Ex) 
vscode에서 소스 파일 저장(vscode는 UTF-8형식으로 문자를 저장함) -> 윈도우는 os의 기본 문자집합을 사용 즉 소스 파일이 MS949 규칙에 따라 저장되었을 거라 착각 -> 컴파일 오류 발생

<br>

##### charset 오류 해결 방법
* javac -encoding UTF-8 Hello.java
-> 소스파일이 어떤 규칙에 따라 문자를 저장했는지 알려주는 옵션
<br>

##### 컴파일 결과 파일을 둘 폴더 지정
* javac -d bin Hello.java
  -> 현재 위치에 존재하는 bin 폴더에 class파일 생성 폴더가 없으면 폴더 생성 후 저장
<br>

##### 실행할 class파일 위치 알리기
* java -classpath(cp) bin Hello 
  -> "실행할 클래스파일이 bin에 있는데 이름은 Hello야"


***
##### 프로젝트 디렉토리 구조
* 소스파일 폴더와 컴파일 결과 파일 분리 = 소스가 분리되어 배포하기 편해짐
* src/*.java = 소스파일
* bin/*.class = 컴파일 결과 파일
##### 개발 관리와 프로젝트, 디렉토리

        App1 -> 프로젝트A -> Project A - src, bin
  
        App2 -> 프로젝트B -> Project B - src, bin

##### GIT 저장소와 프로젝트 폴더
* case1.
              하나의 저장소에 여러 프로젝트 존재 (수업 방식)
              버전은 저장소 단위로 관리되기 때문에 프로젝트 단위로 관리할 경우 좋지않은 방식

<br>

* case2.
              하나의 저장소에 메인 프로젝트와 메인 프로젝트를 위해 존재하는 여러 서브 프로젝트 존재

<br>

* case3.
              하나의 저장소에 하나의 프로젝트 1:1
        
<br>

##### Gradle project 디렉토리 구조
        myapp <- root project 디렉토리
        myapp/app <- main project
                app/src/
                app/build.gradle <- main프로젝트의 빌드 명세서
        myapp/gradle
                gradle/wrapper <- gradle이 설치 안된 경우 자동으로 설치해주는 도구
                gradle/libs.versions.toml <-의존 라이브러리 버전 정보
        myapp/gitattributes <- GIT 보조 설정 확인
        myapp/gitignore <- GIT ignore
        myapp/gradlew <- gradlew이 로컬 컴퓨터에 설치가 안된경우 사용할 수 있는 도구 (윈도우용)
        myapp/gradle.bet <- 유/리눅스용
        myapp/setting.gradle <- gradle 메인 설정

<br>

##### maven 표준 프로젝트 디렉토리로 구성하기
- gradle init


***
##### 빌드 도구
- 빌드의 개념 (소스파일 -> 애플리케이션 변환 과정)
                
        1. 소스파일 
                -> 기능 구현을 위한 소스 코드

        2. 컴파일 
                -> 컴퓨터가 이해할 수 있는 중간 형식(어셈블리, 기계어, 바이트)으로 변환 **이 단계에서 오류를 찾음**
        
        3. 링크 
                -> 컴파일된 오브젝트 파일(라이브러리, 외부 종속성)들을 하나로 결합하는 과정 링커(Linker)가 사용됨 
        
        4. 테스트
                -> 빌드된 프로그램 테스트 (품질 보증)
        
        5. 패키징
                -> 빌드된 실행 파일을 패키지로 묶거나 배포를 위한 준비
                -> Java 프로젝트 -> Java Archive파일로 패키지 (.jar)
        
        6. 배포

<br>

##### 빌드 도구 소개

        1. ant
                - build.xml

        2. maven
                - pom.xml
                - 의존 라이브러리 관리
                - 의존 라이브러리 저장소에서 빌드할 때 다운로드(.jar)
                  *jar -> java archive
                        자바 실행과 관련된 파일들을 한 파일로 압축한 것 war, ear, tar

        3. gradle
                - build.gradle
                - 빌드 과정을 정교하게 제어할 수 있도록 프로그래밍 언어를 사용하여 빌드스크립트 파일 작성
                - Groovy, kotlin
                - maven 저장소(의존 라이브러리 저장소) 사용


***

## 5월 30일 (목)

##### Bytecode로 프로그래밍하기
- hello world 출력하기
- 참고사이트 : https://medium.com/@davethomas_9528/writing-hello-world-in-java-byte-code-34f75428e0ad
        **자바가 힘들 때 바이트 코드를 보고 기운내자 :baby_bottle:**
<br>

##### 자바 기초 프로그래밍
Test.java 파일에 A, B, C라는 3개의 클래스가 있다고 가정할 때 Test.java파일을 컴파일 하면 A, B, C **3개의 클래스 파일이 생성**됨

> 자바의 컴파일러(javac)는 소스파일의 각 클래스를 개별적인 클래스 파일로 컴파일함


<br>

##### public 클래스와 소스 파일명
1. Test2.java
   
        public class x {}
        class Y {}
        class Z {}

        [컴파일 오류]
        public 클래스가 있는 경우 소스파일명은 public클래스명과 같아야 한다.

2. X.java
   
        public class X {}
        public class Y {}
        
        [컴파일 오류]
        public 클래스 x가 소스파일명과 일치하지만 y도 public 클래스이기 때문에
        
        **1개의 class 파일엔 1개의 public class**

* 1 소스파일엔 1 클래스블록이 좋다
* 클래스를 정의한 파일을 찾기 쉽다
* 파일명과 클래스명을 같게한다

<br>

##### 애플리케이션 entry point: main() 메서드
entry point = 프로그램 시작점

컴파일된 클래스 파일을 실행할 때 JVM은 클래스의 main()메소드를 찾아서 실행한다 main메소드가 없다면 실행 오류 발생

<br>

##### 애플리케이션 아규먼트 다루는 방법: main(String[] args)

public static void main(String[] args){ 
        
        //파라미터 args의 변수명은 변경돼도 상관없음
}


>애플리케이션 아규먼트(argument) = 전달 하는 값(인자)

>파라미터 = 아규먼트 즉 인자값을 전달 받는 변수

java -classpath - Test5 [aaa bbb ccc] 
aaa bbb ccc가 애플리케이션 아규먼트

 args[0] = aaa

 args[1] = bbb

 args[2] = ccc

***

## 5월 31일 (금)

##### 패키지
- package : 클래스를 분류(역할에 따라)하는 문법
 
- bitcamp-mystudy/java-lang/app/src/main/java/study/lang/literal
  
        - bitcamp-mystudy = git 저장소
        - java-lang = project 폴더
        - app = main project
        - src/main/java = 소스 폴더
        - study = 패키지
        - lang = 패키지
        - literal = 패키지

- 컴파일 <br>
        - javac -d app/build/classes/java/main app/src/main/java/study/lang/literal/Test01.java
  
        - 컴파일 결과를 둘 위치 옵션에 패키지 명을 지정하지 않아도 패키지 구조대로 생성됨

- 실행 <br>
        - java -cp app/build/classes/java/main study.lang.literal.Test01

        - 컴파일과 다르게 클래스 파일을 실행할 땐 패키지는 .으로 연결

> 실습할 때 클래스 파일 위치와 패키지 구조를 한 번에 묶어서 쳐버리는 바람에 계속 클래스를 찾을 수 없다는 오류가 떠서 당황.. 꼭 기억하자 :cursing_face:

<br>

##### 주석 (comment)
* 코드 설명: 코드의 목적이나 동작을 설명하는 데 사용
* 디버깅: 특정 코드를 임시로 비활성화하여 디버깅할 때 사용
* 문서화: Javadoc 도구를 사용하여 자동으로 API 문서를 생성할 때 사용

##### javadoc

문서 주석은 /**로 시작하여 */로 끝남

Javadoc 도구를 사용하여 자동으로 문서화를 생성할 때 사용문서 주석은 클래스, 메서드, 필드 등에 설명을 추가하는 데 유용함

```
/**
 * 이 클래스는 주석 예제를 보여줍니다.
 */
public class CommentExample {

    /**
     * 이 메서드는 프로그램의 진입점입니다.
     * @param args 커맨드 라인 인수
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    /**
     * 두 숫자를 더합니다.
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return 두 숫자의 합
     */
    public int add(int a, int b) {
        return a + b;
    }
}
```
> API문서란?
> App programming 할 때 사용하는 클래스나 메소드의 사용 설명서

##### Javadoc 도구 사용 예제

* javadoc -encoding UTF-8 -charset UTF-8 -d docs -sourcepath app/src/main/java com.eomcs.lang.ex02

위의 문서 주석을 사용하여 Javadoc 도구를 실행하면 자동으로 HTML 형식의 API 문서가 생성


##### Annotation

* 컴파일러나 JVM에게 전달하는 특별한 정보
  

##### 데이터 타입과 리터럴
* Literal : 값을 표현한 것
* 정수
   * byte (1) 
   * short (2)  
   * int (4)
   * long (8) : 100L, 100l
* 부동소수점
   * float (4) : 3.14f, 3.14F
   * double (8)
* 문자
   * char (2)
* 논리
   * boolen (int, byte) : true, false
      * 일반적으로 int type, 배열의 경우 byte type을 가짐
* 문자열
   * String

<br>

##### 정수의 지수 표기

        정수의 지수 표기법은 주로 과학이나 공학에서 큰 숫자나 작은 숫자를 간결하게 표현하기 위해 사용

예를 들어, 100이라는 숫자를 다양한 진수로 표현하면 다음과 같다 :

10진수: 100

16진수: 0x64

8진수: 0144

2진수: 0b1100100

##### 부동소수점의 지수 표기법

        부동소수점 숫자는 매우 큰 숫자나 매우 작은 숫자를 표현할 때 사용

지수 표기법은 aEb 형식으로, 이는 
𝑎
×
1
0
𝑏
a×10 
b
 를 의미합니다.

예를 들어, 다음과 같은 형태로 부동소수점을 표현
```
public class Example {
    public static void main(String[] args) {
        double num1 = 1.23e3;  // 1.23 * 10^3 = 1230.0
        double num2 = 1.23E3;  // 1.23 * 10^3 = 1230.0
        double num3 = 1.23e-3; // 1.23 * 10^-3 = 0.00123

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
    }
}
```
위의 예제에서 1.23e3은 1.23 * 10^3을, 1.23e-3은 1.23 * 10^-3을 의미

<br>

## 6월-3일-월

##### 윈도우와 유/리눅스의 엔터 구분
* 윈도우: CR+LF (꼭 **한쌍**으로 와야 줄바꿈으로 인식)
* 유,리눅스: LF

> CR (Carriage Return): 줄의 시작으로 커서를 이동시키는 제어 문자

> LF (Line Feed): 현재 위치에서 다음 줄로 이동하는 제어 문자

<br>

##### 문자집합

##### ISO-8859-1, 2...
- ASCII 128자 (7bit) + 128자(1bit)
- -번호에 따라 지원하는 나라가 다름
  - 예를 들면 
  - ISO-8859-1 = 서유럽 국가 언어 지원
  - ISO-8859-2 = 중부 및 동부 유럽 국가 언어 지원
  
<br>

##### EUC-KR 완성형(16bit)
한글 코드표 참조: https://aknot.tistory.com/38<br>
- 가
  - 2진수 변환: 1011 0000 1010 0001
  - 코드: 0xB0A1
- 각
  - 2진수 변환: 1011 0000 1010 0010
  - 코드: 0xB0A2
- 간
  - 2진수 변환: 1011 0000 1010 0011
  - 코드: 0xB0A3

문제점
-
EUC-KR은 2,350개의 한글을 지원함. 이는 현대 한국어에서 자주 사용되는 문자 대부분을 포함하지만, 완전하지 않아서 **일부 한글 음절과 한자는 표현할 수 없는** 문제가 있음
EX) 똠똡똣 같은 언어


<br>

##### 조합형(2byte) <= 아래아한글
한글 코드표 참조: https://yunhyeon.tistory.com/183 <br>
초성(5bit), 중성(5bit), 종성(5bit)

* 각 5비트씩 할당 후 해당 문자에 맞는 코드값을 2진수로 변환  
* 15비트 앞에 최상위 비트 1을 더하여 2바이트(byte)를 완성
* 16진수 변환 시 최상위 비트부터 4비트씩 자르기
* 값이 없을 시 채움
  
예를 들면
- 가 
  - 2진수 변환 => ㄱ(00010) ㅏ(00011) 채움(00001)
  - 최상위 비트1 더하기 => 1000 1000 0110 0001
  - 16진수 변환 => 0x8861

- 나 
  - 2진수 변환 => ㄴ(00100) ㅏ(00011) 채움(00001)
  - 최상위 비트1 더하기 => 1001 0000 0110 0001
  - 16진수 변환 => 0x9061

- 걶 
  - 2진수 변환 => ㄱ(00010) ㅓ(00111) ㄴㅎ(00111)
  - 최상위 비트1 더하기 => 1000 1000 1110 0111
  - 16진수 변환 => 0x88E7

> 16bit의 절반을 한글이 사용해서 다른 나라의 언어를 수용하지 못함 => 국제 표준이 되지 못함

<br>

##### MS949(2byte)
- 한국어를 보다 잘 지원하기 위해 EUC-KR을 확장한 인코딩 방식
- EUC-KR(2,350자) + a = 11172자
- EUC-KR에서 표현하지 못한 문자들이 표현됨 EX)똠똡똣
- CP949라고도 칭함
- 국제 표준X


##### unicode(32bit)
  - 국제 표준
  - 자바에서 문자를 다룰 때 사용 = utf16
  - 한글, 영어 모두 2byte 사용
  - 유니코드 범위: U+0000에서 U+10FFFF까지
    - 0000 0000/1(0001) 0(0000)/F(1111) F(1111)/F(1111) F(1111)
    - 실제 최대 21비트 사용


##### utf-8 (Unicode Transformation Format) - 8bit
  - UCS : unicode
  - 웹서버와 웹 브라우저가 주고 받는 인코딩

> UTF-8 인코딩 패턴
- 한 바이트 문자 (ASCII 문자):
  - ASCII 문자의 범위인 U+0000부터 U+007F까지는 1바이트로 인코딩
  - 인코딩 패턴: 0xxxxxxx
여기서 'x'는 실제 코드 포인트를 2진수로 변환했을 때 생성되는 비트를 나타냅니다.
  - A (65) = 1000001 = 01000001


- 두 바이트 문자:
  - 범위: U+0080부터 U+07FF까지
  - 인코딩 패턴: 110xxxxx 10xxxxxx


- 세 바이트 문자:
  - 범위: U+0800부터 U+FFFF까지
  - 인코딩 패턴: 1110 xxxx 10xx xxxx 10xx xxxx
  - 가 (AC00) = 1010 1100 0000 0000
  - = 1110 1010 1011 0000 1000 0000

- 네 바이트 문자:
  - 범위: U+10000부터 U+10FFFF까지
  - 인코딩 패턴: 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx


##### 인코딩/디코딩
  - a값 -> b값으로 변환 인코딩 / 원상태로 되돌리기 디코딩
  - 암호화 -> 인크립션 / 복호화 - 디크립션


##### 숫자를 메모리에 저장

- sign-magnitude
  - 부동소수점에서 가수부를 저장할 때 사용 
  - 정수를 저장할 때 2의보수
  - 음수는 1의 보수를 취하고 +1
  - 자바에서 정수는 2의 보수
  
- Excess-K
  - bias 값을 더해서 저장

- 부동소수점을 메모리에 저장 (floging-point)
  - IEEE-754 명세에 따라 변환

- 문자는 문자집합 규칙에 따라 2진수로 변환 -> 메모리에 저장
- 정수는 2의 보수 규칙에 따라 2진수로 변환 -> 메모리에 저장
- 부동소수점은 IEEE-754 규칙에 따라서 2진수로 변환 -> 메모리에 저장
- 값을 2진수화가 가능하면 메모리에 저장할 수 있음


## 6월 4일 (화)

- 변수
  - 데이터를 저장하는 메모리
  - 변수 선언 = 메모리를 준비시키는 명령문
  - 메모리타입(데이터타입) 메모리명(변수명);
  - 메모리명 =(대입연산자) 값
  
- Data type
  - Primitive(기본) Data Type
    - 정수
      - byte(1)
      - short(2)
      - int(4)
      - long(8)
    - 부동 소수점
      - float(4)
      - double(8)
    - 논리
      - boolean(4(int),1(byte))
    - 문자
      - char(2)  
  - User Defined Data Type
    - class


- Data Type의 역할 - 메모리 사용을 제어
  - int i; = 4byte 메모리 할당
    - i =(2의보수) 30; 0x0000001E 
  - float f; = 4byte 메모리 할당
    - f =(IEEE-754) 30; 0x41E00000
> 똑같은 값이여도 데이터 타입에 따라 메모리에 담기는 2진수 값이 다름 
* whitespace
  * space
  * tab
  * newline

##### 이클립스에서 프로젝트 폴더 임포트하기
File -> Import -> Existing Projects into Workspace
프로젝트 폴더가 있지만 프로젝트 폴더라고 인식하지 못하는 경우 이클립스에서 인식하는 프로젝트 설정파일이 없어서 발생



##### gradle로 이클립스 설정 파일 만들기
 - .setting
 - .project
 - .classpath
   - 위 3개의 파일이 있어야 이클립스가 프로젝트 폴더로 인식함

1. build.gradle 파일에 해당 코드 넣기
```
plugins {
    id 'eclipse' // Eclipse IDE 관련 작업을 수행할 수 있는 플러그인 추가
}

eclipse {
    project {
        name = "java-lang" // 프로젝트 이름을 지정하지 않으면 폴더 이름(예: app)을 사용
    }
    jdt {
      sourceCompatibility = 21
      targetCompatibility = 21
      javaRuntimeName = "JavaSE-21"
    }
} 
```

2. gradle로 생성 = gradle eclipse 

> gradle 명령어 오류 = 빌드 스크립트 파일(.gradle, .xml) 확인하기


폴더 안에 빌드 스크립트 파일이 있으면 프로젝트 폴더

git액션은 .git폴더(깃 백업 폴더)로 인해 작동되는 것 .git폴더가 사라지면 모든 깃 로그가 사라지고 보통 폴더가 됨

자동 생성된 건 수동으로 수정하지 말고 다시 자동 생성하기. gradle cleanEclipse로 지우고 다시 gradle eclipse

##### 메모리 크기와 값의 범위

19bit 최대값 구하기 = 2^19 - 1 = 1111111111111111111
2^19 / 2


## 6월 5일 (수)

 - 실습 프로젝트 준비
   - myapp 프로젝트 생성
   - a. 자바 프로젝트 준비
     - [app-01/README.md](https://github.com/eomjinyoung/bitcamp-study/blob/main/myapp/app-01/README.md)
     - 소스 코드 : 
   - b. 리터럴과 변수를 사용해서 문자열 출력하기
     - [app-02/README.md](https://github.com/eomjinyoung/bitcamp-study/tree/main/myapp/app-02/README.md)
     - 소스 코드 :
   - c. ANSI 이스케이프 코드를 사용하여 출력 문자열 꾸미기
     - [app-03/README.md](https://github.com/eomjinyoung/bitcamp-study/blob/main/myapp/app-03/README.md)
     - 소스 코드 :
   - d. 키보드 입력 다루기
     - [app-03/README.md](https://github.com/eomjinyoung/bitcamp-study/blob/main/myapp/app-04/README.md)   
     - 소스 코드 :

 - 개발 도구
   - IntelliJ IDE 설치 및 설정 
   - [파일 이름](https://github.com/계정명/저장소명/blob/브랜치명/경로/파일명)

