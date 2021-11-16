package People;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer extends Owner{

    public Customer(double money, ArrayList<Vehicle> vehiclesOwned) {
        super(money, vehiclesOwned);
    }
}
