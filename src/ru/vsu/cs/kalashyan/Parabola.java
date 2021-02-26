package ru.vsu.cs.kalashyan;

public class Parabola {
    public double a;
    public double b;
    public double c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPointInside(double x, double y) {
        return y <= a * (x * x) + b * x + c;
    }
}