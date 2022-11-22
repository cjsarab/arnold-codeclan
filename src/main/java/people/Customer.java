package people;

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


}
