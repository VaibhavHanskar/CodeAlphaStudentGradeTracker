package CodeAlphaProject.StudentScoreTracker;

public class Subject {
    private String subjectName;
    private final int totalMarks = 100;
    private int marks;

    public Subject() {
    }

    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getsubjectName() {
        return subjectName;
    }

    public void setsubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
