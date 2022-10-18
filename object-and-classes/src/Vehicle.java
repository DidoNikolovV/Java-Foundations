import java.lang.reflect.Array;
import java.util.*;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        String type = this.type.substring(0, 1).toUpperCase() + this.type.substring(1);
        return
                "Type: " + type + '\n' +
                "Model: " + this.model + '\n' +
                "Color: " + this.color + '\n' +
                "Horsepower: " + this.horsePower;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Vehicle> vehicles = new HashMap<>();
        String command = scanner.nextLine();
        double totalHorsePowers = 0;
        boolean closed = false;
        while(true){
            String[] cmdParts = command.split(" ");
            if(cmdParts[0].equals("End")) {
                while(true) {
                    String model = scanner.nextLine();
                    if(model.equals("Close the Catalogue")){
                        closed = true;
                        break;
                    } else {
                        Vehicle currentVehicle = vehicles.get(model);
                        System.out.println(currentVehicle.toString());
                    }

                }
            } else {
                String type = cmdParts[0];
                String model = cmdParts[1];
                String color = cmdParts[2];
                int horsePower = Integer.parseInt(cmdParts[3]);
                Vehicle vehicle = new Vehicle(type, model, color, horsePower);
                vehicles.put(vehicle.getModel(), vehicle);
                totalHorsePowers+= horsePower;
            }

            if(closed) {
                break;
            }
            command = scanner.nextLine();
        }

        double carsHorsePower = 0;
        double cars = 0;
        double trucksHorsePower = 0.0;
        double trucks = 0;
        for(Map.Entry<String, Vehicle> entry : vehicles.entrySet()) {
            Vehicle currentVehicle = entry.getValue();
            if(currentVehicle.getType().equals("car")) {
                carsHorsePower+= currentVehicle.getHorsePower();
                cars++;
            } else if(currentVehicle.getType().equals("truck")) {
                trucksHorsePower+= currentVehicle.getHorsePower();
                trucks++;
            }
        }

        double carsAvrg = 0;
        double trucksAvrg = 0;
        if(cars != 0) {
            carsAvrg = carsHorsePower / cars;
        }

        if(trucks != 0) {
            trucksAvrg = trucksHorsePower / trucks ;
        }


        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAvrg);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksAvrg);

    }
}
