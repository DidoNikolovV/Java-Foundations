import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");
        int[] numbers = new int[items.length];


        int sum = 0;

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }

        for(int number : numbers) {
            if(number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
