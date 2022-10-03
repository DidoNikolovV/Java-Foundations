import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    static double mathPower(double number, int power) {
        double result = 1;
        for(int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = scanner.nextInt();

        System.out.println(new DecimalFormat("0.###").format(mathPower(number, power)));
    }
}
