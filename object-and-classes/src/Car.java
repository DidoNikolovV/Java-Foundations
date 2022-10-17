import java.util.Scanner;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        if(horsePower == -1) {
            return this.brand + ":" + this.model;
        }
        return this.brand + ":" + this.model + ":" + this.horsePower;
    }

    public static void main(String[] args) {
        // Read the input
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        String model = scanner.nextLine();
        String hp = scanner.nextLine();

        // Create a Car object
        Car car;
        if(hp.equals("")) {
            car = new Car(brand, model);
        } else {
            int horsePower = Integer.parseInt(hp);
            car = new Car(brand, model, horsePower);
        }

        // Print thhe Car object
        System.out.println(car);
    }
}
