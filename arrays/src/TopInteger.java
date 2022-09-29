import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] elements = inputLine.split(" ");
        int[] numbers = new int[elements.length];
        int[] result = new int[numbers.length];

        for(int i = 0; i < elements.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        int index = 0;
        int compareNumber = 0;
        for(int i = 0; i < numbers.length; i++) {
            boolean isTopInteger = true;
            int currentNumber = numbers[i];
            for(int compareIdx = i + 1; compareIdx < numbers.length; compareIdx++) {
                if(compareIdx + 1 == numbers.length) {
                    compareNumber = numbers[numbers.length - 1];
                } else {
                    compareNumber = numbers[compareIdx];
                }
                if(currentNumber < compareNumber) {
                    isTopInteger = false;
                    break;
                }
            }

            if(isTopInteger) {
                result[index] = currentNumber;
                index++;
            }
        }


        for(int num : result) {
            if(num != 0) {
                System.out.print(num + " ");

            }
        }
    }
}
