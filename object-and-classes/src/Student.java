import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    int age;
    String homeTown;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Student> students = new ArrayList<>();

        while(!input[0].equals("end")) {
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String hometown = input[3];

            Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHomeTown(hometown);

            students.add(student);

            input = scanner.nextLine().split(" ");
        }

        String city = scanner.nextLine();
        for(Student student : students) {
            if(student.getHomeTown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
