package uvsq.pglp_3_5;

/**
 *
 *a class.
 *
 */
public class UneClasseMetier {

/**
 *
 * @param message message to be logged.
 */
public void doSomething(final String message) {
    MessageLogger logger = new Affichage();
    logger.logMessage(message);
}

}
