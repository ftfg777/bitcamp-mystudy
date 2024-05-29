public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, world");

        int a = 100;
        // 테스트입니다.
        // javac 컴파일을 하면 운영체제의 캐릭터셋으로 됨
        // java -classpath -cp(.class파일이 있는 위치) bin Hello
        // javap -v /Users/jeongchan-u/git/bitcamp-mystudy/Hello.class (클래스 파일 자바 버전 확인)
        // /Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/bin/javac [자바파일]
        // javac --release 17 Hello.java (-target, -source 명령어가 합쳐짐)
        // javac -d bin src/Hello.java (bin폴더에 hello.java파일 컴파일 * 폴더가 없으면 생성)
        //

        if (a < 100) {
            System.out.println("하하하");
        }
    }
}
