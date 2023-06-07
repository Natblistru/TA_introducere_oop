package edu.step.classes;

public class Apartament {
    private int number;
    private int numberRooms;
    private boolean hasAirConditioned;
    private boolean hasHeating;
    private int floor;
    private String address;
    private int distanceCenter;
    private String[] renters = new String[10];

    public boolean hasFeatures() {
        return hasAirConditioned && hasHeating && distanceCenter < 5;
    }
    public boolean isFree() {
        return renters.length == 0;
    }

    public boolean isAvailable() {
        return renters.length < numberRooms;
    }

    @Override
    public String toString(){
        return String.format("Apartament cu %d camere situat la %.1f km de centru%s",
                numberRooms, distanceCenter, (hasFeatures() ? ", cu comodități" : ""));

    }
}

