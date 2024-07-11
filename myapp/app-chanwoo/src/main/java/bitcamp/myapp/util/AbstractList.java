package bitcamp.myapp.util;

import java.util.NoSuchElementException;

public abstract class AbstractList implements List {

    int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public Iterator iterator() {
        // 4) anonymous class 익명 클래스
        return new Iterator() {
            private int cursor;

            @Override
            public boolean hasNext() {
                return cursor < size();
            }

            @Override
            public Object next() {
                if (this.hasNext()) {
                    return get(cursor++);
                } else {
                    throw new NoSuchElementException("No more elements");
                }
            }
        };
    }


}
