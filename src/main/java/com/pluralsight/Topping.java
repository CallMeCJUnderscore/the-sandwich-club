package com.pluralsight;

public abstract class Topping implements Product{
    /*---------------VARIABLES---------------*/

    protected String name;

    /*--------------CONSTRUCTORS-------------*/

    public Topping(String name) {
        this.name = name;
    }

    /*------------GETTERS/SETTERS------------*/

    public String getName() {
        return name;
    }


    /*---------------FUNCTIONS---------------*/

    @Override
    public double getPrice() {
        return 0;
    }
}
