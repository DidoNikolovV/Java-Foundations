import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PalindromeIntegers {
    static boolean isPalindrome(int number) {
        boolean isPalindrome = true;
        String numAsString = String.valueOf(number);
        String[] reversedArr = numAsString.split("");
        String[] originalArr = numAsString.split("");
        Collections.reverse(Arrays.asList(reversedArr));
        for(int i = 0; i < originalArr.length; i++) {
            if(Integer.parseInt(originalArr[i]) != Integer.parseInt(reversedArr[i])) {
                isPalindrome = false;
            }
        }

        return isPalindrome;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while(!command.equals("END")) {
            int number = Integer.parseInt(command);
            System.out.println(isPalindrome(number));

            command = scanner.nextLine();
        }
    }
}
