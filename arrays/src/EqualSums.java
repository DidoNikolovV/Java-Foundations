import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] items = inputLine.split(" ");
        int[] numbers = new int[items.length];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }

        boolean areEqual = false;
        for(int i = 0; i <= numbers.length - 1; i++) {
            if(numbers.length == 1) {
                areEqual = true;
                System.out.println(i);
                break;
            }
            int currentNumber = numbers[i];
            int leftSum = 0;
            int rightSum = 0;
            for(int left = i - 1; left >=0; left--) {
                leftSum += numbers[left];
            }

            for(int right = i + 1; right < numbers.length; right++) {
                rightSum += numbers[right];
            }

            if(rightSum == leftSum) {
                areEqual = true;
                System.out.println(i);
                break;
            }
        }

        if(!areEqual) {
            System.out.println("no");
        }

    }
}
