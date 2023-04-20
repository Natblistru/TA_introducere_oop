package edu.step.converter;

public class TempConverter {
    public static void convertToFahr(double celsius) {
        double fahr = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C → " + String.format("%.1f", fahr) + "°F");
    }
    public static void convertToCelsius(double fahr) {
        double celsius = (fahr - 32) * 5/9;
        System.out.println(fahr + "°F → " + String.format("%.1f", celsius) + "°C");
    }

}
