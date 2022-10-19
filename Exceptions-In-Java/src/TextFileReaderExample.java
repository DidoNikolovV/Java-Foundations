import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderExample {
    static String readTextFile(String fName) throws IOException {
        BufferedReader reader =
                new BufferedReader(new FileReader(fName));
        StringBuilder result = new StringBuilder();
        try {
            String line;
            while((line = reader.readLine()) != null) {
                result.append(line + System.lineSeparator());
            }
        }finally {
            reader.close();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String fileName = "./src/TextFileReaderExample.java";
        try {
            String sourceCode = readTextFile(fileName);
            System.out.println(sourceCode);
        } catch(IOException ioex) {
            System.err.println("Cannot read file: " + fileName);
            ioex.printStackTrace();
        }
    }
}
