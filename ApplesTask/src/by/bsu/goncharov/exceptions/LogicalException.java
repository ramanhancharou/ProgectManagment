package by.bsu.goncharov.exceptions;

public class LogicalException extends Exception {

	private static final long serialVersionUID = 1L;

	public LogicalException() {
		super();
	}

	public LogicalException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LogicalException(String message, Throwable cause) {
		super(message, cause);
	}

	public LogicalException(String message) {
		super(message);
	}

	public LogicalException(Throwable cause) {
		super(cause);
	}
		
}	
