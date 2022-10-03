import java.util.Scanner;

public class MultiplyEvensByOdds {
    static int getSumOfEvenDigits(int number) {
        int result = 0;
       while(number != 0) {
           int lastDigit = number % 10;
           if(lastDigit % 2 == 0) {
               result += lastDigit;
           }
           number /= 10;
       }

       return result;
    }

    static int getSumOfOddDigits(int number) {
        int result = 0;
        while(number != 0) {
            int lastDigit = number % 10;
            if(lastDigit % 2 != 0) {
                result += lastDigit;
            }
            number /= 10;
        }

        return result;
    }

    static int getMultipleOfEvenAndOdds(int n) {
        int evenSum = getSumOfEvenDigits(n);
        int oddSum = getSumOfOddDigits(n);

        return evenSum * oddSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        System.out.println(getMultipleOfEvenAndOdds(input));

    }
}
