package pr_23;

public class LinkedQueue extends AbstractQueue implements Queue {
    private Node head;
    private Node tail;
    private int size;

    public void enqueue(Object element) {
        head = new Node(element, null, head);
        if(head.next != null) {
            head.next.prev = head;
        }
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public Object element() {
        assert size > 0;
        return tail.value;
    }

    public Object dequeue() {
        Object ret = element();
        if (tail.prev != null) {
            tail = tail.prev;
            tail.next = null;
        } else {
            tail = null;
        }
        size--;
        return ret;
    }

    public void clear() {
        Node node = head;
        while(node != null) {
            Node newNode = node.next;
            node = null;
            node = newNode;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

}
