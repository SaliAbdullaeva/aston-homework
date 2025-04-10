import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private Node head;
    private int size = 0;

    public MyLinkedList() {
        head = null;
    }

    public class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public void remove(T data) {
        Node currentNode = head;
        Node previousNode = null;

        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }

        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                previousNode.next = currentNode.next;
                size--;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T data = currentNode.data;
                currentNode = currentNode.next;
                return data;
            }
        };
    }
}

