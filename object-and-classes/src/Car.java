import java.util.Scanner;

public class Car {
    String brand;
    String model;
    int horsePower;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%d", this.brand, this.model, this.horsePower);
    }

    public static void main(String[] args) {

        var car = new Car("Toyota", "Yaris", 110);
        System.out.println(car);

        Scanner scanner = new Scanner(System.in);

        String brand = scanner.nextLine();
        String model = scanner.nextLine();
        int horsePower = scanner.nextInt();

//        Car car1 = new Car(brand);
//        Car car2 = new Car(brand, model);
//        car.setBrand(brand);
//        car.setModel(model);
//        car.setHorsePower(horsePower);

        System.out.println(car.toString());

    }
}
