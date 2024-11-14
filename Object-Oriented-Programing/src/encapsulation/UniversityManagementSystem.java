package encapsulation;
 
import encapsulation.model.Department;
import encapsulation.model.Faculty;
import encapsulation.model.Student;
import encapsulation.service.UniversityManagement;

public class UniversityManagementSystem {
    public static void main(String[] args) {

        //Create department
        Department csDepartment = new Department("Computer Science");

        //Create faculty members
        Faculty faculty1 = new Faculty("Mr. Bhavesh", "ID001", "Computer Science");
        Faculty faculty2 = new Faculty("Prof. Shubham", "ID002", "Computer Science");

        //Create students
        Student student1 = new Student("Teena", "Cs001", "Computer Science");
        Student student2 = new Student("Parag", "Cs002", "Computer Science");

        //Add faculty and students to the department
        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);
        csDepartment.addStudent(student1);
        csDepartment.addStudent(student2);

        //Create university management system
        UniversityManagement management = new UniversityManagement(csDepartment);

        //Display Details
        management.displayDepartmentDetails();
    }
}
