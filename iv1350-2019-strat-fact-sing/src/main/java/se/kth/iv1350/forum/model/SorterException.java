package se.kth.iv1350.forum.model;

/**
 * Thrown when failed to create <code>TopicSorter</code> implementation.
 */
public class SorterException extends Exception {
    public SorterException(String msg) {
        super(msg);
    }
}
