package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int number12 = 12;
    public static final int numMinus1 = -1;
    public static final int num11 = 11;
    private final int[] numbers = new int[number12];


    public int total = numMinus1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    public boolean callCheck() {
        return total == numMinus1;
    }

    public boolean isFull() {
        return total == num11;
    }

    protected int peekaboo() {
        if (callCheck())
            return numMinus1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return numMinus1;
        return numbers[total--];
    }

}
