import java.util.Scanner;

public class Orders {
    static void calculateOrderPrice(String product, int quantity) {
        double totalPrice = 0;
        if(product.equals("coffee")) {
            totalPrice = 1.50 * quantity;
        } else if(product.equals("water")) {
            totalPrice = 1.00 * quantity;
        } else if(product.equals("coke")) {
            totalPrice = 1.40 * quantity;
        } else if(product.equals("snacks")) {
            totalPrice = 2.00 * quantity;
        }

        System.out.printf("%.2f", totalPrice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = scanner.nextInt();

        calculateOrderPrice(product, quantity);
    }
}
