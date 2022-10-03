import java.util.Scanner;

public class VowelsCount {
    static void printVowels(String text) {
        int vowelsCount = 0;
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};
        String[] textArray = text.split("");
        for(String letter: textArray) {
            for(int i = 0; i < vowels.length; i++) {
                if(letter.toLowerCase().equals(vowels[i])) {
                    vowelsCount++;
                }
            }
        }

        System.out.println(vowelsCount);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printVowels(input);
    }
}
