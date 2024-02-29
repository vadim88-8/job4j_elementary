package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 5, 2, 7);
        System.out.println("result (1, 5) to (2, 7) " + result2);
        double result3 = Point.distance(2, 1, 3, 5);
        System.out.println("result (2, 1) to (3, 5) " + result3);
    }
}
