package edu.step.converter;

public class TempConverter {
    private static final int DIFFERENCE_TEMP = 32;
    public static void convertToFahr(double celsius) {
        double fahr = (celsius * 9/5) + DIFFERENCE_TEMP;
        System.out.println(String.format("%.1f°C → %.1f°F", celsius,fahr));
    }
    public static void convertToCelsius(double fahr) {
        double celsius = (fahr - DIFFERENCE_TEMP) * 5/9;
        System.out.println(String.format("%.1f°F → %.1f°C", fahr, celsius));
    }

}
