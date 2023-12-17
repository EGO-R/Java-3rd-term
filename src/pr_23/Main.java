package pr_23;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        LinkedQueue linkedQueue = new LinkedQueue();

        System.out.println("Array: ");
        for (int i = 0; i < 10; i++)
            arrayQueue.enqueue(i);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());

        System.out.println("\nLinked list");
        linkedQueue.enqueue(1);
        linkedQueue.enqueue("Hello");
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());
    }
}
