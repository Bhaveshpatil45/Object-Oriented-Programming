package Inheritance.machine.service;

import Inheritance.machine.model.BorewellMachine;
import Inheritance.machine.model.CarWasher;
import Inheritance.machine.model.DishWasher;
import Inheritance.machine.model.WashingMachine;

import java.util.Scanner;

public class InheritanceDemo2 {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("LG", "T80", 500.0, false, 8, true);
        DishWasher dishWasher = new DishWasher("Bosch", "BP123", 600.0, true, true, true);
        CarWasher carWashingMachine = new CarWasher("CARSW", "K7", 700.0, false, true, true);
        BorewellMachine borewellMachine = new BorewellMachine("BorewellCo", "B100", 1000.0, true, true);

        System.out.println(washingMachine);
        System.out.println(dishWasher);
        System.out.println(carWashingMachine);
        System.out.println(borewellMachine);

    }
}
