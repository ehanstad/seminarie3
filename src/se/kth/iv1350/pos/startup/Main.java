package se.kth.iv1350.pos.startup;

import se.kth.iv1350.pos.controller.Controller;
import se.kth.iv1350.pos.dbHandler.Printer;
import se.kth.iv1350.pos.dbHandler.RegistryCreator;
import se.kth.iv1350.pos.view.View;

/**
 * Contains the <code>main</code> method. Performs all startup of 
 * the applications
 */
public class Main {
	/**
	 * Starts the application
	 * 
	 * @param args The application does not take any commend line parameters
	 */
	public static void main(String args[]) {
		Controller contr = new Controller();
		RegistryCreator creator = new RegistryCreator();
		Printer printer = new Printer();
		new View(contr).start();
	}	
}
