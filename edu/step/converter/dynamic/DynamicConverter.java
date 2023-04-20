package edu.step.converter.dynamic;

import edu.step.converter.TempConverter;
import java.util.Scanner;

public class DynamicConverter {
    public static void execute(){
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti valoarea in grade Celsius: ");
        double celsius = input.nextDouble();

        TempConverter.convertToFahr(celsius);

    }
}
