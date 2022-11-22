import businesses.Dealership;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Tyre;
import vehicles.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Customer customer;
    ArrayList<Vehicle> ownedVehicles;
    Vehicle vehicle;
    Engine engine;
    Tyre tyres;

    Dealership dealership;
    ArrayList<Vehicle> stock;

    @Before
    public void before() {
        engine = new Engine("V8");
        tyres = new Tyre("Michelin");
        ownedVehicles = new ArrayList<Vehicle>();
        customer = new Customer("Randolph", 5000, ownedVehicles);
        vehicle = new Car(60, engine, tyres, 4999, "tangerine", 0);

        stock = new ArrayList<Vehicle>();
        dealership = new Dealership(stock, 100000d);

    }

    @Test
    public void dealershipCanAddVehicleToStock() {
        ArrayList<Vehicle> expectedStock = new ArrayList<Vehicle>();
        expectedStock.add(vehicle);
        dealership.addVehicle(vehicle);
        assertEquals(expectedStock, dealership.getStock());
    }
}
