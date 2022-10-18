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
   private double width, height;
   public Rectangle(int width, int height) {
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
        return "Rectangle{" +
                "width=" + this.width +
                ", height=" + this.height +
                ", area=" + this.calcArea() +
                '}';
    }
}

class Circle extends Figure{
    private double radius;

    public Circle(int radius) {
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
        return "Circle{" +
                "radius=" + this.radius +
                ", area=" + this.calcArea() +
                '}';
    }
}

public class FiguresExample {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20, 30);
        System.out.println(r);

        Circle c = new Circle(50);
        System.out.println(c);
    }
}
