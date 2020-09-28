package com.joost.testing.componenttesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleComponentTests {

    @Test
    public void aSimpleComponentTest(){
        assertEquals(1, 1, "10 x 0 must be 0");
    }

}
