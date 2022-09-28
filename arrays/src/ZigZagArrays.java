import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for(int i = 0; i < n; i++) {
            String inputLine = sc.nextLine();
            String[] elements = inputLine.split(" ");
            boolean isEven = true;
            int currIndex = 0;
            if(i % 2 != 0) {
                currIndex = 1;
                isEven = false;
            }

            if(isEven) {
                array1[i] = Integer.parseInt(elements[currIndex]);
                array2[i] = Integer.parseInt(elements[currIndex + 1]);
            } else {
                array1[i] = Integer.parseInt(elements[currIndex]);
                array2[i] = Integer.parseInt(elements[currIndex - 1]);
            }
        }

        for(int element : array1) {
            System.out.print(element + " ");
        }

        System.out.println();
        for(int element : array2) {
            System.out.print(element + " ");
        }
    }
}
