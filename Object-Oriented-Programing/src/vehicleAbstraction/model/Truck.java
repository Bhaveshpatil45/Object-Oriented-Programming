package vehicleAbstraction.model;

public class Truck extends Mould{
    int loadCapacity;
    String color;
    int door;
    String description;

    private static Truck truck;

    public static Truck createTurck(int loadCapacity, String color, int door){
        String truckDescription = createmould("truck");
        truck = new Truck(loadCapacity, color, door, truckDescription);
        return truck;
    }
    private Truck(int loadCapacity, String color, int door, String description){
        this.loadCapacity = loadCapacity;
        this.color = color;
        this.door = door;
        this.description = description;
    }
}
