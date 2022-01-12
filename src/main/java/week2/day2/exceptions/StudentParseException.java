package week2.day2.exceptions;

public class StudentParseException extends Exception {
    public StudentParseException() {
    }

    public StudentParseException(String message) {
        super(message);
    }

    public StudentParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentParseException(Throwable cause) {
        super(cause);
    }
}
