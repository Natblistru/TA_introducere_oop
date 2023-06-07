package edu.step.calculator;

public class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Impartirea la 0 e interzisa");
            return 0;
        }
        return num1 / num2;
    }

    public static void printResult(double num1, double num2, char operation, double result) {
        System.out.println(String.format("%.1f %s %.1f = %.1f", num1,operation,num2,result));

    }
}
