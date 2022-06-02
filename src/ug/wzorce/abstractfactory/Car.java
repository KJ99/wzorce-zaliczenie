package ug.wzorce.abstractfactory;

public abstract class Car {
    protected String model;
    protected double weight;
    protected int countOfDoors;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    @Override
    public String toString() {
        return getClass().getName() + " {" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", countOfDoors=" + countOfDoors +
                '}';
    }
}
