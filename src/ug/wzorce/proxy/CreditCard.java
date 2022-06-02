package ug.wzorce.proxy;

public class CreditCard implements PaymentMethod {
    private final BankAccount account;
    private final String pin;
    private boolean authorized = false;

    public CreditCard(BankAccount account, String pin) {
        this.account = account;
        this.pin = pin;
    }
    public void authorize(String pin){
         this.authorized = pin.equals(this.pin);


    }
    @Override
    public void pay(double amount) {
        if (authorized){
            this.account.pay(amount);
        }
    }
}
