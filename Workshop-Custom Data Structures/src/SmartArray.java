import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void add(int element) {


        if (size == capacity) {
            this.data = resize(this.data);
        }

        this.data[size++] = element;
    }

    public void add (int index , int element){
        validateIndex(index);

        if (this.size+1>=this.capacity){
            this.data = resize(this.data);
        }

        this.size++;
        shiftRight(index);
        this.data[index] = element;
    }

    public void shiftRight(int index){
        if (this.data.length - 1 - index >= 0){
            System.arraycopy(this.data, index, this.data, index + 1, this.data.length - 1 - index);
        }
    }

    public int get(int index) {
        validateIndex(index);
        return this.data[index];
    }

    public int remove(int index) {
        validateIndex(index);

        int element = this.data[index];
        shiftLeft(index);
        this.size--;

        if (this.size <= this.capacity / 4) {
            shrink();
        }

        return element;
    }

    public boolean contains(int element){
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i]==element){
                return true;
            }
        }
        return false;
    }

    public Consumer<Integer> foreach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.data.length; i++) {
            consumer.accept(this.data[i]);
        }
        return consumer;
    }

    private void validateIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new ArrayIndexOutOfBoundsException(index + " is not valid index !");
        }
    }

    private int[] resize(int[]data) {
        capacity *= 2;
        int[] newData = new int[capacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        return newData;
    }

    private void shrink() {
        this.capacity /= 2;
        int[] newArray = new int[this.capacity];

        if (this.size >= 0) System.arraycopy(this.data, 0, newArray, 0, this.size);
        this.data = newArray;
    }

    private void shiftLeft(int index) {
        if (this.size - 1 - index >= 0) System.arraycopy(this.data, index + 1, this.data, index, this.size - 1 - index);
        this.data[this.size - 1] = 0;
    }

}
