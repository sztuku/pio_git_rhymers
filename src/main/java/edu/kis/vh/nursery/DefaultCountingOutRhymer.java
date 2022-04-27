package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer  {

    private static final int START_VALUE = -1;
    private static final int CAPACITY = 11;
    private final int[] numbers = new int[12];
    private int total = getStartValue();

    public static int getStartValue() {
        return START_VALUE;
    }

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public int getTotal() {
        return total;
    }



    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean callCheck() {
        return total == getStartValue();
    }

    public boolean isFull() {
        return total == getCAPACITY();
    }

    protected int peekaboo() {
        if (callCheck())
            return getStartValue();
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return getStartValue();
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
