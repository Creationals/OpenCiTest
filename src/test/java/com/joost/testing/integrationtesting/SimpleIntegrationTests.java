package com.joost.testing.integrationtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleIntegrationTests {

    @Test
    public void aFakeIntegrationTest(){
        assertEquals(1, 1, "10 x 0 must be 0");
        assertEquals(2, 2, "10 x 0 must be 0");
    }
}
