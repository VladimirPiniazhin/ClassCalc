package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main() {
        Calc calculator = new Calc();
        double test = calculator.calculation(2, 3);
        assertEquals(5, test);
    }

}