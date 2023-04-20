package edu.step.classes;

public class Cana {
    private String material;
    private String color;
    private double height;
    private double diameter;
    private double volumUtilizat;
    private double volumPotential;
    private boolean isMicrowaveSafe;
    private boolean isDishwasherSafe;

    public boolean isEmpty() {
        return volumUtilizat == 0;
    }
    public void fill(double amount) {
        if (amount > 0) {
            if (amount + volumUtilizat > volumPotential) {
                System.out.println("Volumul depaseste capacitatea canii, puteti adauga doar " + (volumPotential - volumUtilizat) + " ml.");
                return;
            }
            this.volumUtilizat += amount;
        } else System.out.println("Volumul adaugat poate fi doar > 0");
    }

    public void extract(double amount) {
        if (amount > 0) {
            if (amount > volumUtilizat) {
                System.out.println("Volumul extras depășește volumul canii, puteti extrage doar " + volumUtilizat + " ml.");
                return;
            }
            this.volumUtilizat -= amount;
        } else System.out.println("Volumul extras poate fi doar > 0");
    }
    public void incalzeste() {
        if (isMicrowaveSafe) {
            System.out.println("Cana se incalzeste la micriounde.");
        } else {
            System.out.println("Cana nu poate fi incalzită la micriounde.");
        }
    }
    public void spala() {
        if (this.isDishwasherSafe) {
            System.out.println("Cane se spala in masina de spalat vesela.");
        } else {
            System.out.println("Cana se spala manual");
        }
    }
    public boolean esteTrainica() {
        return isMicrowaveSafe && isDishwasherSafe;
    }

    public boolean esteMare() {
        return diameter > 10 && height > 15;
    }

    @Override
    public String toString(){
        return "cana "+ (esteMare()? "mare" : "mică") + " din "+ material + " de culoare "+ color +
                (esteTrainica()? ", trainica" : ", fragilă");
    }
}
