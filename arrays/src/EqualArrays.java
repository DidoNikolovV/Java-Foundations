import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine1 = sc.nextLine();
        String inputLine2 = sc.nextLine();

        String[] items1 = inputLine1.split(" ");
        String[] items2 = inputLine2.split(" ");

        int[] array1 = new int[items1.length];
        int[] array2 = new int[items2.length];

        for(int i =0; i< items1.length; i++) {
            array1[i] = Integer.parseInt(items1[i]);
            array2[i] = Integer.parseInt(items2[i]);
        }

        boolean areEqual = true;
        int diffIndex = 0;
        int sum = 0;

        for(int i=0; i < array1.length; i++) {
            if(array1[i] != array2[i]) {
                areEqual = false;
                diffIndex = i;
                break;
            }
            sum += array1[i];
        }

        if(areEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }

    }
}
