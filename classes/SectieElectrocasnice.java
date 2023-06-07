package edu.step.classes;

public class SectieElectrocasnice {
    private String adress;
    private int numberProducts;
    private String[] products = new String[300];
    private boolean isOpen;

    public void openStore() {
        isOpen = true;
        System.out.println("Magazinul a fost deschis.");
    }
    public void closeStore() {
        isOpen = false;
        System.out.println("Magazinul a fost închis.");
    }

    public void displayProducts() {
        for (int i = 0; i < numberProducts; i++) {
            System.out.println(products[i]);
        }
    }

    public void addProduct(String produs) {
        if (numberProducts < products.length) {
            products[numberProducts++] = produs;
            System.out.println("Produsul " + produs + " a fost adăugat cu succes.");
        } else {
            System.out.println("Nu mai este loc pe rafturi pentru adăugarea produsului " + produs);
        }
    }

}




