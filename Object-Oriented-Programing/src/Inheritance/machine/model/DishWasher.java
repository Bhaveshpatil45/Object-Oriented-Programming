package Inheritance.machine.model;

public class DishWasher extends Machine{
    private boolean isSmart;
    private boolean isWiFiAvailable;

    public DishWasher(String brand, String model, double cost, boolean isMaintenanceRequired, boolean isSmart, boolean isWiFiAvailable) {
        super(brand, model, cost, isMaintenanceRequired);
        this.isSmart = isSmart;
        this.isWiFiAvailable = isWiFiAvailable;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    public boolean isWiFiAvailable() {
        return isWiFiAvailable;
    }

    public void setWiFiAvailable(boolean wiFiAvailable) {
        this.isWiFiAvailable = wiFiAvailable;
    }


    @Override
    public String toString() {
        return "DishWasher{" +
                "isSmart=" + (isSmart ? "yes" : "no") +
                ", isWiFiAvailable=" + (isWiFiAvailable ? "yes" : "no") +
                '}';
    }
}
