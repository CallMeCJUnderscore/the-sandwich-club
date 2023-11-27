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

    public void setSize(char size) {
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
        return 0;
    }
}
