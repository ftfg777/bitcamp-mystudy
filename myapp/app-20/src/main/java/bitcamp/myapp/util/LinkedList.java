package bitcamp.myapp.util;

public class LinkedList extends AbstractList {

    private Node first;
    private Node last;


    @Override
    public void add(Object value) {
        Node newNode = new Node(value);

        if (first == null) {
            last = first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }


    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node deleteNode = null;
        size--;
        if (index == 0) {
            deleteNode = first;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return deleteNode.value;
        }

        Node cursor = first;
        int currentIndex = 0;
        while (cursor != null) {
            if (currentIndex == (index - 1)) {
                break;
            }
            cursor = cursor.next;
            currentIndex++;
        }
        deleteNode = cursor.next;
        cursor.next = cursor.next.next;

        if (cursor.next == null) {
            last = cursor;
        }
        return deleteNode.value;
    }

    @Override
    public int indexOf(Object value) {
        Node cursor = first;
        int currentIndex = 0;

        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return currentIndex;
            }
            cursor = cursor.next;
            currentIndex++;
        }
        return -1;
    }


    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node cursor = first;
        int cursorIndex = 0;

        while (cursor != null) {
            if (cursorIndex == index) {
                return cursor.value;
            }
            cursor = cursor.next;
            cursorIndex++;
        }
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node cursor = first;
        for (int i = 0; i < size; i++) {
            arr[i] = cursor.value;
            cursor = cursor.next;
        }
        return arr;
    }


    // 1) 스태틱 중첩 클래스
    // LinkedList 안에서만 사용하기 때문에 안에 둠 (밖 클래스의 인스턴스 변수를 사용하면 논 스태틱)
    private static class Node {

        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }
    }
}
