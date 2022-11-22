package people;

import businesses.Dealership;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer (String name, double money, ArrayList<Vehicle> ownedVehicles) {
        this.name = name;
        this.money = money;
        this.ownedVehicles = ownedVehicles;
    }


    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return this.ownedVehicles;
    }

    public void buyVehicle(Dealership dealership, Vehicle vehicle) {
        double price = vehicle.getPrice();
        if (this.money >= price) {
            this.money -= price;
            dealership.addToTill(price);
            ownedVehicles.add(vehicle);
        }

    }
}
