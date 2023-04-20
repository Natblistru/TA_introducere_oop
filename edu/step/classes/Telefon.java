package edu.step.classes;

public class Telefon {
    private String model;
    private String producator;
    private int dimensiuneEcran;
    private boolean areCamera;
    private int rezolutieCamera;
    private boolean estePornit;

    public void porneste() {
        if (estePornit) {
            System.out.println("Telefonul este deja pornit.");
        } else {
            estePornit = true;
            System.out.println("Telefonul a fost pornit.");
        }
    }

    public void opreste() {
        if (!estePornit) {
            System.out.println("Telefonul este deja oprit.");
        } else {
            estePornit = false;
            System.out.println("Telefonul a fost oprit.");
        }
    }
    public void faPoza() {
        if (!estePornit) {
            System.out.println("Telefonul trebuie sa fie pornit pentru a putea face poze.");
        } else if (!areCamera) {
            System.out.println("Telefonul nu are camera.");
        } else {
            System.out.println("Se face o poza cu rezolutie de " + rezolutieCamera + "MP.");
        }
    }
}
