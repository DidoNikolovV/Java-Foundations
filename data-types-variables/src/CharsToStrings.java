import java.util.Scanner;

public class CharsToStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";

        for(int i = 0; i < 3; i++) {
            char letter = scanner.next().charAt(0);
            text+=  letter;
        }

        System.out.println(text);
    }
}
