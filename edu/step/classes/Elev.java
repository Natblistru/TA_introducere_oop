package edu.step.classes;

public class Elev {
    private String nume;
    private String prenume;
    private int varsta;
    private String clasa;
    private String numeParinte;
    private String adresa;
    private String numeScoala;
    private double medie;
    private int numarNote;
    private int absente;
    private boolean estePrezent;

    public void punePrezenta() {
        estePrezent = true;
        System.out.println(this.toString() + " a este marcat prezent.");
    }

    public void puneAbsenta() {
        this.absente++;
        System.out.println(this.toString() + " a acumulat o absenta.");
    }

    public void adaugaNota(int nota) {
        medie = (medie * numarNote + nota) / ++numarNote;
        System.out.println(this.toString() + " a primit nota " + nota +
                " si obține media de " + String.format("%.2f", medie));
    }

    public void schimbaClasa(String clasa) {
        this.clasa = clasa;
        System.out.println(this.toString() + " a fost mutat in clasa " + clasa + ".");
    }

    @Override
    public String toString() {
        return "Elevul " + nume + " " + prenume;
    }
}
