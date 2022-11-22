package vehicles;

public class HybridCar extends Vehicle {
    private int tankCapacity;
    private int batteryCapacity;

    public HybridCar (int tankCapacity, int batteryCapacity, Engine engine, Tyre tyres, double price, String colour) {
        super(engine, tyres, price, colour);
        this.tankCapacity = tankCapacity;
        this.batteryCapacity = batteryCapacity;
    }

}
