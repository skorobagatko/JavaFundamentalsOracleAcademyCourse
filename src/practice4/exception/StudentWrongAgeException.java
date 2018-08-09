package practice4.exception;

public class StudentWrongAgeException extends StudentException {
    public StudentWrongAgeException() {
    }

    public StudentWrongAgeException(String message) {
        super(message);
    }
}
