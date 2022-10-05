import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = parseNumbers(scanner.nextLine());

        int i = 0;
        double sum = 0;
        while(i + 1 < numbers.size()) {
            double current = numbers.get(i);
            double next = numbers.get(i + 1);
            if(current == next) {
                sum = current + next;
                numbers.remove(i + 1);
                numbers.set(i, sum);
                i = 0;
            } else {
                i++;
            }
        }

        for(double num : numbers) {
            System.out.print(new DecimalFormat("0.###").format(num) + " ");
        }

    }

    private static List<Double> parseNumbers(String line) {
        String[] splitLine = line.split(" ");
        List<Double> numbers = new ArrayList<>();
        for(String item: splitLine) {
            numbers.add(Double.parseDouble(item));
        }

        return numbers;
    }
}
