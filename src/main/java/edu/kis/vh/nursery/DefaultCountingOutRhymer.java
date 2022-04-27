package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer  {

    private static final int START_VALUE = -1;
    private static final int CAPACITY = 11;
    private final int[] numbers = new int[12];
    private int total = START_VALUE;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == START_VALUE;
    }

    public boolean isFull() {
        return total == CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return START_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return START_VALUE;
        return numbers[total--];
    }

}
