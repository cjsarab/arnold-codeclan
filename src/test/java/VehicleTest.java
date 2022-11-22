import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Tyre;
import vehicles.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Customer customer;
    ArrayList<Vehicle> ownedVehicles;
    Vehicle vehicle;
    Engine engine;
    Tyre tyres;


    @Before
    public void before() {
        engine = new Engine("V8");
        tyres = new Tyre("Michelin");
        ownedVehicles = new ArrayList<Vehicle>();
        customer = new Customer("Randolph", 5000, ownedVehicles);
        vehicle = new Car(60, engine, tyres, 4999, "tangerine", 0);
    }

    @Test
    public void damageReducesPrice() {
        vehicle.changeDamage(100);
        assertEquals(4899, vehicle.getPrice(), 0.0);
    }

    @Test
    public void fixAllDamage() {
        vehicle.changeDamage(200);
        vehicle.fixAllDamage();
        assertEquals(0, vehicle.getDamage(), 0.0);
    }




}
