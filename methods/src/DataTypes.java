import java.util.Scanner;


public class DataTypes {

    static void multiplyBy2(int number) {
        int result = number * 2;
        System.out.println(result);
    }

    static void multiplyAndFormat(double number) {
        double result = number * 1.5;
        System.out.printf("%.2f", result);
    }

    static void surroundWith$(String text) {
        System.out.printf("$%s$", text);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if(type.equals("int")) {
            int number = scanner.nextInt();
            multiplyBy2(number);
        } else if(type.equals("real")) {
            double number = Double.parseDouble(scanner.nextLine());
            multiplyAndFormat(number);
        } else if(type.equals("string")) {
            String text = scanner.nextLine();
            surroundWith$(text);
        }
    }
}
