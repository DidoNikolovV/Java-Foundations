import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    static int[] exchange(int[] arr, int index) {
        int[] firstHalf = new int[index + 1];

        for(int i = 0; i <= index; i++) {
            firstHalf[i] = arr[i];
        }
        int[] secondHalf = new int[arr.length - firstHalf.length];
        for(int i = 0; i < secondHalf.length; i++) {
            secondHalf[i] = arr[firstHalf.length + i];
        }

        int[] finalArray = new int[firstHalf.length + secondHalf.length];

        int pos = 0;
        for(int el : secondHalf) {
            finalArray[pos] = el;
            pos++;
        }

        for(int el : firstHalf) {
            finalArray[pos] = el;
            pos++;
        }

        return finalArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int[] arrIntegers = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arrIntegers[i] = Integer.parseInt(arr[i]);
        }

        System.out.println(exchange(arrIntegers, 1));


    }
}
