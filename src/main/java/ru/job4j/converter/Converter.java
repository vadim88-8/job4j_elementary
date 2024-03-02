package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inputDollar = 180;
        float expectedDollar = 3;
        float outputDollar = Converter.rubleToDollar(inputDollar);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("180 rubles are 3. Test result : " + passedDollar);
    }
}
