import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseNumbers(scanner.nextLine());

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String currentCommand = command.split(" ")[0];

            if(currentCommand.equals("Add")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(number);
            } else if(currentCommand.equals("Insert")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, number);
            } else if(currentCommand.equals("Remove")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(number));
            } else if(currentCommand.equals("RemoveAt")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(index);
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
