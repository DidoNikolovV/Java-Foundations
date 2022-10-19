import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseNumbers(scanner.nextLine());
        String line = scanner.nextLine();
        int bomb = Integer.parseInt(line.split(" ")[0]);
        int power = Integer.parseInt(line.split(" ")[1]);

        List<Integer> specialPositions = new ArrayList<>();

        int specialPosition = 0;
        while(specialPosition < numbers.size()) {
            int currentNumber = numbers.get(specialPosition);
            if(currentNumber == bomb) {
                specialPositions.add(specialPosition);
            }
            specialPosition++;;
        }

        for(int specPos: specialPositions) {
            System.out.print(specPos + " ");
        }

        System.out.println();
        browse(numbers, bomb, power);
        System.out.println();


//       if(specialPositions.size() == 0) {
//           System.out.println("No bombs");
//       } else {
//           for(int i : specialPositions) {
//               System.out.println(i);
//           }
//       }



//        int sum = 0;
//        for(int number : numbers) {
//           sum += number;
//        }
//
//        System.out.println(sum);

    }

    static List<Integer> parseNumbers(String line) {
        String[] splittedLine = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for(String item : splittedLine) {
            numbers.add(Integer.parseInt(item));
        }

        return numbers;
    }

    static void browse(List<Integer> numbers, int bomb, int power) {
        int pos = 0;
        boolean isLeftExplored = false;
        boolean isRightExplored = false;
        while(pos < numbers.size()) {
            int currentNumber = numbers.get(pos);
            if(currentNumber == bomb) {
                if(!isLeftExplored) {
                    for(int i = 0; i < power; i++) {
                        int idx = pos - i - 1;
                        numbers.remove(idx);
                    }
                    pos = 0;
                    isLeftExplored = true;
                } else {
                    for(int i = 0; i < power; i++) {
                        int idx = pos + 1;
                        if(idx == numbers.size()) {
                            break;
                        }
                        numbers.remove(idx);
                    }
                    isRightExplored = true;
                }

                if(isLeftExplored && isRightExplored) {
                    numbers.remove(pos);
                    break;
                }
            } else {
                pos++;
            }
        }
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
