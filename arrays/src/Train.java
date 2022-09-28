import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(sc.nextLine());
        int[] people = new int[wagonsCount];

        for(int i = 0; i< wagonsCount; i++) {
            people[i] = Integer.parseInt(sc.nextLine());
        }

        int sum = 0;
        for(int p : people) {
            System.out.print(p + " ");
            sum += p;
        }

        System.out.printf("\n%d", sum);

    }
}
