package se.kth.iv1350.pos.startup;

import se.kth.iv1350.pos.controller.Controller;
import se.kth.iv1350.pos.dbHandler.Printer;
import se.kth.iv1350.pos.dbHandler.RegistryCreator;
import se.kth.iv1350.pos.view.View;

public class Main {

	public static void main(String args[]) {
		Controller contr = new Controller();
		new View(contr);
		RegistryCreator creator = new RegistryCreator();
		Printer printer = new Printer();
	}	
}
