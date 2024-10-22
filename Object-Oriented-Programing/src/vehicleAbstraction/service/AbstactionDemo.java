package vehicleAbstraction.service;

import vehicleAbstraction.model.Car;
import vehicleAbstraction.model.Mould;

public class AbstactionDemo {
    public static void main(String[] args) {

        Mould car = Car.createCar(5,"white",3);

        System.out.println("Car object created: " + car);
    }
}
