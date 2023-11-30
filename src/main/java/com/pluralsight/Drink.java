package com.pluralsight;

public class Drink implements Product{
    /*---------------VARIABLES---------------*/

    public char size;
    public String flavor;

    /*--------------CONSTRUCTORS-------------*/

    public Drink(char size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    /*------------GETTERS/SETTERS------------*/

    public char getSize() {
        return size;
    }


    public String getFlavor() {
        return flavor;
    }


    /*---------------FUNCTIONS---------------*/

    @Override
    public double getPrice() {
        // Define base prices for each size
        double smallPrice = 2.0;
        double mediumPrice = 2.5;
        double largePrice = 3.0;

        // Assign the price based on the size of the drink
        double price = 0.0;
        switch (size) {
            case 'S' -> price = smallPrice;
            case 'M' -> price = mediumPrice;
            case 'L' -> price = largePrice;
            default -> System.out.println("Invalid size");
        }
        return price;
    }
}

