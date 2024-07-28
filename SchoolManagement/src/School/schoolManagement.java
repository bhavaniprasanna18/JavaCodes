package School;

import java.util.ArrayList;
import java.util.List;

public class schoolManagement {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 5000);
        Teacher mellisa = new Teacher(2, "Mellisa", 7000);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 6000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList, studentList);

        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println("GHS has spent for salary to " + mellisa.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(rakshith);
        System.out.println(lizzy);
    }
}
