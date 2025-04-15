package first;

public class MyLinkedList<T> {
    Node head;
    private int size = 0;

    public MyLinkedList() {
        head = null;
    }

    public class Node {
        T data;
        Node next;

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

    public int size() {
        return size;
    }

    public boolean contains(T data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}
