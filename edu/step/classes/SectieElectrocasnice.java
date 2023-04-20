package edu.step.classes;

public class SectieElectrocasnice {
    private String nume;
    private String adresa;
    private int numarProduse;
    private String[] produse = new String[300];
    private boolean esteDeschis;

    public void deschideMagazin() {
        esteDeschis = true;
        System.out.println("Magazinul a fost deschis.");
    }
    public void inchideMagazin() {
        esteDeschis = false;
        System.out.println("Magazinul a fost închis.");
    }

    public void afiseazaProduse() {
        for (int i = 0; i < numarProduse; i++) {
            System.out.println(produse[i]);
        }
    }

    public void adaugaProdus(String produs) {
        if (numarProduse < produse.length) {
            produse[numarProduse++] = produs;
            System.out.println("Produsul " + produs + " a fost adăugat cu succes.");
        } else {
            System.out.println("Nu mai este loc pe rafturi pentru adăugarea produsului " + produs);
        }
    }

}




