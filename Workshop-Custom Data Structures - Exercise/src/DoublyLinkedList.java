import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class DoublyLinkedList <T> {
    private class Node{
        private Node previous;
        private T element;
        private Node next;

        private Node(T element) {
            this.element = element;
        }
    }

   private Node head;
   private Node tail;
   private int size;

    public void addFirst(T element){
        Node node = new Node(element);

        if (this.size==0){
            this.head = this.tail = node;
        }else {
            node.next = this.head;
            this.head.previous = node;
            this.head = node;
        }
        this.size++;
    }

    public void addLast (T element){

        Node node = new Node(element);

        if (this.size == 0 ) {
            this.head = this.tail = node;
        }else {
            node.previous = this.tail;
            this.tail.next = node;
            this.tail = node;
        }

        this.size++;
    }

    public T get(int index){

        validateIndex(index);

        int i = 0;
        T element = null;
        Node head = this.head;

        while (head!=null){
            element = head.element;

            if (i==index){
                break;
            }

            i++;
            head = head.next;

        }
        return element;
    }

    public T removeFirst(){
        checkForEmpty();

        Node head = this.head;

        this.head = this.head.next;

        size--;

        return head.element;

    }

    public T removeLast (){

        checkForEmpty();

        Node lastElement = this.tail;

        this.tail = lastElement.previous;
        this.tail.next = null;

        size--;
        return lastElement.element;
    }

    public Consumer<T> forEach (Consumer <T> consumer){

        Node node = this.head;

        while (node!=null){

            consumer.accept(node.element);

            node = node.next;
        }
        return consumer;
    }

    public T[] toArray (){

        T[] array = (T[]) new Object[this.size] ;

        Node head = this.head;

        int index = 0;

        while (head!=null){

            array[index++] = head.element;

            head = head.next;
        }
        return array;
    }

    public int size (){
        return this.size;
    }

    private void checkForEmpty() {
        if (this.size==0){
            throw new NoSuchElementException("Collection is empty!");
        }
    }

    private void validateIndex(int index) {
        if (index<0||index>=this.size){
            throw new IndexOutOfBoundsException(index+" is not valid index or collection is empty!");
        }
    }
}
