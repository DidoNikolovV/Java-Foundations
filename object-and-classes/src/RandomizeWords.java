import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayWords = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for(int i = 0; i < arrayWords.length; i++) {
            int index = rnd.nextInt(arrayWords.length);
            String randomWord = arrayWords[index];
            arrayWords[index] = arrayWords[i];
            arrayWords[i] = randomWord;
        }

        for(String word : arrayWords) {
            System.out.println(word);
        }
    }
}
