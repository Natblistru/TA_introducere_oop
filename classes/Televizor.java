package edu.step.classes;

public class Televizor {
    private String manufacturer;
    private String model;
    private int diagonal;
    private double price;
    private String resolution;
    private int levelBrightness;
    private int levelVolume;
    private int currentChannelId;
    private boolean hasSmartTV;
    private boolean isOn;

    public void putOn() {
        isOn = true;
        System.out.println("Televizorul a fost pornit.");
    }

    public void putOff() {
        isOn = false;
        System.out.println("Televizorul a fost oprit.");
    }

    public void changeBrightness(int nivel) {
        if (nivel < 0) {
            levelBrightness = 0;
        } else if (nivel > 100) {
            levelBrightness = 100;
        } else {
            levelBrightness = nivel;
        }
        System.out.println(String.format("Luminozitatea a fost ajustată la nivelul %d.", nivel));
    }

    public void changeVolume(int nivel) {
        if (nivel < 0) {
            levelVolume = 0;
        } else if (nivel > 100) {
            levelVolume = 100;
        } else {
            levelVolume = nivel;
        }
        System.out.println(String.format("Volumul a fost ajustat la nivelul %d.", nivel));
    }

    public void changeChannel(int canal) {
        currentChannelId = canal;
        System.out.println(String.format("Canalul a fost schimbat la %d.", canal));
    }

    @Override
    public String toString() {
        String str = String.format("Televizorul %s %s cu diagonala de %.1f inch", manufacturer, model, diagonal);
        str += String.format("\nRezoluție: %s", resolution);
        str += String.format("\nPret: %.2f lei", price);
        str += hasSmartTV ? "\nTelevizorul are Smart TV." : "\nTelevizorul nu are Smart TV.";
        str += isOn ? "\nTelevizorul este pornit." : "\nTelevizorul este oprit.";
        return str;
    }
}
