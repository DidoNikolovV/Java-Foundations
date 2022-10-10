import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();

        int match = text.indexOf(word);
        while(match != - 1) {
            text = text.replace(word, "");

            match = text.indexOf(word);
        }

        System.out.println(text );
    }
}
