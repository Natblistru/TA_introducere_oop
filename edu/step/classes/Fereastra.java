package edu.step.classes;

public class Fereastra {
    private int latime;
    private int inaltime;
    private String material;
    private boolean esteDeschisa;
    private boolean areJaluzele;
    private boolean esteBlocata;
    private boolean esteStricata;
    private boolean areSticlaTermopan;

    public void deschide() {
        if (!esteDeschisa) {
            esteDeschisa = true;
            System.out.println("Fereastra a fost deschisa.");
        } else {
            System.out.println("Fereastra este deja deschisa.");
        }
    }

    public void inchide() {
        if (esteDeschisa) {
            esteDeschisa = false;
            System.out.println("Fereastra a fost inchisa.");
        } else {
            System.out.println("Fereastra este deja inchisa.");
        }
    }
    public boolean necesitaReparatie() {
        return esteBlocata || esteStricata;
    }

    public boolean necesitaReinnore() {
        return !areSticlaTermopan || !areJaluzele;
    }
}
