package com.pluralsight;

public class Chips implements Product{
    /*---------------VARIABLES---------------*/

    private String flavor;

    /*--------------CONSTRUCTORS-------------*/

    public Chips(String flavor) {
      Flavors:
//    Classic
//    Honey BBQ
//    Salt & Vinegar
//    Sour Cream & Onion
        this.flavor = flavor;
    }

    /*------------GETTERS/SETTERS------------*/

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /*---------------FUNCTIONS---------------*/

    @Override
    public double getPrice() {
        return 1.50;
    }

}
