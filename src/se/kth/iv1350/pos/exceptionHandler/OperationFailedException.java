package se.kth.iv1350.pos.exceptionHandler;

public class OperationFailedException extends Exception {
	
	/**
	 * 
	 * @param msg
	 * @param cause
	 */
	public OperationFailedException(String msg, Exception cause) {
		super(msg, cause);
	}
}
