package com.joost.testing.unittesting;

import com.joost.testing.opencitest.demo.Car;
import com.joost.testing.opencitest.demo.DieselEngine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTests {

    @Test
    public void PrepareCarSetsSpeedToZero(){

        // Prepare the mock
        MockEngine engine = new MockEngine();
        engine.getRpm_return = 1000;

        Car myCar = new Car(engine);
        myCar.PrepareForDeparture();

        assertEquals(0, myCar.getSpeed());

        assertEquals(1, engine.start_calls);
        assertEquals(1, engine.getRpm_calls);
        assertEquals(0, engine.stop_calls);
    }

}
