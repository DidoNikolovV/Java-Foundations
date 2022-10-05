import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseNumbers(scanner.nextLine());
        int half = numbers.size() / 2;
        List<Integer> resultList = new ArrayList<>();

        for(int i = 0; i < half; i++) {
            int first = numbers.get(i);
            int last = numbers.get(numbers.size() - 1 - i);
            int sum = first + last;
            resultList.add(sum);
        }

        int halfNumber;
        if(numbers.size() % 2 != 0) {
            halfNumber = numbers.get(half);
            resultList.add(halfNumber);
        }
        for(int num : resultList) {
            System.out.print(num + " ");
        }

    }

    static List<Integer> parseNumbers(String line) {
        String[] splittedLine = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for(String item : splittedLine) {
            numbers.add(Integer.parseInt(item));
        }

        return numbers;
    }
}
