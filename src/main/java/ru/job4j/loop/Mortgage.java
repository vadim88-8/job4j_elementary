package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent /=  100;
        double ostatok = amount + (amount * percent) - salary;
        while (amount > 0) {
            amount = ostatok + (ostatok * percent);
            ostatok = amount - salary;
            year++;
        }
        return year;
    }
}
