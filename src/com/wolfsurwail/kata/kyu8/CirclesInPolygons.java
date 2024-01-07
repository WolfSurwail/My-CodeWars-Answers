package com.wolfsurwail.kata.kyu8;

public class CirclesInPolygons {
    int sides;
    int sideLength;

    public CirclesInPolygons(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){
        return sideLength/Math.tan(Math.PI/sides);
    }
}
