package edu.step.classes;

public class Cana {
    private String material;
    private String color;
    private double height;
    private double diameter;
    private double volumeUsed;
    private double volumPotential;
    private boolean isMicrowaveSafe;
    private boolean isDishwasherSafe;

    public boolean isEmpty() {
        return volumeUsed == 0;
    }
    public boolean isDurable() {
        return isMicrowaveSafe && isDishwasherSafe;
    }

    public boolean isBig() {
        return diameter > 10 && height > 15;
    }

    @Override
    public String toString(){
        return String.format("Cana %s din %s de culoare %s%s",
                (isBig() ? "mare" : "mică"), material, color,
                (isDurable() ? ", trainică" : ", fragilă"));

    }
}
