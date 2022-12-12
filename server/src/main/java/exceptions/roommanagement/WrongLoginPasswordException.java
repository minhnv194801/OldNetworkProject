package exceptions.roommanagement;

public class WrongLoginPasswordException extends Exception {
    public WrongLoginPasswordException() {
        super("ERROR: Wrong password received");
    }
}