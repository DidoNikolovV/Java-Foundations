import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter = sc.next().charAt(0);
        if(Character.isLowerCase(letter)) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
