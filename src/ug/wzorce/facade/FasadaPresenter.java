package ug.wzorce.facade;

public class FasadaPresenter {
    public void  present(){
        System.out.println("4. Fasada");
        Order order = new Order();
        Waiter waiter = new Waiter();
        waiter.completeOrder(order);
        System.out.println(order);

    }
}
