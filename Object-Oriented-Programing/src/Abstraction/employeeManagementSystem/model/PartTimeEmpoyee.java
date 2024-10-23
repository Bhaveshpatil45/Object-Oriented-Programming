package Abstraction.employeeManagementSystem.model;

public class PartTimeEmpoyee extends Employee {
    private double hourltyRate;
    private int hoursWorked;

    public PartTimeEmpoyee(String name, String employeeId, double hourlyRate, int hoursWorked){
        super(name, employeeId);
        this.hourltyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourltyRate * hoursWorked;
    }
}
