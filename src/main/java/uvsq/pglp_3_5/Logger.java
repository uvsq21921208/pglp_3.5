package uvsq.pglp_3_5;
/**
 * 
 * Low level implementation of messageLogger interface.
 *
 */
public class Logger implements MessageLogger{
	/**
	 * @param message message to be logged.
	 */
	public void logMessage(String message) {
		System.out.println(message);
	}

}
