package ug.wzorce.proxy;

public class ProxyPresenter {
    public void present(){
        System.out.println("6. Pośrednik");
        BankAccount account = new BankAccount(76543);
        CreditCard card = new CreditCard(account, "8769");
        card.authorize("8769");
        card.pay(34546);
        System.out.println(account.getSaldo());
    }
}
