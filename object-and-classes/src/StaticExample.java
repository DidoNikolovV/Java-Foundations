class Math {
    public static final double PI = 3.14159;
    public static final int zero = 0;

    public static double calcCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class StaticExample {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.zero);

        Math m1 = new Math();
        Math m2 = new Math();

        System.out.println(Math.PI);

        System.out.println(Math.calcCircleArea(5));
    }
}
