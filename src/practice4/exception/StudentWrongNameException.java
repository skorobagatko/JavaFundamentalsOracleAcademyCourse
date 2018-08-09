package practice4.exception;

public class StudentWrongNameException extends StudentException {

    public StudentWrongNameException() {
    }

    public StudentWrongNameException(String message) {
        super(message);
    }

}
