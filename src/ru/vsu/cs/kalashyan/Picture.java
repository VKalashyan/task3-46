package ru.vsu.cs.kalashyan;

public class Picture {
    public Circle circle;
    public Parabola parabola;
    public Rectangle rectangle;

    public Picture(Circle circle, Parabola parabola, Rectangle rectangle) {
        this.circle = circle;
        this.parabola = parabola;
        this.rectangle = rectangle;
    }

    public SimpleColour getColour(double x, double y) {
        if (circle.isPointInside(x, y) && (parabola.isPointInside(x, y))) {
            return SimpleColour.YELLOW;
        }
        if (circle.isPointInside(x, y) && (!rectangle.isPointInside(x, y))){
            return SimpleColour.ORANGE;
        }
        if (circle.isPointInside(x, y) && (rectangle.isPointInside(x, y)) || (parabola.isPointInside(x, y))) {
            return SimpleColour.WHITE;
        }
        if (rectangle.isPointInside(x, y)) {
            return SimpleColour.BLUE;
        }
        return SimpleColour.YELLOW;
    }
}