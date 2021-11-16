import People.Customer;
import People.Dealership;
import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.EngineType;
import parts.Tyres;
import vehicles.Car;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DealershipTest {
    Dealership dealership;
    Car car;
    Engine engine;
    Tyres tyres;
    Customer customer;

    @Before
    public void before(){
        engine = new Engine(EngineType.PETROL);
        tyres = new Tyres(4);
        car = new Car(100,"blue", "peugeot", engine, tyres);
        dealership = new Dealership(1000);
        customer = new Customer(100);
    }
    @Test
    public void hasCar(){
        dealership.addVehicle(car);
        assertEquals(1, dealership.getVehiclesOwned().size());
    }
    @Test
    public void canSell(){
        dealership.addVehicle(car);
        dealership.sellVehicle(car, customer);
        assertEquals(0, dealership.getVehiclesOwned().size());
    }
    @Test
    public void canAddMoney(){
        dealership.addVehicle(car);
        dealership.sellVehicle(car, customer);
        assertEquals(1100, dealership.getMoney(),0.01);
    }

}
