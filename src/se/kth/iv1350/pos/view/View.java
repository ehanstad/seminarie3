package se.kth.iv1350.pos.view;

import se.kth.iv1350.pos.controller.Controller;
import se.kth.iv1350.pos.exceptionHandler.DatabaseFailedException;
import se.kth.iv1350.pos.exceptionHandler.ErrorMessageHandler;
import se.kth.iv1350.pos.exceptionHandler.LogHandler;
import se.kth.iv1350.pos.exceptionHandler.OperationFailedException;

/**
 * This program has no view, instead this class is a placeholder 
 * for the entire view.
 */

public class View {
	private Controller contr;
	private ErrorMessageHandler errorMsgHandler;
	private LogHandler logHandler;
	
	/**
	 * Creates a new instance
	 * @param contr The controller that is used for all operations
	 */
	public View(Controller contr) {
		this.contr = contr;
		ErrorMessageHandler errorMsgHandler = new ErrorMessageHandler();
		this.errorMsgHandler = errorMsgHandler;
		LogHandler logHandler = new LogHandler();
		this.logHandler = logHandler;
	}
	
	/**
	 * Hard-coded code to represent the view
	 * @throws OperationFailedException If some operation failed.
	 * @throws DatabaseFailedException If the 
	 */
	public void start() {
		contr.startNewSale();
		try {
			contr.addItem(2, 2);
		} catch(OperationFailedException e){
			errorMsgHandler.showErrorMessage(e.toString());
			logHandler.logException(e);
			
		} catch (DatabaseFailedException e) {
			errorMsgHandler.showErrorMessage(e.toString());
			logHandler.logException(e);
		}
		double totalPriceBeforeDiscount = contr.startPayment();
		System.out.println(totalPriceBeforeDiscount);
		double change = contr.checksForDiscount(2, 300, totalPriceBeforeDiscount);
		System.out.println(change);
		contr.startNewSale();
		try {
		contr.addItem(1, 3);
		} catch (OperationFailedException e){
			errorMsgHandler.showErrorMessage(e.toString());
		} catch (DatabaseFailedException e) {
			errorMsgHandler.showErrorMessage(e.toString());
		}
		totalPriceBeforeDiscount = contr.startPayment();
		System.out.println(totalPriceBeforeDiscount);
		change = contr.checksForDiscount(2, 300, totalPriceBeforeDiscount);
		System.out.println(change);
	}
}
