import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = "";

        for(int i = 0; i < 3; i++) {
            char letter = sc.next().charAt(0);
            text += letter;
        }

        String reversed = "";

        for(int i=text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i) + " ";
        }

        System.out.println(reversed);
    }
}
