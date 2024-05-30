// 실습
// - 다음과 같이 실행결과가 나오도록 코드를 완성하라.
//      $ java -classpath ... Test5 aaa bbb ccc ddd
//      aaa 님 반갑습니다.
//      bbb 님 반갑습니다.
//      ccc 님 반갑습니다.
//      ddd 님 반갑습니다.
//  java -cp app/build/classes/java/main Test5 [hongkildong] = 메인 파라미터가 받는 값(아규먼트/인자) 
//

class Test6 {

    public static String addQuotes(String str) {
        return "'" + str + "'";
    }

    public static void main(String[] args) {
        // 코드를 완성하시오!

        System.out.println("0. 배열 인덱스 직접 입력");
        System.out.println("'" + args[0] + "'");
        System.out.println("'" + args[1] + "'");
        System.out.println("'" + args[2] + "'");
        System.out.println("'" + args[3] + "'");
        // 데이터의 갯수가 안 맞으면 실행 에러 발생
        // 추가로 들어오면 출력 x

        System.out.println("--------------------------------");

        System.out.println("1. 반복문 실행");
        for (int i = 0; i < args.length; i++) {
            System.out.println("'" + args[i] + "'");
        }

        System.out.println("--------------------------------");

        System.out.println("2. 반복문 실행2");
        for (String string : args) {
            System.out.println("'" + string + "'");
        }

        System.out.println("--------------------------------");

        System.out.println("3. 메소드 정의 후 실행");
        for (String string : args) {
            System.out.println(addQuotes(string));
        }
    }
}
