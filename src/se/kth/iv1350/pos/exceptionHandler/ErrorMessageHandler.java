package se.kth.iv1350.pos.exceptionHandler;

import java.util.Date;

/**
 *	This class creates and shows error messages for the user.
 */
public class ErrorMessageHandler {

	/**
	 * Displays the specific error message
	 * @param msg The error message
	 */
	public void showErrorMessage (String msg) {
		Date date = new Date();
		StringBuilder errorMessage = new StringBuilder();
		errorMessage.append(date);
		errorMessage.append(", ERROR: ");
		errorMessage.append(msg);
		System.out.println(errorMessage);
	}
}
