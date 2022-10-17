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
        Car c = new Car("Toyota", "Yaris", 110);
        System.out.println(c);
    }
}
