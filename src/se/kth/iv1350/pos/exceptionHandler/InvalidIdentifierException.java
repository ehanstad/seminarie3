package se.kth.iv1350.pos.exceptionHandler;

public class InvalidIdentifierException extends Exception{

	/**
	 * Creates a new instance representing the condition 
	 * described in the specified message.
	 * 
	 * @param msg A message that describes what went wrong
	 */
	public InvalidIdentifierException(String msg) {
		super(msg);
	}
}
