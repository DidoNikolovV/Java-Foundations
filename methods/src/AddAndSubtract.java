import java.util.Scanner;

public class AddAndSubtract {
    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static int subtract(int num1, int num2, int num3) {
        int sum = sum(num1, num2);
        return sum - num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(subtract(num1, num2, num3));

    }
}
