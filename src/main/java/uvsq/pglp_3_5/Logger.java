package uvsq.pglp_3_5;
/**
 *
 * Low level implementation of messageLogger interface (high level).
 *
 */
public class Logger implements MessageLogger {
     /**
     * @param message message to be logged.
     */
    public void logMessage(final String message) {
       System.out.println(message);
    }

}
