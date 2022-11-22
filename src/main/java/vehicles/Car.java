package vehicles;

public class Car extends Vehicle {

    private int tankCapacity;

    public Car(int tankCapacity, Engine engine, Tyre tyres, double price, String colour) {
        super(engine, tyres, price, colour);
        this.tankCapacity = tankCapacity;
    }
}
