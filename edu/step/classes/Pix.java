package edu.step.classes;

public class Pix {
    private String producator;
    private String model;
    private String culoare;
    private int grosimeTrasatura;
    private boolean areCapac;
    private boolean areClip;
    private boolean areIncarcare;
    private int nivelIncarcare;
    private boolean esteDeschis;
    private boolean estePregatitDeScris;
    public void deschide() {
        if (!esteDeschis) {
            esteDeschis = true;
            System.out.println("Pixul a fost deschis.");
        } else {
            System.out.println("Pixul este deja deschis.");
        }
    }

    public void inchide() {
        if (esteDeschis) {
            esteDeschis = false;
            System.out.println("Pixul a fost închis.");
        } else {
            System.out.println("Pixul este deja închis.");
        }
    }
    public void pregatesteDeScris() {
        if (nivelIncarcare > 0 && esteDeschis) {
            estePregatitDeScris = true;
            System.out.println("Pixul este pregătit de scris.");
        } else {
            estePregatitDeScris = false;
            System.out.println("Nu se poate scrie cu acest pix. Verifică nivelul încărcării și dacă este deschis.");
        }
    }

    public void scrie(String text) {
        if (estePregatitDeScris) {
            System.out.println("A scris: \"" + text + "\"");
            nivelIncarcare--;
            estePregatitDeScris = false;
        } else {
            System.out.println("Pixul nu este pregătit de scris. Pregătește-l de scris și încearcă din nou.");
        }
    }

    public void incarca() {
        if (areIncarcare && nivelIncarcare < 10) {
            nivelIncarcare++;
            System.out.println("Pixul a fost încărcat. Nivelul încărcării este acum " + nivelIncarcare + "/10.");
        } else if (!areIncarcare) {
            System.out.println("Acest pix nu are încărcare. Nu se poate încărca.");
        } else {
            System.out.println("Pixul este deja la nivelul maxim de încărcare.");
        }
    }

    public void seteazaCuloare(String culoareNoua) {
        culoare = culoareNoua;
        System.out.println("Culoarea pixului a fost setată la " + culoareNoua + ".");
    }
}
