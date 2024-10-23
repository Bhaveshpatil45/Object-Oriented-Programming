package Abstraction.EmployeeManagementSystem.model;

import Abstraction.EmployeeManagementSystem.contact.EmployeeAction;

abstract class Employee implements EmployeeAction {
    protected String name;
    protected String id;
    protected double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
