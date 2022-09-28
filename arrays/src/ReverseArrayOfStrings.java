import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = sc.nextLine().split(" ");
        for(int i =0; i < items.length / 2; i++) {
            String leftElement = items[i];
            String rightElement = items[items.length - 1 - i];
            items[i] = rightElement;
            items[items.length- 1 - i] = leftElement;
        }

        for(String item: items) {
            System.out.print(item + " ");
        }
    }
}
