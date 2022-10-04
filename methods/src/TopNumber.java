import java.util.Scanner;

public class TopNumber {
    static boolean sumOfDigitsIsDivisibleBy8(int number) {
        String[] arr = String.valueOf(number).split("");
        int sum = 0;
        for(String el : arr) {
            sum += Integer.parseInt(el);
        }

        if(sum % 8 == 0) {
            return true;
        }

        return false;
    }

    static boolean holdsOneOddDigit(int number) {
        String[] arr = String.valueOf(number).split("");
        for(String el: arr) {
            if(Integer.parseInt(el) % 2 != 0) {
                return true;
            }
        }

        return false;
    }

    static void printTopInteger(int n) {
        for(int i = 1; i < n; i++) {
            if(sumOfDigitsIsDivisibleBy8(i) && holdsOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printTopInteger(n);
    }
}
