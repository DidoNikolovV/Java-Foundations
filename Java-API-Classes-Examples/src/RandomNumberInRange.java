import java.util.Random;
import java.util.Scanner;

public class RandomNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int randNum = generateRandomInRange(start, end);
        System.out.println(randNum);

    }

    private static int generateRandomInRange(int start, int end) {
        Random randNumber = new Random();
        return randNumber.nextInt(end - start + 1) + start;

    }
}
