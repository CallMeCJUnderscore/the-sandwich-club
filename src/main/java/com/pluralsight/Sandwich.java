package com.pluralsight;

import java.util.List;

public class Sandwich implements Product{
    /*---------------VARIABLES---------------*/

    public char size;
    public String breadType;
    public boolean isToasted;
    public char extraMeat;
    public char extraCheese;
    List<Topping> toppings;

    /*--------------CONSTRUCTORS-------------*/

    public Sandwich(char size, String breadType, boolean isToasted, char extraMeat, char extraCheese, List<Topping> toppings) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.toppings = toppings;
    }



    /*------------GETTERS/SETTERS------------*/



    /*---------------FUNCTIONS---------------*/
    @Override
    public double getPrice() {
        return 0;
    }
}
