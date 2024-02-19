package main;

class Plane extends Vehicle {
    Engine engine;

    public Plane(String manufacturer, String model, int maxSpeed, Engine engine) {
        super(manufacturer, model, maxSpeed, engine);
        this.engine = new Engine("Suihkumoottori", 500);
    }

    public void fly() {
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    }
}