import java.util.*;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phrases = new ArrayList<>();
        phrases.add("Excellent product");
        phrases.add("Such a great product.");
        phrases.add("I always use that product");
        phrases.add("Best product of its category.");
        phrases.add("Exceptional product.");
        phrases.add("I can’t live without this product.");

        List<String> events = new ArrayList<>();
        events.add("Now I feel good.");
        events.add("I have succeeded with this product.");
        events.add("Makes miracles.");
        events.add("I am happy of the results!");
        events.add("I cannot believe but now I feel awesome.");
        events.add("Try it yourself, I am very satisfied.");
        events.add("I feel great!");

        List<String> authors = new ArrayList<>();
        authors.add("Diana");
        authors.add("Petya");
        authors.add("Stella");
        authors.add("Elena");
        authors.add("Katya");
        authors.add("Iva");
        authors.add("Annie");
        authors.add("Eve");

        List<String> cities = new ArrayList<>();
        cities.add("Burgas");
        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add("Varna");
        cities.add("Ruse");

        Random rnd = new Random();
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.printf("%s %s %s - %s%n",
                    phrases.get(rnd.nextInt(phrases.size())),
                    events.get(rnd.nextInt(events.size())),
                    authors.get(rnd.nextInt(authors.size())),
                    cities.get(rnd.nextInt(cities.size()))
            );
        }
    }
}
