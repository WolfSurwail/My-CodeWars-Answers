package com.wolfsurwail.kata.kyu8;

public class FuelCalculatorTotalCost {
    public static double fuelPrice(int litres, double pricePerLitre) {
        return litres * (pricePerLitre - Math.min(litres / 2 * 0.05, 0.25));
    }
}
