package vehicles;

public abstract class Vehicle {

    private Engine engine;
    private Tyre tyres;

    private double price;
    private String colour;

    public Vehicle(Engine engine, Tyre tyres, double price, String colour) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
    }

}
