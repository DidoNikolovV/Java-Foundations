import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> coursesInfo = new LinkedHashMap<>();

        while(!command.equals("end")) {
            String[] input = command.split(" : ");
            String courseName = input[0];
            String studentName = input[1];

            List<String> students = new ArrayList<>();

            if(coursesInfo.get(courseName) == null) {
                students.add(studentName);
                coursesInfo.put(courseName, students);
            } else {
                List<String> currentStudents = coursesInfo.get(courseName);
                currentStudents.add(studentName);
                coursesInfo.put(courseName, currentStudents);
            }

            command = scanner.nextLine();
        }

        for(Map.Entry<String, List<String>> entry: coursesInfo.entrySet()) {
            List<String> registeredStudents = entry.getValue();
            System.out.printf("%s: %d%n", entry.getKey(), registeredStudents.size());
            for(String student: registeredStudents) {
                System.out.printf("-- %s%n", student);
            }
        }
    }
}
