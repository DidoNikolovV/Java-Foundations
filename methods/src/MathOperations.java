import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    static double calculate(double num1, char operator, double num2) {
        double result  = 0;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double num2 = Double.parseDouble(scanner.nextLine());


        System.out.println(new DecimalFormat("0.###").format(calculate(num1, operator, num2)));
    }
}
