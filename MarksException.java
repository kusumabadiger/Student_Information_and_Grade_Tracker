//Exception for marks outside the range 0 to 100.
 
public class MarksException extends Exception {
    public MarksException(String message) {
        super(message);
    }
}
