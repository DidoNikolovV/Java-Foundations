import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> handsA = parseNumbers(scanner.nextLine());
        List<Integer> handsB = parseNumbers(scanner.nextLine());

        String winner = "";

        int pos = 0;
        while(handsA.size() > 0 && handsB.size() > 0) {
            int playerACard = handsA.get(pos);
            int playerBCard = handsB.get(pos);

            if(playerACard > playerBCard) {
                handsA.remove(pos);
                handsB.remove(pos);
                handsA.add(playerACard);
                handsA.add(playerBCard);
            } else if(playerBCard > playerACard) {
                handsA.remove(pos);
                handsB.remove(pos);
                handsB.add(playerBCard);
                handsB.add(playerACard);
            } else {
                handsA.remove(pos);
                handsB.remove(pos);
            }
        }

        int sum = 0;
        if(handsB.size() == 0) {
            winner = "First";
            for(int card : handsA) {
                sum += card;
            }
        } else {
            winner = "Second";
            for(int card : handsB) {
                sum += card;
            }
        }

        System.out.printf("%s player wins! Sum: %d", winner, sum);

    }

    static List<Integer> parseNumbers(String line) {
        String[] splittedLine = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for(String item : splittedLine) {
            numbers.add(Integer.parseInt(item));
        }

        return numbers;
    }
}
