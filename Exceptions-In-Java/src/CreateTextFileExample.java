import java.io.FileWriter;
import java.io.IOException;

public class CreateTextFileExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            FileWriter file = new FileWriter(fileName);
            try {
                file.write("Some text in the file\n");
                file.write("More text\n");
                file.write("Another text\n");
            } finally {
                file.close();
            }
        } catch (IOException ioex) {
            System.out.println("Failed to write the file: " + fileName);
            ioex.printStackTrace();
        }
    }
}
