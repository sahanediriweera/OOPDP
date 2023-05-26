package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add Test")
    void add() {
        assertEquals(4,Calculator.add(2,2));
    }

    @Test
    void multiply() {
        assertAll(
                ()->assertEquals(4,Calculator.multiply(2,2)),
                ()->assertEquals(25,Calculator.multiply(5,5)),
                ()->assertEquals(8100,Calculator.multiply(9,9,10,10))
        );
    }
}