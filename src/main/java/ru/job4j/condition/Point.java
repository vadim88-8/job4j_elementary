package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(-1, 1, -2, 1);
        System.out.println("result (-1, 1) to (-2, 1) " + result2);
        double result3 = Point.distance(2, 1, 4, 4);
        System.out.println("result (2, 1) to (4, 4) " + result3);
        double result4 = Point.distance(1, 1, 5, 5);
        System.out.println("result (1, 1) to (5, 5) " + result4);
    }
}
