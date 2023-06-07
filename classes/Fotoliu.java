package edu.step.classes;

public class Fotoliu {
    private int height;
    private int width;
    private int length;
    private String material;
    private String color;
    private boolean isExtensible;
    private boolean isRotating;

    public void extend() {
        if (isExtensible) {
            System.out.println("Fotoliul a fost extins.");
        } else {
            System.out.println("Acest fotoliu nu este extensibil.");
        }
    }

    public void rotate() {
        if (isRotating) {
            System.out.println("Fotoliul a fost rotit.");
        } else {
            System.out.println("Acest fotoliu nu este rotativ.");
        }
    }

    public void changeColor(String culoare) {
        this.color = culoare;
        System.out.println("Culoarea fotoliului a fost schimbata in " + culoare + ".");
    }
}
