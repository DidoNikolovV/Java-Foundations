import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] items = inputLine.split(" ");
        int[] numbers = new int[items.length];

        for(int i=0; i< items.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }

        int oddSum = 0;
        int evenSum = 0;

        for(int number : numbers) {
            if(number % 2 ==0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
