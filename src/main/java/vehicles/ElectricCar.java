package vehicles;

public class ElectricCar extends Vehicle {
    private int batteryCapacity;

    public ElectricCar(int batteryCapacity, Engine engine, Tyre tyres, double price, String colour, double damage) {
        super(engine, tyres, price, colour, damage);
        this.batteryCapacity = batteryCapacity;
    }
}
