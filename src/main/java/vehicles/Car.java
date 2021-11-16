package vehicles;

import parts.Engine;
import parts.Tyres;

public class Car extends Vehicle{
    public Car(int price, String colour, String make, Engine engine, Tyres tyres) {
        super(price, colour, make, engine, tyres);
    }
}
