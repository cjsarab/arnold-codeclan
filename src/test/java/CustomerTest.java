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

public class CustomerTest {

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
    public void customerHasName() {
        assertEquals("Randolph", customer.getName());
    }

    @Test
    public void customerHasMoney() {
        assertEquals(5000, customer.getMoney(), 0.0);
    }

    @Test
    public void customerHasVehicleCollection() {
        assertEquals(ownedVehicles, customer.getOwnedVehicles());
    }

    @Test
    public void customerCanBuyVehicle() {
        ArrayList<Vehicle> expectedVehicles = new ArrayList<Vehicle>();
        expectedVehicles.add(vehicle);
        customer.buyVehicle(dealership, vehicle);
        assertEquals(expectedVehicles, customer.getOwnedVehicles());
    }

    @Test
    public void customerMoneyGoesDownWhenBuyingVehicle() {
        customer.buyVehicle(dealership, vehicle);
        assertEquals(1, customer.getMoney(), 0.0);
    }

    @Test
    public void dealershipGetsCustomersMoneyWhenBuyingVehicle() {
        customer.buyVehicle(dealership, vehicle);
        assertEquals(104999d, dealership.getTill(), 0.0);
    }

    @Test
    public void dealershipRemovesVehicleWhenCustomerBuys() {
        ArrayList<Vehicle> expectedStock = new ArrayList<Vehicle>();
        dealership.addVehicle(vehicle);
        customer.buyVehicle(dealership, vehicle);
        assertEquals(expectedStock, dealership.getStock());
    }




}
