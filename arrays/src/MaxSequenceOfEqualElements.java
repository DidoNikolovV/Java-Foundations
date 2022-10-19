import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] items = inputLine.split(" ");
        int[] numbers = new int[items.length];

        for(int i = 0; i < items.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }

        int equalNumbers = 1;
        int maxSequence = 0;
        int idx = 0;
        int currentNumber = 0;
        int previousNumber = 0;
        int[] result = new int[numbers.length];

        for(int i = 1; i < numbers.length; i++) {
            currentNumber = numbers[i];
            previousNumber = numbers[i - 1];
            if(currentNumber == previousNumber) {
                result[i] = currentNumber;
                equalNumbers++;
            } else {
                equalNumbers = 1;
            }

            if(maxSequence < equalNumbers) {
                maxSequence = equalNumbers;
            }
        }


    }
}
