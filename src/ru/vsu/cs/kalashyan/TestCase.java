package ru.vsu.cs.kalashyan;

public class TestCase {
    double x;
    double y;
    SimpleColour rightColour;

    public TestCase(double x, double y, SimpleColour rightColour) {
        this.x = x;
        this.y = y;
        this.rightColour = rightColour;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public SimpleColour getRightColour() {
        return rightColour;
    }
}