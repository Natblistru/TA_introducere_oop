package edu.step.calculator;

import java.util.Scanner;

public class CalculatorExecutor {
    public static void execute() {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceți primul număr: ");
        double num1 = input.nextDouble();

        System.out.print("Introduceți al doilea număr: ");
        double num2 = input.nextDouble();

        System.out.println("Rezultatele operațiilor:");
        System.out.println(num1 + " + " + num2 + " = " + Calculator.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + Calculator.scad(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Calculator.divide(num1, num2));
    }
}
