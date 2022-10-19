import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderExample {
    static String readTextFile(String fName)
            throws IOException, FileParseException {
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

    public static void main(String[] args)
            throws IOException  {
        try {
            String fileName = "./src/TextFileReaderExample.java";
            String sourceCode = readTextFile(fileName);
            System.out.println(sourceCode);
        } catch(FileParseException ex) {
            System.out.println("Error parsing:");
            System.out.println("Line: " + ex.getLineNumber());
            System.out.println("Incorrect text: " + ex.getLineText());

        }
    }
}
