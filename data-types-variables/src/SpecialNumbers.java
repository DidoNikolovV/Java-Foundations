import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int n = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while(number > 0) {
                int digit = number % 10;
                sum += digit;
                number /=10;
            }

            boolean isSpecial = false;

            if(sum == 5 || sum == 7 || sum == 11) {
                isSpecial = true;
            }

            if(isSpecial) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}
