package Student;

import java.util.Scanner;


public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many new students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        student[] students = new student[numOfStudents];

        // Create n number of new students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
        }
    }
}