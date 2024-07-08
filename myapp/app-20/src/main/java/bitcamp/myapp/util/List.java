package bitcamp.myapp.util;

// 데이터 목록을 다루는 일을 하는 객체의 사용법
// => 즉 '그 객체에게 일을 시킬 때 다음의 메소드를 호출하여 일을 시켜라.'

public interface List {

    // 데이터를 더할 때 호출할 메소드
    abstract void add(Object object); // 규칙이기 때문에 메소드의 시그니처만 정의함

    abstract Object remove(int index);

    abstract Object get(int index);

    abstract int indexOf(Object value);

    abstract Object[] toArray();

    abstract int size();
}
