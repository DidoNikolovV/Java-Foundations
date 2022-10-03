import java.util.Scanner;

public class CharactersInRange {
    static void printCharsInRange(char ch1, char ch2) {
        int ch1Code = (int) ch1;
        int ch2Code = (int) ch2;
        for(int i = ch1Code + 1; i < ch2Code; i++) {
            System.out.print((char) i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        printCharsInRange(char1, char2);
    }
}
