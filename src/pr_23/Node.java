package pr_23;

public class Node {
    Object value;
    Node prev;
    Node next;

    public Node(Object value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
