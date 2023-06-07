package edu.step.classes;

public class Fotografie {
    private int id;
    private String location;
    private String data;
    private boolean isColor;
    private String[] persons = new String[10];
    public void print() {
        System.out.println(String.format("Fotografia %d a fost printata cu succes.", id));
    }

    public void shareFB() {
        System.out.println(String.format("Fotografia %d a fost partajata pe Facebook.", id));
    }

    public boolean isEmpty() {
        return persons.length == 0;
    }

    @Override
    public String toString(){
        return String.format("Foto %s din %s facuta in localitatea %s %s",
                (isColor ? "color" : "alb-neagra"), data, location,
                (isEmpty() ? "fara persoane" : "cu " + persons.length + " persoane"));
    }
}
