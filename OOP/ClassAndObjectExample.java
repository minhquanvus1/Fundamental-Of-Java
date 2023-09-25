package OOP;

import java.util.Scanner;

class Student {
    private int studentId;
    private int studentAge;
    private String studentName;
    Scanner scanner = new Scanner(System.in);

    public Student() {
        this.studentAge = 20;
        this.studentId = 12;
        this.studentName = "trump";
    }

    void acceptDetails() {
        System.out.print("Enter student id: ");
        studentId = scanner.nextInt();
        System.out.print("Enter student name: ");
        studentName = scanner.next(); // if we use "scanner.nextLine()" here, the "enter" stroke will be considered as the input of the next field, which is "StudentName", which causes unexpected behavior
        System.out.print("Enter student age: ");
        studentAge = scanner.nextInt();
    }
    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}
class Marks extends Student {
    private float objectiveMarks;
    private float subjectiveMarks;

    void acceptDetails() {
        super.acceptDetails();
        System.out.print("Enter your Objective Marks: ");
        this.objectiveMarks = scanner.nextFloat();
        System.out.print("Enter your Subjective Marks: ");
        this.subjectiveMarks = scanner.nextFloat();
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Objective Marks: " + this.objectiveMarks);
        System.out.println("Subjective Marks: " + this.subjectiveMarks);
    }
}
class Sports extends Marks {
    private float score;
    void acceptDetails() {
        super.acceptDetails();
        System.out.print("Enter your sports score: ");
        this.score = scanner.nextFloat();
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Sports Score: " + this.score);
    }
}
public class ClassAndObjectExample {
    public static void main(String[] args) {
        //Student student = new Student();
        //student.acceptDetails();
        //student.displayDetails();

        Marks marks = new Marks();
        marks.acceptDetails();
        marks.displayDetails();
    }
}
