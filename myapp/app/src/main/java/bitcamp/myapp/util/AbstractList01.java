package bitcamp.myapp.util;

import java.util.NoSuchElementException;

public abstract class AbstractList01 implements List {

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
        return new ListIterator(this);
    }


    // static nested class
    static class ListIterator implements Iterator {

        private List list;
        private int cursor;

        public ListIterator(List list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return list.get(cursor++);
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }
    }
    
}
