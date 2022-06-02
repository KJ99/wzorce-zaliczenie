package ug.wzorce.abstractfactory;

public class VolkswagenFactory implements CarFactory {
    @Override
    public Car createPersonalCar() {
        Car car = new VolkswagenCar();
        car.setModel("Volswagen golf osobowy");
        car.setWeight(890d);
        car.setCountOfDoors(2);

        return car;
    }

    @Override
    public Car createTruck() {
        Car car = new VolkswagenCar();
        car.setModel("Volswagen ciężarowy");
        car.setWeight(5421d);
        car.setCountOfDoors(2);

        return car;
    }
}
