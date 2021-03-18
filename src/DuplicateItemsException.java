public class DuplicateItemsException extends Exception {
    public DuplicateItemsException() {
    }

    public DuplicateItemsException(String message) {
        super(message);
    }

    public DuplicateItemsException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateItemsException(Throwable cause) {
        super(cause);
    }

    public DuplicateItemsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
