import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentsInfo = new LinkedHashMap<>();
        for(int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());
            List<Double> grades = new ArrayList<>();


            if(studentsInfo.get(studentName) == null) {
                grades.add(grade);
                studentsInfo.put(studentName, grades);
            } else {
                List<Double> currentGrades = studentsInfo.get(studentName);
                currentGrades.add(grade);
                studentsInfo.put(studentName, currentGrades);
            }
        }

        LinkedHashMap<String, Double> bestStudents = new LinkedHashMap<>();

        for(Map.Entry<String, List<Double>> entry: studentsInfo.entrySet()) {
            double averageGrade = 0;
            String studentName = entry.getKey();
            for(double grade: entry.getValue()) {
                averageGrade += grade;
            }
            averageGrade /= entry.getValue().size();
            if(averageGrade >= 4.50) {
                bestStudents.put(studentName, averageGrade);
            }
        }
        for(Map.Entry<String, Double> entry: bestStudents.entrySet()) {
            String studentName = entry.getKey();
            double averageGrade =entry.getValue();
            System.out.printf("%s -> %.2f%n", studentName, averageGrade);
        }

    }
}
