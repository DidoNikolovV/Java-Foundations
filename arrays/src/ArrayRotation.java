import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        int numberOfRotation = Integer.parseInt(sc.nextLine());
        String[] arr = inputLine.split(" ");
        int[] numbers = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        int lastIndex = arr.length - 1;
        int currentElement = 0;
        int nextElement = 0;
        for(int i = 0; i < numberOfRotation; i++) {
            int firstElement = numbers[0];
            int lastElement = numbers[lastIndex];
            numbers[lastIndex] = firstElement;
            numbers[0] = lastElement;
            for(int currIndex = 0; currIndex < numbers.length; currIndex++) {
                if(currIndex + 1 == numbers.length) {
                    currentElement = numbers[currIndex - 1];
                    nextElement = numbers[currIndex];
                    numbers[currIndex - 1] = nextElement;
                    numbers[currIndex] = currentElement;
                } else {
                    currentElement = numbers[currIndex];
                    nextElement = numbers[currIndex + 1];
                    numbers[currIndex] = nextElement;
                    numbers[currIndex + 1] = currentElement;
                }
            }
        }

        for(int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
