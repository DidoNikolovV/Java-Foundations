import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> usersInfo = new LinkedHashMap<>();

        for(int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            if(command.equals("register")) {
                String username = input[1];
                String licensePlateNumber = input[2];
                if(licensePlateNumber.equals(usersInfo.get(username))) {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                } else {
                    usersInfo.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                }
            } else if(command.equals("unregister")) {
                String username = input[1];
                if(usersInfo.get(username) == null) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    usersInfo.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        for(Map.Entry<String, String> entry: usersInfo.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
