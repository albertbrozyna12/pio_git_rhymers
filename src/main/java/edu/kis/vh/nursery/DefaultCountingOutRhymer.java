package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static int number12 = 12;
    private static int numMinus1 = -1;
    private static int num11 = 11;
    private  int[] numbers = new int[number12];

    private int total = numMinus1;

    public static int getNumber12() {
        return number12;
    }

    public static int getNumMinus1() {
        return numMinus1;
    }

    public static int getNum11() {
        return num11;
    }


    public int getTotal() {
        return total;
    }

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

    public int[] getNumbers() {
        return numbers;
    }

}
