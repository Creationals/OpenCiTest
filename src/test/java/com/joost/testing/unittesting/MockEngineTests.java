package com.joost.testing.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockEngineTests {

    @Test
    public void testGetRpmCalls(){

        // Arrange
        MockEngine mock = new MockEngine();

        // Act
        mock.getRpm();

        // Assert
        assertEquals(1, mock.getRpm_calls);
    }


}
