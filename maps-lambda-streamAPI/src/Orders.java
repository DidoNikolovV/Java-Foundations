import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> products = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while(!command.equals("buy")) {
            String[] input = command.split(" ");
            String product = input[0];
            double price = Double.parseDouble(input[1]);
            double quantity = Double.parseDouble(input[2]);
            List<Double> priceAndQuantity = new ArrayList<>();

            if(products.get(product) == null) {
                priceAndQuantity.add(price);
                priceAndQuantity.add(quantity);
                products.put(product, priceAndQuantity);
            } else {
                List<Double> currentPriceAndQuantity = products.get(product);
                double currentQuantity = currentPriceAndQuantity.get(1);
                double currentPrice = currentPriceAndQuantity.get(0);
                currentQuantity += quantity;
                currentPriceAndQuantity.set(0, currentQuantity);
                if(currentPrice != price) {
                    currentPriceAndQuantity.set(1, price);
                }
                products.put(product, currentPriceAndQuantity);
            }


            command = scanner.nextLine();
        }
        for(Map.Entry<String, List<Double>> entry : products.entrySet()) {
            double totalPrice = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }

    }
}
