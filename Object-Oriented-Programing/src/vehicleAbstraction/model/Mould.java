package vehicleAbstraction.model;

public abstract class Mould {
    String metal;
    int height;
    int width;
    int breadth;
    String type;

    public static String createmould(String type){
        return "nice" + type + "object is created";
    }
}
