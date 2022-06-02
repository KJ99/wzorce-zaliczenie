package ug.wzorce.facade;

public class Waiter {
    private Cooker cooker = new Cooker();
    private Cashier cashier = new Cashier();
    private Barman barman = new Barman();
    public void completeOrder(Order order) {
        order.setAppetizer(cooker.getAppetizer());
        order.setMainDish(cooker.getMainDish());
        order.setDessert(cooker.getDessert());
        order.setDrink(barman.getDrinks());
        order.setBill(cashier.getBill());


    }

}
