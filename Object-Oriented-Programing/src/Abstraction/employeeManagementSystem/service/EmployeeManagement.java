package Abstraction.employeeManagementSystem.service;

import Abstraction.employeeManagementSystem.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void displayAllEmployees(){
        for (Employee employee : employees){
            employee.displayDetails();
            System.out.println("----------------------------------------");
        }
    }
}
