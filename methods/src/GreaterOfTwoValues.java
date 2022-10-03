import java.util.Scanner;

public class GreaterOfTwoValues {
    static int getMax(int value1, int value2) {
        if(value1 > value2) {
            return value1;
        }
        return value2;
    }

    static char getMax(char value1, char value2) {
        if((int) value1 > (int) value2) {
            return value1;
        }
        return value2;
    }

    static String getMax(String value1, String value2) {
        if(value1.compareTo(value2) >= 0) {
            return value1;
        }
        return value2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputType = scanner.nextLine();

        if(inputType.equals("int")) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(getMax(num1, num2));
        } else if(inputType.equals("char")) {
            char ch1 = scanner.nextLine().charAt(0);
            char ch2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(ch1, ch2));
        } else {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(getMax(str1, str2));
        }
    }
}
