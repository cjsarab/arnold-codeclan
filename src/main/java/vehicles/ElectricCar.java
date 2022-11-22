package vehicles;

public class ElectricCar extends Vehicle {
    private int batteryCapacity;

    public ElectricCar(int batteryCapacity, Engine engine, Tyre tyres, double price, String colour) {
        super(engine, tyres, price, colour);
        this.batteryCapacity = batteryCapacity;
    }
}
