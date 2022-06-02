package ug.wzorce.abstractfactory;

public class AbstractFactoryPresenter {
    public void present() {
        System.out.println("3. Fabryka abstrakcyjna");

        CarFactory factory = new OpelFactory();
        OpelCar opelPersonal = (OpelCar) factory.createPersonalCar();
        OpelCar opelTruck = (OpelCar) factory.createTruck();
        factory = new VolkswagenFactory();
        VolkswagenCar volkswagenPersonal = (VolkswagenCar) factory.createPersonalCar();
        VolkswagenCar volkswagenTruck = (VolkswagenCar) factory.createTruck();

        System.out.println(opelPersonal);
        System.out.println(opelTruck);
        System.out.println(volkswagenPersonal);
        System.out.println(volkswagenTruck);

    }
}
