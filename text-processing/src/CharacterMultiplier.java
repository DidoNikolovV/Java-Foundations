import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");
        String first = strings[0];
        String second = strings[1];

        int totalSum = 0;

        if(first.length() > second.length()) {
            for(int i = 0; i < second.length(); i++) {
                totalSum += (int)first.charAt(i) * (int)second.charAt(i);
            }

            for(int j = second.length(); j < first.length(); j++) {
                totalSum += (int) first.charAt(j);
            }
        } else {
            for(int i = 0; i < first.length(); i++) {
                totalSum += (int)first.charAt(i) * (int)second.charAt(i);
            }

            for(int j = first.length(); j < second.length(); j++) {
                totalSum += (int) second.charAt(j);
            }
        }

        System.out.println(totalSum);
    }
}
