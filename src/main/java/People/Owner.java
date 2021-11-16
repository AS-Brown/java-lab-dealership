package People;

import vehicles.Vehicle;

import java.util.ArrayList;

public abstract class Owner {
    private double money;
    private ArrayList<Vehicle> vehiclesOwned;

    public Owner(double money, ArrayList<Vehicle> vehiclesOwned) {
        this.money = money;
        this.vehiclesOwned = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getVehiclesOwned() {
        return vehiclesOwned;
    }

    public void setVehiclesOwned(ArrayList<Vehicle> vehiclesOwned) {
        this.vehiclesOwned = vehiclesOwned;
    }
}
