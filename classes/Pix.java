package edu.step.classes;

public class Pix {
    private String producer;
    private String model;
    private String color;
    private boolean hasLid;
    private boolean hasLoad;
    private int levelLoad;
    private boolean isOpen;
    private boolean isReadyToWrite;
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Pixul a fost deschis.");
        } else {
            System.out.println("Pixul este deja deschis.");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Pixul a fost închis.");
        } else {
            System.out.println("Pixul este deja închis.");
        }
    }
    public void prepareToWrite() {
        if (levelLoad > 0 && isOpen) {
            isReadyToWrite = true;
            System.out.println("Pixul este pregătit de scris.");
        } else {
            isReadyToWrite = false;
            System.out.println("Nu se poate scrie cu acest pix. Verifică nivelul încărcării și dacă este deschis.");
        }
    }

    public void write(String text) {
        if (isReadyToWrite) {
            System.out.println(String.format("A scris: \"%s\"", text));
            levelLoad--;
            isReadyToWrite = false;
        } else {
            System.out.println("Pixul nu este pregătit de scris. Pregătește-l de scris și încearcă din nou.");
        }
    }

    public void load() {
        if (hasLoad && levelLoad < 10) {
            levelLoad++;
            System.out.println(String.format("Pixul a fost încărcat. Nivelul încărcării este acum %d/10.", levelLoad));

        } else if (!hasLoad) {
            System.out.println("Acest pix nu are încărcare. Nu se poate încărca.");
        } else {
            System.out.println("Pixul este deja la nivelul maxim de încărcare.");
        }
    }
}
