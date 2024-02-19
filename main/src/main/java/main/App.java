package main;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        int choice;
        do {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                    int vehicleType = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.println("Anna kulkuneuvon valmistaja:");
                    String manufacturer = scanner.nextLine();

                    System.out.println("Anna kulkuneuvon malli:");
                    String model = scanner.nextLine();

                    System.out.println("Anna kulkuneuvon huippunopeus:");
                    int maxSpeed = scanner.nextInt();

                    switch (vehicleType) {
                        case 1:
                            Engine carEngine = new Engine("V8", 300);
                            vehicles.add(new Car(manufacturer, model, maxSpeed, carEngine));
                            break;
                        case 2:
                            Engine planeEngine = new Engine("Suihkumoottori", 500);
                            vehicles.add(new Plane(manufacturer, model, maxSpeed, planeEngine));
                            break;
                        case 3:
                            Engine shipEngine = new Engine("Wärtsilä Super", 1000);
                            vehicles.add(new Ship(manufacturer, model, maxSpeed, shipEngine));
                            break;
                        default:
                            System.out.println("Virheellinen valinta!");
                            break;
                    }
                    break;
                case 2:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle.getClass().getSimpleName().contains("Car")) {
                            System.out.println("auto: " + vehicle.manufacturer + " " + vehicle.model);
                        } else if (vehicle.getClass().getSimpleName().contains("Plane")) {
                            System.out.println("lentokone: " + vehicle.manufacturer + " " + vehicle.model);
                        } else {
                            System.out.println("laiva: " + vehicle.manufacturer + " " + vehicle.model);
                        }

                        System.out.println("Moottori: " + vehicle.engine.name + " " + vehicle.engine.power + "kW" + "\n" + "Huippunopeus: " + vehicle.maxSpeed + "km/h\n");
                    }
                    break;
                case 3:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Car) {
                            ((Car) vehicle).drive();
                        }
                    }
                    break;
                case 4:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Plane) {
                            ((Plane) vehicle).fly();
                        }
                    }
                    break;
                case 5:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Ship) {
                            ((Ship) vehicle).sail();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;
                default:
                    System.out.println("Virheellinen valinta!");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
