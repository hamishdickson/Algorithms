package JavaAlgorithms.Section1;

/**
 * Created by hamishdickson on 18/07/15.
 *
 * Note created to do exercise
 */
public class FixedCapacityStackOfStrings {
    private String[] stack;
    private int size;

    public FixedCapacityStackOfStrings(int capacity) {
        stack = new String[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(String item) {
        stack[size++] = item;
    }

    public String pop() {
        return stack[--size];
    }

    public boolean isFull() {
        return stack.length == size;
    }
}
