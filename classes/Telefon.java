package edu.step.classes;

public class Telefon {
    private String model;
    private String manufacturer;
    private int sizeScreen;
    private boolean hasCamera;
    private int resolutionCamera;
    private boolean isOn;

    public void putOn() {
        if (isOn) {
            System.out.println("Telefonul este deja pornit.");
        } else {
            isOn = true;
            System.out.println("Telefonul a fost pornit.");
        }
    }

    public void putOff() {
        if (!isOn) {
            System.out.println("Telefonul este deja oprit.");
        } else {
            isOn = false;
            System.out.println("Telefonul a fost oprit.");
        }
    }
    public void makePhoto() {
        if (!isOn) {
            System.out.println("Telefonul trebuie sa fie pornit pentru a putea face poze.");
        } else if (!hasCamera) {
            System.out.println("Telefonul nu are camera.");
        } else {
            System.out.println(String.format("Se face o poză cu rezoluție de %d MP.", resolutionCamera));
        }
    }
}
