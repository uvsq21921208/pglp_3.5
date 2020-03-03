package uvsq.pglp_3_5;

/**
 *
 *a business class.
 *
 */
public class UneClasseMetier {

/**
 *
 * @param message message to be logged.
 */
public void doSomething(final String message) {
    MessageLogger logger = new Logger();
    logger.logMessage(message);
}

}
