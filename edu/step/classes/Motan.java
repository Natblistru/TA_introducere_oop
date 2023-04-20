package edu.step.classes;

public class Motan {
    private String name;
    private int age;
    private String rasa;
    private String color;
    private String favoriteToy;
    private boolean isHungry;
    private boolean isAsleep;


    public void meauna() {
        if (isAsleep) {
            System.out.println(name + " is sleeping and cannot says meow.");
        } else {
            System.out.println(name + " says meow!");
        }
    }

    public void play() {
        if (isAsleep) {
            System.out.println(name + " is sleeping and cannot play.");
        } else if (isHungry) {
            System.out.println(name + " is too hungry to play.");
        } else {
            System.out.println(name + " is playing with this " + favoriteToy + ".");
        }
    }
    public void sleep() {
        System.out.println(name + " se duce la culcare.");
        isAsleep = true;
    }
    public void  wakesUp() {
        System.out.println(name + " se trezește.");
        isAsleep = false;
    }
}
