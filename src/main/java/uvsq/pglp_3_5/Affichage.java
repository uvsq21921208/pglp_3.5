package uvsq.pglp_3_5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Low level implementation of messageLogger interface (high level).
 *
 */
public class Affichage implements MessageLogger {
     /**
     * @param message message to be logged.
     */
    public void logMessage(final String message) {
    	Logger logger = LoggerFactory.getLogger(Affichage.class);
    	logger.info(message);

    }

}
