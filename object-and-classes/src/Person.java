import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++) {
            String[] inputParts = scanner.nextLine().split(" ");
            String name = inputParts[0];
            int age = Integer.parseInt(inputParts[1]);

            Person person = new Person(name, age);
            people.add(person);

        }

        for(Person person : people) {
            if(person.getAge() > 30) {
                System.out.println(person.toString());
            }
        }
    }
}
