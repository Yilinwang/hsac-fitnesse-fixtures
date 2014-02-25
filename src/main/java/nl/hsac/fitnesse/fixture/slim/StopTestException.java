package nl.hsac.fitnesse.fixture.slim;

/**
 * Exception to indicate to SLIM test it occurs in should not be continued.
 * Especially useful for scripts/scenraios where there is no point to continue
 * if a certain problem occurs.
 */
public class StopTestException extends RuntimeException {

    /**
     * Creates new.
     * @param message message for exception.
     */
    public StopTestException(String message) {
        super(message);
    }

    /**
     * Creates new.
     * @param message message for exception.
     * @param cause underlying exception.
     */
    public StopTestException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates new.
     * @param cause underlying exception.
     */
    public StopTestException(Throwable cause) {
        super(cause);
    }
}
