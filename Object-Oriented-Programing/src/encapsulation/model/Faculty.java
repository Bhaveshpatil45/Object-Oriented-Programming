package encapsulation.model;

public class Faculty {
    private String name;
    private String facultyId;
    private String department;

    public Faculty(String name,String facultyId,String department){
        this.name = name;
        this.facultyId = facultyId;
        this.department = department;
    }

    public String getName(){
        return name;
    }
    public String getFacultyId(){
        return department;
    }
    public String getDepartment(){
        return department;
    }

    public void displayDetails(){
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
    }
}
