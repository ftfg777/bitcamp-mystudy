package bitcamp.myapp.util;

import java.util.NoSuchElementException;

public abstract class AbstractList03 implements List {

    int size;

    @Override
    public int size() {
        return size;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public Iterator iterator() {

        // 3) local class
        class ListIterator implements Iterator {

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
        }

        return new ListIterator();
    }
}
