package edu.step.classes;

public class Apartament {
    private int numar;
    private int numarCamere;
    private boolean areAirConditionat;
    private boolean areIncalzire;
    private int etaj;
    private String adresa;
    private int distantaCentru;
    private String[] locatari = new String[10];

    public boolean areComoditati() {
        return areAirConditionat && areIncalzire && distantaCentru < 5;
    }
    public boolean esteLiber() {
        return locatari.length == 0;
    }

    public boolean esteDisponibil() {
        return locatari.length < numarCamere;
    }

    @Override
    public String toString(){
        return "apartament cu"+ numarCamere + "camere situat la "+ distantaCentru +
                " km de centru" + (areComoditati()? ", cu comodități" : "");

    }
}

