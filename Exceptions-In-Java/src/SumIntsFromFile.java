import java.io.IOException;

public class SumIntsFromFile {
    public static void main(String[] args) throws IOException {
            var ints = FileParser.readIntsFromTextFile("nums.txt");
            long sum = 0;
            for(int x : ints) {
                sum += x;
            }
            System.out.println("Sum = " + sum);
    }
}
