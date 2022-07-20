package not_writed_method_error;

public class NotWritedMethodException extends Exception  {
	
	private static final long serialVersionUID = -8784146371032208865L;

	public NotWritedMethodException() {
        super();
    }

    public NotWritedMethodException(String message) {
        super(message);
    }

    public NotWritedMethodException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotWritedMethodException(Throwable cause) {
        super(cause);
    }

    protected NotWritedMethodException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
