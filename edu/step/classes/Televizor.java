package edu.step.classes;

public class Televizor {
    private String producator;
    private String model;
    private int diagonala;
    private double pret;
    private String rezolutie;
    private boolean areSmartTV;
    private boolean estePornit;

    public void porneste() {
        estePornit = true;
        System.out.println("Televizorul a fost pornit.");
    }

    public void opreste() {
        estePornit = false;
        System.out.println("Televizorul a fost oprit.");
    }

    public void schimbaLuminozitatea(int nivel) {
        if (nivel < 0) {
            nivel = 0;
        } else if (nivel > 100) {
            nivel = 100;
        }

        System.out.println("Luminozitatea a fost ajustată la nivelul " + nivel + ".");
    }

    public void schimbaVolumul(int nivel) {
        if (nivel < 0) {
            nivel = 0;
        } else if (nivel > 100) {
            nivel = 100;
        }

        System.out.println("Volumul a fost ajustat la nivelul " + nivel + ".");
    }

    public void schimbaCanal(int canal) {
        System.out.println("Canalul a fost schimbat la " + canal + ".");
    }

    @Override
    public String toString() {
        String str = "Televizorul " + producator + " " + model + " cu diagonala de " + diagonala + " inch";
        str += "\nRezolutie: " + rezolutie;
        str += "\nPret: " + pret + " lei";
        if (areSmartTV) {
            str += "\nTelevizorul are Smart TV.";
        } else {
            str += "\nTelevizorul nu are Smart TV.";
        }
         if (estePornit) {
            str += "\nTelevizorul este pornit.";
        } else {
            str += "\nTelevizorul este oprit.";
        }
        return str;
    }
}
