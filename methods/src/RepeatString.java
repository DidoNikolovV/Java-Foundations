import java.util.Scanner;

public class RepeatString {
    static String repeatString(String string, int count) {
        String result = "";
        for(int i = 0; i < count; i++) {
           result += string;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int inputCount = scanner.nextInt();

        System.out.println(repeatString(inputString, inputCount));
    }
}
