import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : input) {
            String newWord = word.repeat(word.length());
            result.append(newWord);
        }

        System.out.println(result.toString());

    }
}
