package Inheritance.machine.model;

public class BorewellMachine extends Machine {
    private boolean isManualEffortsRequired;

    public BorewellMachine(String brand, String model, double cost, boolean isMaintenanceRequired, boolean isManualEffortsRequired) {
        super(brand, model, cost, isMaintenanceRequired);
        this.isManualEffortsRequired = isManualEffortsRequired;
    }

    public boolean isManualEffortsRequired() {
        return isManualEffortsRequired;
    }

    public void setManualEffortsRequired(boolean isManualEffortsRequired) {
        this.isManualEffortsRequired = isManualEffortsRequired;
    }

    @Override
    public String toString() {
        return super.toString() + ", BorewellMachine{" +
                "isManualEffortsRequired=" + (isManualEffortsRequired ? "yes" : "no") +
                '}';
    }
}

