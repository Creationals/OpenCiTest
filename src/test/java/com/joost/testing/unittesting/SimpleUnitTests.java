package com.joost.testing.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleUnitTests {

    @Test
    public void aSimpleUnitTest(){
        assertEquals(1, 1, "10 x 0 must be 0");
    }

}
