import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] items = inputLine.split(" ");
        int[] numbers = new int[items.length];

        for(int i = 0; i <numbers.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }

        int sum = 0;
        int[] newArr = new int[numbers.length-1];
        // 5 0 4 1 2
        // 5 + 0 0 + 4 4 + 1 1 + 2
        for(int i = 0; i< numbers.length; i++) {
            if(i + 1 == numbers.length) {
                i = 0;
                numbers = newArr;
            }
            int firstNumber = numbers[i];
            int secondNumber = numbers[i + 1];
            sum = firstNumber + secondNumber;
            newArr[i] = sum;
            if(newArr.length == 1) {
                System.out.println(newArr[0]);
                break;
            }
        }
    }
}
