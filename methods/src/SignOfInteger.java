import java.util.Scanner;

public class SignOfInteger {
    static void integerSign(int number) {
        String sign = "";
        if(number > 0) {
            sign = "positive";
        } else if(number < 0) {
            sign = "negative";
        } else {
            sign = "zero";
        }

        System.out.printf("The number %d is %s.", number, sign);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        integerSign(input);
    }
}
