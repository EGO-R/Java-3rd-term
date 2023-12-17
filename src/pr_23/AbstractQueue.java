package pr_23;

abstract public class AbstractQueue implements Queue {

    abstract public void enqueue(Object element);

    abstract public Object element();

    abstract public Object dequeue();

    abstract public void clear();

    abstract public int size();

    abstract public boolean isEmpty();
}
