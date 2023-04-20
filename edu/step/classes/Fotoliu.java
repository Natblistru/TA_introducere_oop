package edu.step.classes;

public class Fotoliu {
    private int inaltime;
    private int latime;
    private int lungime;
    private String material;
    private String culoare;
    private boolean esteExtensibil;
    private boolean esteRotativ;

    public void extinde() {
        if (esteExtensibil) {
            System.out.println("Fotoliul a fost extins.");
        } else {
            System.out.println("Acest fotoliu nu este extensibil.");
        }
    }

    public void roteste() {
        if (esteRotativ) {
            System.out.println("Fotoliul a fost rotit.");
        } else {
            System.out.println("Acest fotoliu nu este rotativ.");
        }
    }

    public void schimbaCuloare(String culoare) {
        this.culoare = culoare;
        System.out.println("Culoarea fotoliului a fost schimbata in " + culoare + ".");
    }
}
