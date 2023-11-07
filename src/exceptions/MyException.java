package exceptions;

/**
 * a class to hold my special exception type, this holds an error code and a message
 */
public class MyException extends Exception {
    /**
     * the error code for my exception
     */
    private int errorCode;

    /**
     * the constructor for the class
     *
     * @param message the message of the exception
     * @param errorCode the error code associated with the message
     */
    public MyException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * gives back the error code
     *
     * @return the error code
     */
    public int getErrorCode() {
        return errorCode;
    }
}
