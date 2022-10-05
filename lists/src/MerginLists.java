import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MerginLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersA = parseNumbers(scanner.nextLine());
        List<Integer> numbersB = parseNumbers(scanner.nextLine());

        int range = Math.max(numbersA.size(), numbersB.size());
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < range; i++) {
            if(numbersA.size() > i) {
                result.add(numbersA.get(i));
            }

            if(numbersB.size() > i) {
                result.add(numbersB.get(i));
            }
        }

        for(int num : result) {
            System.out.print(num + " ");
        }
    }

    static List<Integer> parseNumbers(String line) {
        String[] splittedLine = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for(String item : splittedLine) {
            numbers.add(Integer.parseInt((item)));
        }

        return numbers;
    }
}
