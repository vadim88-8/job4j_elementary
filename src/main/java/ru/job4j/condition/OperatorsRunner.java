package ru.job4j.condition;

public class OperatorsRunner {
    public static void main(String[] args) {
        int one = 10;
        double two = 100.0;
        int result = (int) (one + two);
        System.out.println(result);
        one += two;
        System.out.println(one);
    }
}
