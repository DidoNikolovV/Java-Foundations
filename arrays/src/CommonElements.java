import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine1 = sc.nextLine();
        String inputLine2 = sc.nextLine();

        String[] arr1 = inputLine1.split(" ");
        String[] arr2 = inputLine2.split(" ");

        for(int i = 0; i < arr2.length; i++) {
            for (int compareIndex = 0; compareIndex < arr1.length; compareIndex++) {
                if (arr1[compareIndex].equals(arr2[i])) {
                    System.out.print(arr1[compareIndex] + " ");
                }
            }
        }
    }
}
