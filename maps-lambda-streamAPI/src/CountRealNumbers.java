import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = scanner.nextLine().split(" ");
        Map<Double, Integer> numberOccurrences = new TreeMap<>();
        for(String item: items) {
            double number = Integer.parseInt(item);

            Integer occurrences = numberOccurrences.get(number);

            if(occurrences == null) {
                numberOccurrences.put(number, 1);
            } else {
                numberOccurrences.put(number, occurrences + 1);
            }
        }

        for(Map.Entry<Double, Integer> entry : numberOccurrences.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
