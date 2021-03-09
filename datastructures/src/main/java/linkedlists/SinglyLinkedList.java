package linkedlists;

public class SinglyLinkedList {
    public Node head;
    public int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }
}
