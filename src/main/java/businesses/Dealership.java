package businesses;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(ArrayList<Vehicle> stock, double till) {
        this.stock = stock;
        this.till = till;
    }
}