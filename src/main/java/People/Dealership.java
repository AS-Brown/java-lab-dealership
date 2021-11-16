package People;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership extends Owner{
    public Dealership(double money) {
        super(money);
    }

    public void sellVehicle(Vehicle vehicle, Customer customer){
        if(customer.getMoney() >= vehicle.getPrice()){
            this.getVehiclesOwned().remove(vehicle);
            customer.addVehicle(vehicle);
            customer.setMoney(customer.getMoney()-vehicle.getPrice());
            this.setMoney(this.getMoney()+vehicle.getPrice());
        }
    }
}
