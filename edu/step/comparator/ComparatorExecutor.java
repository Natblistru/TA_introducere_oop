package edu.step.comparator;

import java.util.Arrays;
import java.util.Scanner;

public class ComparatorExecutor {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti 4 numere intregi.");
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
                System.out.print("numarul[" + (i+1) + "]: ");
                numbers[i] = scanner.nextInt();
        }
        System.out.println("Maximul dintre " + Arrays.toString(numbers) + " este: " + NumbersComparator.max(numbers));
        System.out.println("Minimul dintre " + Arrays.toString(numbers) + " este: " + NumbersComparator.min(numbers));

    }
}
