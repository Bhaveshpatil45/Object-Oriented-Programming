package encapsulation.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Faculty> faculties;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayDetails() {
        System.out.println("Department: " + name);
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            faculty.displayDetails();
            System.out.println();
        }
        System.out.println("Students:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }

    }
}