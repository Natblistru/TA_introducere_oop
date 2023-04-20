package edu.step.classes;

public class Fotografie {
    private int id;
    private String locatie;
    private String data;
    private boolean isColor;
    private String[] personaje = new String[10];
    public void printare() {
        System.out.println("Fotografia " + id + " a fost printata cu succes.");
    }

    public void partajareFB() {
        System.out.println("Fotografia " + id + " a fost partajata pe Facebook.");
    }
    public boolean isEmpty() {
        return personaje.length == 0;
    }

    @Override
    public String toString(){
        return "Foto "+ (isColor? " color " : " alb-neagră ") + " din "+ data +
                " facuta în localitatea, "+ locatie +
                (isEmpty()? "făra personaje" : "cu " + personaje.length +" personaje");
    }
}
