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

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public char getExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(char extraMeat) {
        this.extraMeat = extraMeat;
    }

    public char getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(char extraCheese) {
        this.extraCheese = extraCheese;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    /*---------------FUNCTIONS---------------*/
    @Override
    public double getPrice() {
        return 0;
    }
}
