package edu.step.classes;

public class Dulap {
    private int numarUsi;
    private int numarRafturi;
    private String material;
    private int inaltime;
    private int latime;
    private int adancime;
    private String culoare;
    private boolean areOglinda;
    private boolean esteDeschis;

    public void deschide() {
        if (!esteDeschis) {
            esteDeschis = true;
            System.out.println("Dulapul a fost deschis.");
        } else {
            System.out.println("Dulapul este deja deschis.");
        }
    }

    public void inchide() {
        if (esteDeschis) {
            esteDeschis = false;
            System.out.println("Dulapul a fost inchis.");
        } else {
            System.out.println("Dulapul este deja inchis.");
        }
    }
    public void adaugaRaft() {
        this.numarRafturi++;
        System.out.println("A fost adaugat un raft nou in dulap. Numarul total de rafturi este acum " + numarRafturi + ".");
    }
    public void scoateRaft() {
        if (this.numarRafturi > 0) {
            this.numarRafturi--;
            System.out.println("A fost scos un raft din dulap. Numarul total de rafturi este acum " + numarRafturi + ".");
        } else {
            System.out.println("Nu exista rafturi in dulap.");
        }
    }
}
