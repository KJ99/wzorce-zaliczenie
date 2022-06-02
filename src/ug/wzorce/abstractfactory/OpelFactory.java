package ug.wzorce.abstractfactory;

public class OpelFactory implements CarFactory {
    @Override
    public Car createPersonalCar() {
        Car car = new OpelCar();
        car.setModel("Opel vectra osobowy");
        car.setWeight(1200d);
        car.setCountOfDoors(5);

        return car;
    }

    @Override
    public Car createTruck() {
        Car car = new OpelCar();
        car.setModel("Opel ciężarowy");
        car.setWeight(6000d);
        car.setCountOfDoors(2);

        return car;
    }
}
