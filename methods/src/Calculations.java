import java.util.Scanner;

public class Calculations {
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    static void divide(int num1, int num2) {
        System.out.println(num1 / num2);
    }


    static void calculate(String operation, int num1, int num2) {
        switch(operation) {
            case "subtract":
                subtract(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
            case "multiply":
                multiply(num1, num2);
                break;
            case "add":
               add(num1, num2);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        calculate(command, num1, num2);

    }
}
