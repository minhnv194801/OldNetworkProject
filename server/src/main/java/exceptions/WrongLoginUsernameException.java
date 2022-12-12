package exceptions;

public class WrongLoginUsernameException extends Exception {
    public WrongLoginUsernameException() {
        super("ERROR: Login username not exist!!!");
    }
}