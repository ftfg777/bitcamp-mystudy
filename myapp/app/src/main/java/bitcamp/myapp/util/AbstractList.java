package bitcamp.myapp.util;

// 인터페이스를 상속 받은 클래스들 중에 공통으로(공통 로직) 사용되는 메소드가 있으면
// 인터페이스를 implements 하는 추상 클래스로 공통 메소드 분리
public abstract class AbstractList implements List {

    // implements 로 상속받은 클래스는 부모의 메소드를 무조건 재정의 해야 하지만
    // abstract 로 선언된 추상 클래스가 상속 받으면 재정의 하지 않아도 됨
    // => 추상 클래스는 하나 이상의 추상 메소드를 가질 수 있어서 / 일반 메소드도 가질 수 있음


    protected int size = 0; // 상속 받은 클래스는 사용 가능하게 확장

    @Override
    public int size() {
        return size; // 공통으로 사용되는 메소드(공통 로직)이기 때문에 추상클래스의 일반 메소드로 분리
    }


}
