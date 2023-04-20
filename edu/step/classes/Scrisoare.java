package edu.step.classes;

public class Scrisoare {
    private String destinatar;
    private String adresaDestinatar;
    private String expeditor;
    private String adresaExpeditor;
    private String subiect;
    private String continut;
    private boolean esteExpediata;
    private boolean esteReceptionata;
    private boolean esteCitita;
    private boolean esteUrgenta;

    public void trimite() {
        esteExpediata = true;
        System.out.println("Scrisoarea a fost expediată la adresa " + adresaDestinatar);
    }

    public void receptioneaza() {
        esteReceptionata = true;
        System.out.println("Scrisoarea a fost receptionată de către " + destinatar);
    }

    public void marcheazaCitita() {
        esteCitita = true;
        System.out.println("Scrisoarea a fost marcată ca fiind citită.");
    }

    public void marcheazaUrgenta() {
        esteUrgenta = true;
        System.out.println("Scrisoarea a fost marcată ca fiind urgenta.");
    }

    public void arunca() {
        esteReceptionata = false;
        System.out.println("Scrisoarea a fost aruncată la gunoi.");
    }
}
