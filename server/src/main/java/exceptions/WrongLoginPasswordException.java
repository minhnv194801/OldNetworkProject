package exceptions;

public class WrongLoginPasswordException extends Exception {
    public WrongLoginPasswordException() {
        super("ERROR: Wrong password received");
    }
}