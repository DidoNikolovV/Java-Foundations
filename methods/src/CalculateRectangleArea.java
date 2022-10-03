import java.util.Scanner;

public class CalculateRectangleArea {
    static int rectArea(int width, int length) {
        return width * length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int length = scanner.nextInt();

        System.out.println(rectArea(width , length));

    }
}
