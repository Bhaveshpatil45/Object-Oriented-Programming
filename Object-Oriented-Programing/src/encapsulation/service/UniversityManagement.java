package encapsulation.service;

import encapsulation.model.Department;

public class UniversityManagement {
    private Department department;

    public UniversityManagement(Department department){
        this.department = department;
    }
    public void displayDepartmentDetails(){
        department.displayDetails();
    }
}
