package Inheritance.machine.model;

public class WashingMachine extends Machine {
    private double load;
    private double cost;
    private boolean isWiFiAvailable;

    public WashingMachine(String brand, String model, double cost, boolean isMaintenanceRequired,  double load, boolean isWiFiAvailable){
        super(brand, model, cost ,isMaintenanceRequired);
        this.load = load;
        this.isWiFiAvailable = false;
    }

    public double getload(){
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isWiFiAvailable(){
        return isWiFiAvailable;
    }

    public void setWiFiAvailable(boolean wiFiAvailable) {
        isWiFiAvailable = wiFiAvailable;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "load='" + load + '\'' +
                ", cost=" + cost +
                ", isWiFiAvailable=" + isWiFiAvailable +
                '}';
    }
}
