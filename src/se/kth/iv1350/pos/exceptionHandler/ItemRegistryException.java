package se.kth.iv1350.pos.exceptionHandler;

public class ItemRegistryException extends RuntimeException{

	/*
	 * Creates a new instance representing the condition 
	 * described in the specified message.
	 * 
	 * @param msg A message that describes what went wrong
	 */
	public ItemRegistryException(String msg) {
		super(msg);
	}
}
