package CodeAlphaProject.StudentScoreTracker;

import java.util.List;

public class Student {
    private int rollNumber;
    private String name;
    private List<Subject> subjects;

    public Student() {
    }

    public Student(int rollNumber, String name, List<Subject> subjects) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subjects = subjects;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void displayMarks(){
        System.out.println("Student name : " + this.getName());
        for(int i=0;i<subjects.size();i++){
            System.out.println("| "+ subjects.get(i).getsubjectName() + " | "  + subjects.get(i).getTotalMarks() + " | " + subjects.get(i).getTotalMarks());
        }
    }

    public void computeAverage(){
        double marks = 0;
        for(Subject subject : subjects){
            marks+= subject.getMarks();
        }
        marks = marks/subjects.size();
        System.out.println("Average Marks : "+marks);
    }

    public void highestMarks(){
        int max=Integer.MIN_VALUE;
        for(Subject subject : subjects){
            max = Math.max(subject.getMarks(), max);
        }
        System.out.println("Highest marks : " + max);
    }

    public void lowestMarks(){
        int min=Integer.MAX_VALUE;
        for(Subject subject : subjects){
            min = Math.min(subject.getMarks(), min);
        }
        System.out.println("Lowest marks : " +min);
    }
}
