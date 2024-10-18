package Inheritance.vehicle;


public class Car extends Vehicle{
    private double cost;
    private String fueltype;
    private String color;
    private int engineCC;

    public Car(String brand, String model, double cost, String fueltype, String color, int engineCC){
        super(brand,model,cost,fueltype, color, engineCC);
        this.cost = cost;
        this.fueltype = fueltype;
        this.color = color;
        this.engineCC = engineCC;
    }

    public double getCost() {
        return cost;
    }

}