import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = parseNumbers(scanner.nextLine());

        int eachWagonMaxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while(!command.equals("end")) {
            if(command.split(" ")[0].equals("Add")) {
                int passengers = Integer.parseInt(command.split(" ")[1]);
                wagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(command.split(" ")[0]);
                int pos = 0;
                while(pos < wagons.size()) {
                    int currentWagon = wagons.get(pos);
                    int sum = currentWagon + passengers;
                    if(sum <= eachWagonMaxCapacity) {
                        wagons.set(pos, sum);
                        break;
                    }

                    pos++;
                }
            }

            command = scanner.nextLine();
        }

        for(int wagon : wagons) {
            System.out.print(wagon + " ");
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
