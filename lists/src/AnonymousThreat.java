import java.util.*;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = parseStrings(scanner.nextLine());
        List<String> merged = new ArrayList<>();

        String command = scanner.nextLine();
        while(!command.equals("3:1")) {
            String currentCommand = command.split(" ")[0];
            if(currentCommand.equals("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                for(int i = startIndex + 1; i <= endIndex; i++) {
                    String initialString = strings.get(startIndex);
                    String nextString = strings.get(i);
                    String mergedString = initialString + nextString;
                    strings.set(startIndex, mergedString);
                }


            } else if(currentCommand.equals("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);


            }


            command = scanner.nextLine();
        }

    }

    static List<String> parseStrings(String line) {
        String[] splittedLine = line.split(" ");
        List<String> strings = new ArrayList<>();
        for(String el : splittedLine) {
            strings.add(el);
        }

        return strings;
    }
}
