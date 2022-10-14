import java.security.Key;
import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> forceInfo = new LinkedHashMap<>();

        while(true) {
            String input = scanner.nextLine();
            if(input.equals("Lumpawaroo")) {
                break;
            }
            String[] splittedInput = input.split(" ");
            String delimeter = "";
            for(String el: splittedInput) {
                if(el.equals("->") || el.equals("|")){
                    delimeter = el;
                }
            }

            List<String> currentUsers = new ArrayList<>();
            boolean userFound = false;
            if(delimeter.equals("|")) {
                int delimeterIndex = input.indexOf("|");
                String forceSide = input.substring(0, delimeterIndex).trim();
                String forceUser = input.substring(delimeterIndex + 2).trim();

                for(Map.Entry<String, List<String>> entry : forceInfo.entrySet()) {

                    for (String user : entry.getValue()) {
                        if (user.equals(forceUser)) {
                            userFound = true;
                            break;
                        }
                    };
                }

                if(userFound) {
                    break;
                } else if(!userFound && forceInfo.get(forceSide) != null) {
                    currentUsers = forceInfo.get(forceSide);
                    currentUsers.add(forceUser);
                    forceInfo.put(forceSide, currentUsers);
                } else {
                    currentUsers.add(forceUser);
                    forceInfo.put(forceSide, currentUsers);
                }
            } else if(delimeter.equals("->")) {
                int delimeterIndex = input.indexOf("->");
                String forceUser =  input.substring(0, delimeterIndex).trim();
                String forceSide = input.substring(delimeterIndex + 2).trim();

                for(Map.Entry<String, List<String>> entry : forceInfo.entrySet()) {
                    currentUsers = entry.getValue();
                    String currentSide = entry.getKey();
                    for (String user : currentUsers) {
                        if (user.equals(forceUser)) {
                            userFound = true;
                            currentUsers.remove(user);
                            forceInfo.put(currentSide, currentUsers);
                            break;
                        }
                    }
                }

                if(userFound) {
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                    currentUsers = forceInfo.get(forceSide);
                    currentUsers.add(forceUser);
                    forceInfo.put(forceSide, currentUsers);
                } else if(!userFound) {
                    System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                    currentUsers = forceInfo.get(forceSide);
                    currentUsers.add(forceUser);
                    forceInfo.put(forceSide, currentUsers);
                } else {
                    currentUsers.add(forceUser);
                    forceInfo.put(forceSide, currentUsers);
                }
            }
        }

        for(Map.Entry<String, List<String>> entry : forceInfo.entrySet()) {
            List<String> members = entry.getValue();
            if(members.size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for(String member: members) {
                    System.out.printf("! %s%n", member);
                }
            }

        }
    }

}
