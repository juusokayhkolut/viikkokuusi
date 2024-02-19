package main;

class Car extends Vehicle {
    Engine engine;

    public Car(String manufacturer, String model, int maxSpeed, Engine engine) {
        super(manufacturer, model, maxSpeed, engine);
        this.engine = new Engine("V8", 300);
    }

    public void drive() {
        System.out.println(manufacturer + " " + model + " paahtaa tietä eteenpäin!");
    }
}