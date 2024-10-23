package encapsulation.model;

public class Subject {
    private String subjectName;
    private String subjectCode;

    public Subject(String subjectName, String subjectCode){
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void displayDetails(){
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Subject Code: " + subjectCode);
    }
}
