package ru.vsu.cs.kalashyan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Circle(-3, 3, 5), new Parabola(-0.25, -3, -8), new Rectangle());
        System.out.println("TEST");
        completeProgram(testPoints(picture), picture);
    }

    static double readPointCoordinates(String name) { //считывание координат Точек
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter coordinate:");
        return scn.nextDouble();
    }

    public static void completeProgram(boolean result, Picture picture) { //готовая программа
        if (!result) {
            System.out.println("The program is not working correctly!");
        } else {
            double x = readPointCoordinates("x --> ");
            double y = readPointCoordinates("y --> ");
            Point point = new Point(x, y);
            printColourForPoint(point, picture);
        }
    }

    public static boolean testPoints(Picture picture) { //тестовые точки

        TestCase[] cases = {new TestCase(0, 0, SimpleColour.WHITE),
                new TestCase(-5, -1, SimpleColour.YELLOW),
                new TestCase(4, 0, SimpleColour.BLUE),
                new TestCase(-2, -1, SimpleColour.ORANGE),
                new TestCase(-7, -1, SimpleColour.WHITE),
                new TestCase(1, 4, SimpleColour.ORANGE),
                new TestCase(1, -10, SimpleColour.YELLOW),
                new TestCase(-2, 9, SimpleColour.YELLOW)};

        boolean result = true;
        for (int i = 0; i < cases.length; i++) {

            TestCase testing = cases[i];
            Point point = new Point(testing.getX(), testing.getY());

            SimpleColour color = picture.getColour(point.x, point.y);
            SimpleColour rightColour = testing.getRightColour();

            if (color == rightColour) {
                printTest(color, rightColour, point, "TRUE");
            } else {
                printTest(color, rightColour, point, "FALSE");
                result = false;
            }
        }
        return result;
    }

    static void printColourForPoint(Point point, Picture picture) { //цвет печати для точки
        System.out.println("(" + point.x + ";" + point.y + ") ->" + picture.getColour(point.x, point.y));
    }

    public static void printTest(SimpleColour colour, SimpleColour rightColour, Point point, String result) { //пробная печать
        System.out.println("(" + point.getX() + ";" + point.getY() + ") --> " + colour +
                ". Right colour -->" + rightColour + ". " + result);
    }
}