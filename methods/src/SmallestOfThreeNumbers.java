import java.util.Scanner;

public class SmallestOfThreeNumbers {
    static void smallestOfThreeNums(int num1, int num2, int num3) {
        if(num1 < num2 && num1 < num3) {
            System.out.println(num1);
        } else if(num2 < num1 && num2 < num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        smallestOfThreeNums(num1, num2, num3);

    }
}
