import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String chr = "\\|";
        String[] loot = inputLine.split(chr);

        String command = sc.nextLine();
        while(!command.equals("Yohoho!")) {
            String[] commands = command.split(" ");
            String currentCommand = commands[0];

            if(currentCommand.equals("Loot")) {
                int count = 0;
                String[] itemsToLoot = new String[commands.length - 1];
                for(int i = 1; i < commands.length; i++) {
                    String currentItem = commands[i];
                    for(String item : loot) {
                        if(currentItem.equals(item)) {
                            break;
                        } else {
                            count++;
                            itemsToLoot[i - 1] = currentItem;
                            break;
                        }
                    }
                }

                String[] itemsToAdd = new String[count];
                int length = itemsToAdd.length + loot.length;
                String[] itemsResult = new String[length];
                int pos = 0;

                for(int i = itemsToLoot.length - 1; i >= 0; i--) {
                    String el = itemsToLoot[i];
                    if(el != null) {
                        itemsResult[pos] = el;
                        pos++;
                    }
                }

                for(String el : loot) {
                    itemsResult[pos] = el;
                    pos++;
                }

            }
            command = sc.nextLine();
        }
    }
}
