import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseNumbers(scanner.nextLine());

        String command = scanner.nextLine();

        while(!command.equals("End")) {
            String currentCommand = command.split(" ")[0];

            if(currentCommand.equals("Add")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(number);
            } else if(currentCommand.equals("Insert")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if(index < 0 || index >= numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(index, number);
                }

            } else if(currentCommand.equals("Remove")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if(index < 0 || index >= numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(index);

                }
            } else if(currentCommand.equals("Shift")) {
                String leftOrRight = command.split(" ")[1];
                int count = Integer.parseInt(command.split(" ")[2]);

                if(leftOrRight.equals("left")) {
                    for(int i = 0; i < count; i++) {
                        int firstNumber = numbers.remove(0);
                        numbers.add(firstNumber);
                    }
                } else if(leftOrRight.equals("right")) {
                    for(int i = 0; i < count; i++) {
                        int lastNumber = numbers.remove(numbers.size() - 1);
                        numbers.add(0, lastNumber);
                    }
                }
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
