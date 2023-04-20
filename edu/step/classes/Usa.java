package edu.step.classes;

public class Usa {
    private String material;
    private String culoare;
    private int grosime;
    private int inaltime;
    private int latime;
    private boolean areLacat;
    private boolean esteDeschisa;
    private boolean esteBlocata;

    public void deschide() {
        if (!esteDeschisa) {
            esteDeschisa = true;
            System.out.println("Usa a fost deschisă.");
        } else {
            System.out.println("Usa este deja deschisă.");
        }
    }

    public void inchide() {
        if (esteDeschisa && !esteBlocata) {
            esteDeschisa = false;
            System.out.println("Usa a fost închisă.");
        } else if (esteDeschisa && esteBlocata) {
            System.out.println("Usa este blocată. Deblochează-o înainte de a o închide.");
        } else {
            System.out.println("Usa este deja închisă.");
        }
    }

    public void blocheaza() {
        if (!esteBlocata && !esteDeschisa) {
            esteBlocata = true;
            System.out.println("Usa a fost blocată.");
        } else if (esteDeschisa) {
            System.out.println("Nu se poate bloca o ușă deschisă. Închide-o mai întâi.");
        } else {
            System.out.println("Usa este deja blocată.");
        }
    }
    public void deblocheaza() {
        if (esteBlocata) {
            esteBlocata = false;
            System.out.println("Usa a fost deblocată.");
        } else {
            System.out.println("Usa nu este blocată.");
        }
    }
}
