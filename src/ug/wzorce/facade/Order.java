package ug.wzorce.facade;

public class Order {
    private String appetizer;
    private String mainDish;
    private String dessert;
    private String drink;
    private double bill;

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Order{" +
                "appetizer='" + appetizer + '\'' +
                ", mainDish='" + mainDish + '\'' +
                ", dessert='" + dessert + '\'' +
                ", drink='" + drink + '\'' +
                ", bill=" + bill +
                '}';
    }
}
