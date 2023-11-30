package com.pluralsight;

public class Chips implements Product{
    /*---------------VARIABLES---------------*/

    private String flavor;

    /*--------------CONSTRUCTORS-------------*/

    public Chips(String flavor) {
        this.flavor = flavor;
    }

    /*------------GETTERS/SETTERS------------*/

    public String getFlavor() {
        return flavor;
    }


    /*---------------FUNCTIONS---------------*/

    @Override
    public double getPrice() {
        return 1.50;
    }
  }
