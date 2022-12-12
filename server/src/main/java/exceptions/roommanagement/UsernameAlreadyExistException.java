package exceptions.roommanagement;

public class UsernameAlreadyExistException extends Exception {
    public UsernameAlreadyExistException() {
        super("ERROR: User name already exists!!!");
    }
}