package Inheritance.machine.model;

public class Machine {
    private String brand;
    private String model;
    private double cost;
    private boolean isMaintenanceRequired;

    public Machine(String brand, String model, double cost, boolean isMaintenanceRequired){
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.isMaintenanceRequired = isMaintenanceRequired;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isMaintenanceRequired(){
        return isMaintenanceRequired;
    }

    public void setMaintenanceRequired(boolean maintenanceRequired) {
        isMaintenanceRequired = maintenanceRequired;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", isMaintenanceRequired=" + (isMaintenanceRequired ? "yes" : "No") +
                '}';
    }
}
