package SMSC;

public class SMSController {
    private static final int CHARGE_PER_SMS = 2;

    private BillingSystem billingSystem;

    public SMSC getSmsc() {
        return smsc;
    }

    public void setSmsc(SMSC smsc) {
        this.smsc = smsc;
    }

    private SMSC smsc;
    public SMSController(BillingSystem billingSystem) {
        this.billingSystem = billingSystem;
    }
    public void sendSms(String sender, String receiver, String message){
        boolean hasCredit = billingSystem.authorize(sender,CHARGE_PER_SMS);
        if(hasCredit) {
            smsc.send(sender, receiver);
        }else{
            throw new CreditLimitExceededException();
        }
    }
}