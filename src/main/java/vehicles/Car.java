package vehicles;

public class Car extends Vehicle {

    private int tankCapacity;

    public Car(int tankCapacity, Engine engine, Tyre tyres, double price, String colour, double damage) {
        super(engine, tyres, price, colour, damage);
        this.tankCapacity = tankCapacity;
    }
}
