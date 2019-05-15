package se.kth.iv1350.pos.exceptionHandler;

public class DatabaseFailedException extends RuntimeException {

	public DatabaseFailedException(String msg) {
		super(msg);
	}
}
