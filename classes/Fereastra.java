package edu.step.classes;

public class Fereastra {
    private int width;
    private int height;
    private String material;
    private boolean isOpen;
    private boolean hasBlinds;
    private boolean isLocked;
    private boolean isBroken;
    private boolean hasThermopanGlass;

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Fereastra a fost deschisa.");
        } else {
            System.out.println("Fereastra este deja deschisa.");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Fereastra a fost inchisa.");
        } else {
            System.out.println("Fereastra este deja inchisa.");
        }
    }
    public int calculateArea() {
        return width * height;
    }
    public boolean requireRepair() {
        return isLocked || isBroken;
    }

    public boolean needRenewal() {
        return !hasThermopanGlass || !hasBlinds;
    }
}
