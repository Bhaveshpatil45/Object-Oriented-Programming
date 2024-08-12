package Inheritance.model;

public class Programmer extends Employee{
    public String workingLanguage;

    @Override
    public String toString() {
        return "Programmer{" +
                "workingLanguage='" + workingLanguage + '\'' +
                "employeeId=" + employeeId +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ",name=" + getName() + '\'' +
                ", city=" + getAddress().city + '\'' +
                '}';
    }
}

