import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String[] items = inputLine.split(" ");
        int[] numbers = new int[items.length];

        for(int i = 0; i < items.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }

        String command = sc.nextLine();
        while(!command.equals("end")) {
            String[] commands = command.split(" ");
            String currentCommand = commands[0];
            if(currentCommand.equals("decrease")) {
                for(int i = 0; i < numbers.length; i++) {
                    numbers[i]--;
                }
            } else {
                int index1 = Integer.parseInt(commands[1]);
                int index2 = Integer.parseInt(commands[2]);

                if(currentCommand.equals("swap")) {
                    int firstNumber = numbers[index1];
                    numbers[index1] = numbers[index2];
                    numbers[index2] = firstNumber;
                } else if(currentCommand.equals("multiply")) {
                    int product = numbers[index1] * numbers[index2];
                    numbers[index1] = product;
                }
            }

            command = sc.nextLine();
        }


        for(int i = 0; i <numbers.length; i++) {
            if(i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }


    }
}
