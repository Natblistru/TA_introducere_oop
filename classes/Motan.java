package edu.step.classes;

public class Motan {
    private String name;
    private int age;
    private String breed;
    private String color;
    private String favoriteToy;
    private boolean isHungry;
    private boolean isAsleep;


    public void meow() {
        if (isAsleep) {
            System.out.println(String.format("%s is sleeping and cannot say meow.", name));
        } else {
            System.out.println(String.format("%s says meow!", name));
        }
    }

    public void play() {
        if (isAsleep) {
            System.out.println(String.format("%s is sleeping and cannot play.", name));
        } else if (isHungry) {
            System.out.println(String.format("%s is too hungry to play.", name));
        } else {
            System.out.println(String.format("%s is playing with his %s.", name, favoriteToy));
        }
    }
    public void sleep() {
        System.out.println(String.format("%s se duce la culcare.", name));
        isAsleep = true;
    }
    public void  wakesUp() {
        System.out.println(String.format("%s se trezește.", name));
        isAsleep = false;
    }
}
