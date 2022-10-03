import java.util.Scanner;


public class PasswordValidator {
    static boolean checkLength(String password) {
        boolean isValid = false;
        if(password.length() >= 6 && password.length() <= 10) {
            isValid = true;
        }
        return isValid;
    }

    static boolean containsOnlyLettersAndDigits(String password) {
        boolean isValid = true;
        for(int i = 0; i < password.length(); i++) {
            if(!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
                isValid = false;
            }
        }

        return isValid;
    }

    static boolean containsAtLeast2Digits(String password) {
        int digitsCount = 0;
        for(int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))) {
                digitsCount++;
            }
        }

        if(digitsCount >= 2) {
            return true;
        }

        return false;
    }

    static void validatePassword(String password) {
        if(!checkLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if(!containsOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if(!containsAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }


        if(checkLength(password) && containsOnlyLettersAndDigits(password) && containsAtLeast2Digits(password)) {
            System.out.println("Password is valid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        validatePassword(password);

    }
}
