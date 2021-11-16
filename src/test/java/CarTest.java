import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.EngineType;
import parts.Tyres;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    Engine engine;
    Tyres tyres;


    @Before
    public void before(){
        engine = new Engine(EngineType.PETROL);
        tyres = new Tyres(4);
        car = new Car(100,"blue", "peugeot", engine, tyres);
    }

    @Test
    public void hasEngine(){
        assertEquals(EngineType.PETROL, car.getEngine().getEngineType());
    }


}
