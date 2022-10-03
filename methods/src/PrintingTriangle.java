import java.util.Scanner;

public class PrintingTriangle {
    static void printIncreasing(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }
    }
    static void printDecreasing(int n) {
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }
    }

    static void printTriangle(int n) {
        printIncreasing(n);
        printDecreasing(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        printTriangle(input);
    }
}
