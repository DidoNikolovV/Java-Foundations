import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    static boolean isValidLength(String username) {
        if(username.length() >= 3 && username.length() <= 16) {
            return true;
        }
        return false;
    }

    static boolean containsOnlyNumsLettersHyphnesAndUnderscores(String username) {
        for(int i = 0; i < username.length();i ++) {
            char currentChar = username.charAt(i);
            if(!Character.isAlphabetic(currentChar)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");
        List<String> validUsernames = new ArrayList<>();

        for(String username : usernames) {
            if(isValidLength(username) && containsOnlyNumsLettersHyphnesAndUnderscores(username)) {
                validUsernames.add(username);
            }
        }

        System.out.println(validUsernames);
    }
}
