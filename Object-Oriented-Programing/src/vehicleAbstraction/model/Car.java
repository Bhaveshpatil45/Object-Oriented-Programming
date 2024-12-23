package vehicleAbstraction.model;

public class Car extends Mould {
    int sittingCapacity;
    String color;
    int door;
    String description;
    static private Car car;

    public static Car createCar(int sittingCapacity, String color,int door){
        String carDescription = createmould("car");
        car = new Car(sittingCapacity, color, door, carDescription);
        return car;
    }
    private Car(int sittingCapacity, String color,int door, String description){
        this.sittingCapacity = sittingCapacity;
        this.color = color;
        this.door = door;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Car{" +
                "sittingCapacity=" + sittingCapacity +
                ", color='" + color + '\'' +
                ", door=" + door +
                ", description='" + description + '\'' +
                '}';
    }
}
