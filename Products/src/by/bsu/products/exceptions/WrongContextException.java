package by.bsu.products.exceptions;

public class WrongContextException extends Exception {
	public WrongContextException(Throwable cause) {
        super(cause);
    }

    public WrongContextException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongContextException(String message) {
        super(message);
    }

    public WrongContextException() {
    }
}
