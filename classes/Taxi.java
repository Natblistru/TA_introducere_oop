package edu.step.classes;

public class Taxi {
    private int id;
    private int capacity;
    private double priceKilometer;;
    private boolean acceptCardPayment;
    private boolean hasChairsForChildren;
    private boolean acceptPets;

    public double calculateTravelPrice(double kilometri) {
        return kilometri * priceKilometer;
    }
    public void retrieveOrder() {
        System.out.println(String.format("Taxiul %d a preluat o comandă.", id));
    }

}
