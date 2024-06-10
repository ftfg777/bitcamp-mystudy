# 리터널
- 자바 언어로 표현한 값
  

정수 리터럴
- 정수를 읽기 쉽도록 밑줄(underscore; _)을 숫자 사이에 삽입할 수 있다.
- 숫자 맨 앞 또는 맨 뒤에 삽입할 수 없다.
```

    // 10진수 리터럴 
    // 코드에서 일반적으로 정수 값을 표현할 때 사용한다.
    System.out.println(100);
    System.out.println(12_783_406);

    // 8진수 리터럴
    // 코드를 작성할 때 잘 사용하지 않는다.
    // 0으로 시작해야 한다.
    System.out.println(0144);
    System.out.println(0_144);
    
    // 2진수 리터럴
    // 메모리의 상태를 직설적으로 보여주고 싶을 때 사용한다.
    // 0b 또는 0B로 시작한다.
    System.out.println(0b1100100);
    System.out.println(0B1100100);
    System.out.println(0B1_1_0_0_1_0_0);
    
    // 숫자 앞에 0이 있어도 된다.
    System.out.println(0b01100100);
    System.out.println(0B01100100);
    
    // 16진수 리터럴
    // 2진수를 간결하게 표현하기 위해 사용한다.
    // 0x 또는 0X 로 시작한다.
    System.out.println(0x64);
    System.out.println(0X6_4);
    
    // 숫자 앞에 0이 있어도 된다.
    System.out.println(0x064);
    System.out.println(0X064);
```
```
부동소수점 리터럴
    System.out.println(3.14);
    System.out.println(31.4e-1);    
```
``` 
논리 리터럴
    System.out.println(true);
    System.out.println(false);
```
```    
문자 리터럴
    System.out.println('가');
```
```    
문자열 리터럴
    System.out.println("오호라 코딩스쿨!");
```