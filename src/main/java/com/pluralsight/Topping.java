package com.pluralsight;

public abstract class Topping implements Product{
    /*---------------VARIABLES---------------*/

    protected String name;

    /*--------------CONSTRUCTORS-------------*/




    /*------------GETTERS/SETTERS------------*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*---------------FUNCTIONS---------------*/


    @Override
    public double getPrice() {
        return 0;
    }
}
