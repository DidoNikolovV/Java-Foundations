import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] range = scanner.nextLine().split(" ");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);

        System.out.println("Range: [" + start + "..." + end + "]");
        int number = readNumberInRange(scanner, start, end);
        System.out.println("Valid number: " + number);

    }

    private static int readNumberInRange(Scanner scanner, int start, int end) {
        while(true) {
            String inputLine = scanner.nextLine();
            try {
                int num = Integer.parseInt(inputLine);
                if(num >= start && num <= end) {
                    return num; // Valid number - return it
                }
            } catch(Exception ex) {
                // The number is invalid --> print an error
            }

            System.out.println("Invalid number: " + inputLine);
        }
    }
}
