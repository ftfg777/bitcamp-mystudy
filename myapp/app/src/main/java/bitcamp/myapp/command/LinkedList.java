package bitcamp.myapp.command;

public class LinkedList {

    Node first;
    Node last;
    int size;


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append("홍길동");
        list.append("임꺽정");
        list.append("유관순");
        list.append("안중근");
        list.append("윤봉길");
        list.append("김구");

        list.delete(2);
        list.printAll();

        list.delete(2);
        list.printAll();

        list.delete(2);
        list.printAll();

        list.delete(2);
        list.printAll();


    }

    public void printAll() {
        Node cursor = first;
        while (cursor != null) {
            System.out.println(cursor.value);
            cursor = cursor.next;
        }
    }

    public void append(Object value) {
        Node newNode = new Node(value);

        if (first == null) {
            last = first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }


    public Object delete(int index) {
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

    public int index(Object value) {
        Node cursor = first;
        int currentIndex = 0;

        while (cursor != null) {
            if (cursor.value == value) {
                return currentIndex;
            }
            cursor = cursor.next;
            currentIndex++;
        }
        return -1;
    }


    public Object getValue(int index) {
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

    public Object[] getArray() {
        Object[] arr = new Object[size];
        Node cursor = first;
        for (int i = 0; i < size; i++) {
            arr[i] = cursor.value;
            cursor = cursor.next;
        }
        return arr;
    }

    public int size() {
        return size;
    }

}
