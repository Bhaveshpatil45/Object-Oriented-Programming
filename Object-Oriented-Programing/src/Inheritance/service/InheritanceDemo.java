package Inheritance.service;

import Inheritance.model.Address;
import Inheritance.model.Programmer;

import java.util.Scanner;

public class InheritanceDemo {
    public static void main(String[] args) {

        System.out.println("Please enter name of employee : ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Please enter city of employee : ");
        String city = scan.nextLine();

        System.out.println("please enter employee ID of employee");
        String employeeID = scan.nextLine();

        System.out.println("Please enter dept of employee : ");
        String dept = scan.nextLine();

        System.out.println("please enter salary of employee");
        String salary = scan.nextLine();

        System.out.println("please enter working language of employee");
        String workingLanguage = scan.nextLine();

        Programmer programmer = new Programmer();
        programmer.setName(name);
        Address address = new Address();
        address.city = city;
        programmer.setAddress(address);
        programmer.dept = dept;
        programmer.employeeId = Integer.parseInt(employeeID);
        programmer.salary = Integer.parseInt(salary);
        programmer.workingLanguage = workingLanguage;

        System.out.println(programmer);
    }
}
