import java.util.ArrayList;
import java.util.Scanner;

interface Movable {
    public void move(int deltaX, int deltaY);
}

abstract class Figure implements Movable{
    protected int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public abstract double calcArea();
}

class Rectangle extends Figure {
   protected double width, height;
   public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
   }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
       return String.format("Rectangle(width=%.2f, height=%.2f, area=%.2f)",
               this.width,
               this.height,
               this.calcArea()
       );
    }
}

class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle(radius=%.2f, area=%.2f)",
                this.radius,
                this.calcArea()
        );
    }
}

class FilledRectangle extends Rectangle {
    private String color;

    public FilledRectangle(double width, double height, String color) {
        super(width, height);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("FilledRectangle(width=%.2f, height=%.2f, color=%s, area=%.2f)",
                this.width,
                this.height,
                this.color,
                this.calcArea()
        );
    }
}

public class Figures {
    public static void main(String[] args) {
        ArrayList<Figure> figures = readFigures();

        figures.sort((f1, f2) -> Double.compare(f1.calcArea(), f2.calcArea()));

        printFigures(figures);
    }

    private static  ArrayList<Figure> readFigures() {
        ArrayList<Figure> figures  = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String commandLine = scanner.nextLine();
            if(commandLine.equals("stop")) {
                break;
            }
            String[] cmdParts = commandLine.split(" ");
            if(cmdParts[0].equals("circle")) {
                double radius = Double.parseDouble(cmdParts[1]);
                Circle circle = new Circle(radius);
                figures.add(circle);
            } else if(cmdParts[0].equals("rect")) {
                double width = Double.parseDouble(cmdParts[1]);
                double height = Double.parseDouble(cmdParts[2]);
                Rectangle rect = new Rectangle(width, height);
                figures.add(rect);
            } else if(cmdParts[0].equals("fillRect")) {
                double width = Double.parseDouble(cmdParts[1]);
                double height = Double.parseDouble(cmdParts[2]);
                String color = cmdParts[3];
                FilledRectangle filledRect = new FilledRectangle(width, height, color);
                figures.add(filledRect);
            } else {
                System.out.println("Uknown command: "+ commandLine);
            }
        }
        return figures;
    }

    private static void printFigures(ArrayList<Figure> figures) {
        for (var f: figures) {
            System.out.println(f);
        }
    }
}
