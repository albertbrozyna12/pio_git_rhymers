package edu.kis.vh.nursery;

/**
 * The {@code DefaultCountingOutRhymer} class represents a simple counting out rhymer.
 * It maintains a stack of integers and provides methods to manipulate and query the stack.
 * The stack has a fixed size, and the class ensures that no more than the maximum number
 * of elements can be pushed onto the stack.
 */
public class DefaultCountingOutRhymer {

    /** The constant representing the maximum number of elements the stack can hold. */
    public static final int number12 = 12;

    /** The constant representing the initial value of the total (empty stack). */
    public static final int numMinus1 = -1;

    /** The constant representing the index of the last valid position in the stack. */
    public static final int num11 = 11;

    /** The array used to store the elements of the stack. */
    private final int[] numbers = new int[number12];

    /** The total number of elements currently in the stack. */
    public int total = numMinus1;

    /**
     * Pushes an integer onto the stack.
     *
     * @param in the integer to be pushed onto the stack
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return {@code true} if the stack is empty, {@code false} otherwise
     */
    public boolean callCheck() {
        return total == numMinus1;
    }

    /**
     * Checks if the stack is full.
     *
     * @return {@code true} if the stack is full, {@code false} otherwise
     */
    public boolean isFull() {
        return total == num11;
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return the top element of the stack, or {@code numMinus1} if the stack is empty
     */
    protected int peekaboo() {
        if (callCheck())
            return numMinus1;
        return numbers[total];
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the top element of the stack, or {@code numMinus1} if the stack is empty
     */
    public int countOut() {
        if (callCheck())
            return numMinus1;
        return numbers[total--];
    }

}
