package Abstraction.employeeManagementSystem.model;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public  FullTimeEmployee(String name, String emloyeeId, double monthlySalary){
        super(name, emloyeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
