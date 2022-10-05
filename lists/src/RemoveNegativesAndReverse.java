import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseNumbers(scanner.nextLine());

        int i = 0;
        while(i < numbers.size()) {
            if(numbers.get(i) < 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }

        Collections.reverse(numbers);
        if(numbers.size() == 0) {
            System.out.println("empty");
        } else {
            for(int number: numbers) {
                System.out.printf(number + " ");
            }
        }
    }

    private static List<Integer> parseNumbers(String line) {
        String[] splitLine = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for(String item: splitLine) {
            numbers.add(Integer.parseInt(item));
        }

        return numbers;
    }
}
