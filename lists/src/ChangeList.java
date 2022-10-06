import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseNumbers(scanner.nextLine());

        String command = scanner.nextLine();

        while(!command.equals("end")) {
            String currentCommand = command.split(" ")[0];

            if(currentCommand.equals("Delete")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                int pos = 0;
                while(pos < numbers.size()) {
                    int currentNumber = numbers.get(pos);
                    if(currentNumber == element) {
                        numbers.remove(pos);
                    }
                    pos++;
                }
            } else if(currentCommand.equals("Insert")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, element);
            }

            command = scanner.nextLine();
        }

        for(int num : numbers) {
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
