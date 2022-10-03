import java.util.Scanner;

public class FactorialDivision {
    static double getFactorial(double number) {
        double result = 1;
        for(double i = number; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double num1Factorial = getFactorial(num1);
        double num2Factorial = getFactorial(num2);
        System.out.printf("%.2f", num1Factorial / num2Factorial);

    }
}
