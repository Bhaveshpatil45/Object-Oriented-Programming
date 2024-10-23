package Abstraction.employeeManagementSystem.model;

public abstract class Employee {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("EmployeeID: " + employeeId);
        System.out.println("Salary: " + calculateSalary());
    }
}
