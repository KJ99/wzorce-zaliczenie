package ug.wzorce.proxy;

public class BankAccount implements PaymentMethod{
private  double saldo;

    public BankAccount(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void pay(double amount) {
        this.saldo -= amount;
    }
}
