package se.kth.iv1350.pos.exceptionHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *	This class is responsible for the log 
 */
public class LogHandler {
	
	private PrintWriter logFile;
	
	public LogHandler() {
		try {
			logFile = new PrintWriter(new FileWriter("log.txt"), true);
		} catch (IOException e) {
			System.out.println("Misslyckades att logga");
			e.printStackTrace();
		}
	}
	
	/**
	 * Writes a log entry describing the thrown exception.
	 * @param e The exception that will be logged.
	 */
	public void logException(Exception e) {
		Date date = new Date();
		StringBuilder logBuilder = new StringBuilder();
		logBuilder.append(date);
		logBuilder.append(", Exception kastades: ");
		logBuilder.append(e.toString());
		logFile.println(logBuilder);
		e.printStackTrace(logFile);
	}
}
