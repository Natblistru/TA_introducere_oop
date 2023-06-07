package edu.step.classes;

public class Dulap {
    private int numberDoors;
    private int numberShelfs;
    private String material;
    private int height;
    private int width;
    private int depth;
    private String color;
    private boolean hasMirror;
    private boolean isOpen;

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Dulapul a fost deschis.");
        } else {
            System.out.println("Dulapul este deja deschis.");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Dulapul a fost inchis.");
        } else {
            System.out.println("Dulapul este deja inchis.");
        }
    }
    public double calculateVolume() {
        double volume = height * width * depth;
        return volume;
    }
    public void resize(int newHeight, int newWidth, int newDepth) {
        this.height = newHeight;
        this.width = newWidth;
        this.depth = newDepth;
        System.out.println(String.format("Dimensiunile dulapului au fost modificate la: %dx%dx%d",
                newHeight, newWidth, newDepth));
    }
}
