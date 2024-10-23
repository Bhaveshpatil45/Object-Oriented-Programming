package encapsulation.model;

public class Student {
    private String name;
    private String studentId;
    private String department;

    public Student(String name, String studentId, String department){
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    public String getName(){
        return name;
    }
    public String getStudentId(){
        return studentId;
    }
    public String getDepartment(){
        return department;
    }

    public void displayDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Department: " + department);
    }
}
