import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        String[] items = inputLine.split(" ");
        int[] numbers = new int[items.length];

        for(int i = 0; i < items.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }
        int sum = 0;
        for(int i = 1; i < numbers.length; i++) {
            int firstNumber = numbers[i - 1];
            for(int j = i ; j < numbers.length; j++) {
                int secondNumber = numbers[j];
                sum += firstNumber + secondNumber;
                if(sum == n) {
                    sum = 0;
                    System.out.println(firstNumber + " " + secondNumber);
                }
                sum = 0;

            }

        }
    }
}
