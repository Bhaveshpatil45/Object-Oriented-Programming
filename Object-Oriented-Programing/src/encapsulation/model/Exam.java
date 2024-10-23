package encapsulation.model;

public class Exam {
    private String subjectCode;
    private String examDate;
    private String time;

    public Exam(String subjectCode, String examDate, String time){
        this.subjectCode = subjectCode;
        this.examDate = examDate;
        this.time = time;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getExamDate() {
        return examDate;
    }

    public String getTime() {
        return time;
    }

    public void displayDetails(){
        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Exam Date: " + examDate);
        System.out.println("Time: " + time);
    }
}
