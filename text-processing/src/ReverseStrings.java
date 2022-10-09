import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        while(!text.equals("end")) {
            StringBuilder reversed = new StringBuilder();
            for(int i = text.length() - 1; i >= 0; i--) {
                reversed.append(text.charAt(i));
            }

            System.out.printf("%s = %s%n", text, reversed.toString());
            text = scanner.nextLine();
        }

    }
}
