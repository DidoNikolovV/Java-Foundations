import java.util.Scanner;

public class Grades {
    static void grade(double number) {
        String grade = "";
        if(number >= 2 && number <= 2.99) {
            grade = "Fail";
        } else if(number >= 3 && number <= 3.49) {
            grade = "Poor";
        } else if(number >= 3.50 && number <= 4.49) {
            grade = "Good";
        } else if(number >= 4.50 && number <= 5.49) {
            grade = "Very good";
        } else if(number >= 5.50 && number <= 6.00) {
            grade = "Excellent";
        }

        System.out.println(grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        grade(input);
    }
}
