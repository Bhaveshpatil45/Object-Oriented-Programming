package Abstraction.employeeManagementSystem;

import Abstraction.employeeManagementSystem.model.FullTimeEmployee;
import Abstraction.employeeManagementSystem.model.PartTimeEmpoyee;
import Abstraction.employeeManagementSystem.service.EmployeeManagement;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        FullTimeEmployee fullTime = new FullTimeEmployee("Bhavesh", "fullTime001", 5000);
        PartTimeEmpoyee partTime = new PartTimeEmpoyee("Rohit", "partTime001", 20, 80);

        management.addEmployee(fullTime);
        management.addEmployee(partTime);

        management.displayAllEmployees();

    }
}
