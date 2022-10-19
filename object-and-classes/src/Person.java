import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        while(true) {
            String command = scanner.nextLine();
            if(command.equals("End")) {
                break;
            }

            String[] cmdParts = command.split(" ");
            String name = cmdParts[0];
            String id = cmdParts[1];
            int age = Integer.parseInt(cmdParts[2]);
            Person p = new Person(name, id, age);
            people.add(p);
        }

        people.sort((p1, p2) -> Double.compare(p1.getAge(), p2.getAge()));
        for(Person p : people) {
            System.out.printf("%s with ID: %s is %d years old.%n",
                    p.getName(),
                    p.getId(),
                    p.getAge()
            );
        }
    }
}
