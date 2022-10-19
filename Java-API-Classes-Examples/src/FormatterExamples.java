import java.util.Scanner;

class Student {
    private String name;
    private double age;

    public Student(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("I am %s. I am %.2f years old.%n", this.name, this.age);
    }
}

public class FormatterExamples {
    public static void main(String[] args) {
//        var student = new Student("Maria", 23);
//        System.out.println(student.toString());

        System.out.println(String.format("|%16d|", 99));
        System.out.println(String.format("|%-16d|", 99));
        System.out.println(String.format("|%016d|", 99));
        System.out.println(String.format("|%5.2f|", 1.3));
    }
}
