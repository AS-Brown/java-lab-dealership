package vehicles;

import parts.Engine;
import parts.EngineType;
import parts.Tyres;

public abstract class Vehicle {
    private int price;
    private String colour;
    private String make;
    private Engine engine;
    private Tyres tyres;

    public Vehicle(int price, String colour, String make, Engine engine, Tyres tyres) {
        this.price = price;
        this.colour = colour;
        this.make = make;
        this.engine = engine;
        this.tyres = tyres;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine(){
        return engine;
    }
}
