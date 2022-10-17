import java.util.Scanner;

public class Car {
    String brand;
    String model;
    int horsePower;

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
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        String brand = scanner.nextLine();
        String model = scanner.nextLine();
        int horsePower = scanner.nextInt();
        car.setBrand(brand);
        car.setModel(model);
        car.setHorsePower(horsePower);

        System.out.println(car.toString());

    }
}
