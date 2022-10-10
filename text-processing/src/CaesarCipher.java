import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptedText =new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            int code = (int) text.charAt(i) + 3;
            char newChar = (char) code;
            encryptedText.append(newChar);
        }

        System.out.println(encryptedText);


    }
}
