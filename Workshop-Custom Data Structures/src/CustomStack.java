import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;
    private int[] items;
    private int size;
    private int capacity;

    public CustomStack() {
        this.items = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void push (int element){

        if (this.size == capacity){
            resize();
        }

        this.items[size++] = element;
    }
    public int pop(){
        isEmpty();
        return this.items[--this.size];
    }

    public Consumer<Integer> foreach (Consumer <Integer>consumer){
        for (int i = 0; i < this.size; i++) {
            consumer.accept(items[i]);
        }
        return consumer;
    }

    public int getSize() {
        return size;
    }

    public int peek(){
        isEmpty();
        return this.items[this.size-1];
    }

    private void resize() {
        this.capacity*=2;
        int[] resizedArray = new int[this.capacity];
        if (this.size >= 0) System.arraycopy(items, 0, resizedArray, 0, this.size);
        this.items = resizedArray;
    }
    private void isEmpty (){
        if (this.size==0){
            throw new NoSuchElementException("CustomStack is empty");
        }
    }

}
