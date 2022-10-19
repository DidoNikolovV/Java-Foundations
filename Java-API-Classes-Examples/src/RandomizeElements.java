import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomizeElements {
    public static void main(String[] args) {
        ArrayList<String> elements = readElements();
        randomizeElements(elements);
        printElements(elements);
    }


    private static <T> ArrayList<T> readElements() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<T> elements = new ArrayList<>();
        while(true) {
            T line = (T) scanner.nextLine();
            if(line.equals("End")){
                break;
            }

            elements.add(line);
        }
        return elements;
    }

    private static <T> void randomizeElements(ArrayList<T> nums) {
        Random randNumber = new Random();

        for(int i = 0; i < nums.size(); i++) {
            int randomIndex = randNumber.nextInt(nums.size());
            Swap(nums, i, randomIndex);

        }

    }

    private static <T> void Swap(ArrayList<T> nums, int pos1, int pos2) {
        T oldValueAtPos1 = nums.get(pos1);
        nums.set(pos1, nums.get(pos2));
        nums.set(pos2, oldValueAtPos1);
    }

    private static <T> void printElements(ArrayList<T> nums) {
        for(var num : nums){
            System.out.println(num);
        }
    }
}
