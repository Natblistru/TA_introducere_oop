package edu.step.classes;

public class Elev {
    private String name;
    private String firstname;
    private int age;
    private String className;
    private String nameParent;
    private String adress;
    private String nameSchool;
    private double gradeAverage;
    private int numberMarks;
    private int absences;
    private boolean isPresent;

    public void putPresent() {
        isPresent = true;
        System.out.println(this.toString() + " a este marcat prezent.");
    }

    public void putAbsent() {
        this.absences++;
        System.out.println(this.toString() + " a acumulat o absenta.");
    }

    public void addMark(int nota) {
        gradeAverage = (gradeAverage * numberMarks + nota) / ++numberMarks;
        System.out.println(String.format("%s a primit nota %.2f si obține media de %.2f",
                this.toString(), nota, gradeAverage));;
    }

    public void schimbaClasa(String className) {
        this.className = className;
        System.out.println(String.format("%s a fost mutat in clasa %s.", this.toString(), className));

    }

    @Override
    public String toString() {
        return "Elevul " + name + " " + firstname;
    }
}
