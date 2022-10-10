import java.util.Scanner;
import java.util.regex.Pattern;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String separator = "\\";
        String fileSeparator = ".";
        String input = scanner.nextLine();
        String[] filePath = input.split(Pattern.quote(separator));
        String file = filePath[filePath.length-1];
        String[] fileInfo = file.split(Pattern.quote(fileSeparator));


        String name = fileInfo[0];
        String extension = fileInfo[1];

        System.out.printf("File name: %s%n", name);
        System.out.printf("File extension: %s%n", extension);

    }
}
