import java.util.Scanner;

public class MiddleCharacters {
    static void printMiddleCharacters(String text) {
        String middleChars = "";
        int middle = text.length() / 2;
        if(text.length() % 2 == 0) {
            for(int i = 0 ; i <= middle; i++) {
                if(i == middle - 1 || i == middle) {
                    middleChars += text.charAt(i);
                }
            }
        } else {
            for(int i = 0; i <= middle; i++) {
                if(i == middle) {
                    middleChars += text.charAt(i);
                }
            }
        }

        System.out.println(middleChars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        printMiddleCharacters(input);

    }
}
