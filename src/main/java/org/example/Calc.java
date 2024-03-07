package org.example;

public class Calc {
    public double calculation(double a, double b) {
        return a + b;
    }
    public static void main( String[] args )    {
        Calc calculator = new Calc();
        calculator.calculation(2, 3);
    }
}
