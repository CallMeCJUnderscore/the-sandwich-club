package com.pluralsight;

public class Drink implements Product{
    /*---------------VARIABLES---------------*/

    public String size;
    public String flavor;

    /*--------------CONSTRUCTORS-------------*/

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    /*------------GETTERS/SETTERS------------*/

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
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
        switch (size.toUpperCase()) {
            case "S":
                price = smallPrice;
                break;
            case "M":
                price = mediumPrice;
                break;
            case "L":
                price = largePrice;
                break;
            default:
                System.out.println("Invalid size");
        }


        return price;
    }

    public char[] getDescription() {
    }
}
