
import java.util.*;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseNumbers(scanner.nextLine());

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String currentCommand = command.split(" ")[0];

            if(currentCommand.equals("Contains")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                if(numbers.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if(currentCommand.equals("Print")) {
                if(command.split(" ")[1].equals("even")) {
                    for(int num : numbers) {
                        if(num % 2 == 0) {
                            System.out.print(num + " ");
                        }
                    }
                } else {
                    for(int num : numbers) {
                        if(num % 2 != 0) {
                            System.out.print(num + " ");
                        }
                    }
                }
                System.out.println();
            } else if(currentCommand.equals("Get")) {
                int sum = 0;
                for(int num : numbers) {
                    sum += num;
                }

                System.out.println(sum);
            } else if(currentCommand.equals("Filter")) {
                String condition = command.split(" ")[1];
                int number = Integer.parseInt(command.split(" ")[2]);
                if(condition.equals("<")) {
                    for(int num : numbers) {
                        if(num < number) {
                            System.out.print(num + " ");
                        }
                    }
                } else if(condition.equals(">")) {
                    for(int num : numbers) {
                        if(num > number) {
                            System.out.print(num + " ");
                        }
                    }
                } else if(condition.equals(">=")) {
                    for(int num : numbers) {
                        if(num >= number) {
                            System.out.print(num + " ");
                        }
                    }
                }else if(condition.equals("<=")) {
                    for(int num : numbers) {
                        if(num <= number) {
                            System.out.print(num + " ");
                        }
                    }
                }
                System.out.println();

            }

            command = scanner.nextLine();
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
