import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> companyInfo = new LinkedHashMap<>();

        while(!command.equals("End")) {
            String companyName = command.split(" -> ")[0];
            String employeeID = command.split(" -> ")[1];

            List<String> currentEmployeesID = new ArrayList<>();
            if(companyInfo.get(companyName) == null) {
                currentEmployeesID.add(employeeID);
                companyInfo.put(companyName, currentEmployeesID);
            } else {
                currentEmployeesID = companyInfo.get(companyName);
                if(!currentEmployeesID.contains(employeeID)) {
                    currentEmployeesID.add(employeeID);
                }
            }
            command = scanner.nextLine();
        }

        for(Map.Entry<String, List<String>> entry : companyInfo.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for(String employeeID : entry.getValue()) {
                System.out.printf("-- %s%n", employeeID);
            }
        }
    }
}
