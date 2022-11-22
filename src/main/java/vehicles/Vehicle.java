package vehicles;

public abstract class Vehicle {

    private Engine engine;
    private Tyre tyres;

    private double price;
    private String colour;
    private double damage;

    public Vehicle(Engine engine, Tyre tyres, double price, String colour, double damage) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.damage = damage;
    }

    public double getPrice() {
        return this.price;
    }

    public double getDamage() {
        return this.damage;
    }

    public void changeDamage(double damage) {
        this.damage += damage;
        this.price -= damage;
    }

    public void fixAllDamage() {
        this.changeDamage((this.getDamage())*-1);
    }
}
