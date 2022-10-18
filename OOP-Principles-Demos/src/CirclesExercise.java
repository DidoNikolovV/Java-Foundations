import java.util.HashMap;
import java.util.Scanner;

class Circle implements Comparable<Circle>{
    private int id;
    private double radius;

    static int lastId = 0;

    public Circle(double radius) {
        this.radius = radius;
        this.id = ++lastId;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Circle #%d (r=%.2f)",
                this.id,
                this.radius
        );
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle)) {
            return false;
        }
        Circle otherCircle = (Circle) obj;
        return this.radius == otherCircle.radius;
    }

    @Override
    public int compareTo(Circle otherCircle) {
        return Double.compare(this.radius, otherCircle.radius);
    }
}


public class CirclesExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Circle> circles = new HashMap<>();
        while(true) {
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                System.out.println("Goodbye");
                break;
            }

            String[] cmdParts = command.split(" ");
            if(cmdParts[0].equals("circle")) {
                double radius = Double.parseDouble(cmdParts[1]);
                Circle circle = new Circle(radius);
                circles.put(circle.getId(), circle);
                System.out.println("Added: " + circle.toString());
            } else if(cmdParts[0].equals("compare")) {
                int c1 = Integer.parseInt(cmdParts[1]);
                int c2 = Integer.parseInt(cmdParts[2]);
                Circle circle1 = circles.get(c1);
                Circle circle2 = circles.get(c2);
                int compareResult = circle1.compareTo(circle2);
                System.out.printf("Circle #%d %s Circle #%d%n",
                        circle1.getId(),
                        getSign(compareResult),
                        circle2.getId());
            }
        }
    }

    private static String getSign(int compareResult) {
        if(compareResult < 0) {
            return "<";
        } else if(compareResult > 0) {
            return ">";
        } else {
            return "==";
        }
    }


}
