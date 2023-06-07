package edu.step.classes;

public class Usa {
    private String material;
    private String color;
    private int thickness;
    private int height;
    private int width;
    private boolean hasLock;
    private boolean isOpen;
    private boolean isLocked;

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Usa a fost deschisă.");
        } else {
            System.out.println("Usa este deja deschisă.");
        }
    }

    public void close() {
        if (isOpen && !isLocked) {
            isOpen = false;
            System.out.println("Usa a fost închisă.");
        } else if (isOpen && isLocked) {
            System.out.println("Usa este blocată. Deblochează-o înainte de a o închide.");
        } else {
            System.out.println("Usa este deja închisă.");
        }
    }

    public void block() {
        if (!isLocked && !isOpen) {
            isLocked = true;
            System.out.println("Usa a fost blocată.");
        } else if (isOpen) {
            System.out.println("Nu se poate bloca o ușă deschisă. Închide-o mai întâi.");
        } else {
            System.out.println("Usa este deja blocată.");
        }
    }
    public void unblock() {
        if (isLocked) {
            isLocked = false;
            System.out.println("Usa a fost deblocată.");
        } else {
            System.out.println("Usa nu este blocată.");
        }
    }
}
