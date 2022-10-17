import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString(){
        return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            double studentGrade = Double.parseDouble(studentInfo[2]);

            Student stud = new Student(firstName, lastName, studentGrade);
            students.add(stud);
        }

        students.sort((a, b) -> Double.compare(b.grade, a.grade));

        for(Student stud: students) {
            System.out.println(stud.toString());
        }
    }
}
