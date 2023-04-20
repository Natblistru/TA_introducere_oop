package edu.step.classes;

public class Taxi {
    private int id;
    private String nume;
    private int capacitate;
    private double pretKilometru;
    private boolean acceptaPlataCard;
    private boolean areScaunePentruCopii;
    private boolean acceptaAnimaleDeCompanie;

    public double calculeazaPretCalatorie(double kilometri) {
        return kilometri * pretKilometru;
    }
    public void iaComanda() {
        System.out.println("Taxiul " + nume + " a preluat o comanda.");
    }

}
