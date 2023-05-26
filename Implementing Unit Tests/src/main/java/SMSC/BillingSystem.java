package SMSC;

public interface BillingSystem {
    boolean authorize(String sender,int charge);
}
