package main;

class Vehicle {
    String manufacturer;
    String model;
    int maxSpeed;
    Engine engine;

    public Vehicle(String manufacturer, String model, int maxSpeed, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public String getInfo() {
        return manufacturer + " " + model + "\n" + "Moottori: " + "\n";
    }
}