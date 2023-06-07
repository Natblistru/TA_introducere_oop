package edu.step;
import edu.step.calculator.CalculatorExecutor;
import edu.step.comparator.ComparatorExecutor;
import edu.step.converter.TempConverter;
import edu.step.converter.dynamic.DynamicConverter;

public class Application {
    public static void main(String[] args) {
        /*Sarcina 1*/
        TempConverter.convertToFahr(100);
        TempConverter.convertToCelsius(100);

        /*Sarcina 2*/
        DynamicConverter.execute();

        /*Sarcina 3*/
        CalculatorExecutor.execute();

        /*Sarcina 4*/
        ComparatorExecutor.execute();
    }
}
