import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for(String word : bannedWords) {
            int match = text.indexOf(word);
            while(match != -1) {
                text = text.replace(word, "*".repeat(word.length()));

                match = text.indexOf(word);
            }
        }

        System.out.println(text);
    }
}
