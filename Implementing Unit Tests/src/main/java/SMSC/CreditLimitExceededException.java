package SMSC;

public class CreditLimitExceededException extends RuntimeException {
    public CreditLimitExceededException() {
        super("Credit limit exceeded. Unable to send SMS.");
    }
}