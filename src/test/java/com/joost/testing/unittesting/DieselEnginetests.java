package com.joost.testing.unittesting;

import com.joost.testing.opencitest.demo.DieselEngine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DieselEnginetests {

    @Test
    public void WhenStartedRpmIs1000(){
        DieselEngine engine = new DieselEngine();

        engine.start();

        assertEquals(1000, engine.getRpm());
    }



}
