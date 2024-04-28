package CodeAlphaProject.StudentScoreTracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {
        System.out.println("***Welcome to the student marks calculator***");
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter student name : ");
        String studentName = sc.next();
        System.out.println("Enter student roll number : ");
        int studentRollNumber = sc.nextInt();
        System.out.println("Enter number of subjects : ");
        int numberOfSubjects = sc.nextInt();
        List<Subject> subjects= new ArrayList<>();
        for(int i=1;i<=numberOfSubjects;i++){
            Subject subject = new Subject();
            System.out.println("Enter subject name : ");
            subject.setsubjectName(sc.next());
            System.out.println("Enter marks : ");
            subject.setMarks(sc.nextInt());
            subjects.add(subject);
        }
        student.setName(studentName);
        student.setSubjects(subjects);
        student.displayMarks();
        student.computeAverage();
        student.highestMarks();
        student.lowestMarks();
    }
}
