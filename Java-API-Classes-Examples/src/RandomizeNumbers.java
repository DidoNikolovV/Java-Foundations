import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> nums = readNumbers();
        randomizeNumbers(nums);
        printNumbers(nums);
    }


    private static  ArrayList<Integer> readNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true) {
            String line = scanner.nextLine();
            if(line.equals("End")){
                break;
            }

            int num = Integer.parseInt(line);
            numbers.add(num);
        }
        return numbers;
    }

    private static void randomizeNumbers(ArrayList<Integer> nums) {
        Random randNumber = new Random();

        for(int i = 0; i < nums.size(); i++) {
            int randomIndex = randNumber.nextInt(nums.size());
            Swap(nums, i, randomIndex);

        }

    }

    private static void Swap(ArrayList<Integer> nums, int pos1, int pos2) {
        int oldValueAtPos1 = nums.get(pos1);
        nums.set(pos1, nums.get(pos2));
        nums.set(pos2, oldValueAtPos1);
    }

    private static void printNumbers(ArrayList<Integer> nums) {
        for(int num : nums){
            System.out.println(num);
        }
    }
}
