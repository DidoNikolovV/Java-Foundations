import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> participants = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submissions = new LinkedHashMap<>();

        while(true) {
            String command = scanner.nextLine();

            if(command.equals("exam finished")) {
                break;
            }

            String username = command.split("-")[0];
            String language = command.split("-")[1];
            if(language.equals("banned")) {
                participants.remove(username);
                continue;
            }

            int points = Integer.parseInt(command.split("-")[2]);


            if(submissions.get(language) == null) {
                submissions.put(language, 0);
            }

            int previousSubmission = submissions.get(language);
            submissions.put(language, previousSubmission + 1);

            if(participants.get(username) == null) {
                participants.put(username, 0);
            }

            int previousPoints = participants.get(username);
            if(previousPoints < points) {
                participants.put(username, previousPoints + points);
            }

        }

        System.out.println("Results: ");
        for(Map.Entry<String, Integer> entry : participants.entrySet()) {
            String username = entry.getKey();
            int points = entry.getValue();
            System.out.printf("%s | %d%n", username, points);
        }

        System.out.println("Submissions: ");
        for(Map.Entry<String, Integer> entry: submissions.entrySet()) {
            String currentLanguage = entry.getKey();
            int totalSubmissions = entry.getValue();
            System.out.printf("%s - %d%n", currentLanguage, totalSubmissions);
        }
    }
}
