package main;

class Ship extends Vehicle {
    Engine engine;

    public Ship(String manufacturer, String model, int maxSpeed, Engine engine) {
        super(manufacturer, model, maxSpeed, engine);
        this.engine = new Engine("Wärtsilä Super", 1000);
    }

    public void sail() {
        System.out.println(manufacturer + " " + model + " seilaa merten ääriin!");
    }
}