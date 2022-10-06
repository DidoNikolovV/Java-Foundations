import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for(int i = 0; i < numberOfCommands; i++) {
            String command = scanner.nextLine();

            if(command.contains("is going!")) {
                String name = command.split(" ")[0];
                if(guests.size() == 0) {
                    guests.add(name);
                } else {
                    boolean isInTheList = false;
                    for(String guest : guests) {
                        if(guest.equals(name)) {
                            isInTheList = true;
                            break;
                        }
                    }
                    if(isInTheList) {
                        System.out.println(name + " is already in the list!");
                    } else {
                        guests.add(name);
                    }
                }
            } else if(command.contains("is not going!")) {
                String name = command.split(" ")[0];
                boolean isInTheList = false;
                int pos = 0;
                for(String guest : guests) {
                    if(guest.equals(name)) {
                        guests.remove(pos);
                        isInTheList = true;
                        break;
                    }
                    pos++;
                }


                if(!isInTheList) {
                    System.out.println(name + " is not in the list!");
                }
            }
        }

        for(String guest : guests) {
            System.out.println(guest);
        }
    }
}
