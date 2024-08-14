package Inheritance.machine.model;

public class CarWasher extends Machine {
    private boolean isNozzleRequired;
    private boolean isManual;

    public CarWasher(String brand, String model, double cost, boolean isMaintenanceRequired, boolean isNozzleRequired, boolean isManual) {
        super(brand, model, cost, isMaintenanceRequired);
        this.isNozzleRequired = isNozzleRequired;
        this.isManual = isManual;
    }

    public boolean isNozzleRequired() {
        return isNozzleRequired;
    }

    public void setNozzleRequired(boolean isNozzleRequired) {
        this.isNozzleRequired = isNozzleRequired;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean isManual) {
        this.isManual = isManual;
    }

    @Override
    public String toString() {
        return super.toString() + ", CarWashingMachine{" +
                "isNozzleRequired=" + (isNozzleRequired ? "yes" : "no") +
                ", isManual=" + (isManual ? "yes" : "no") +
                '}';
    }
}
