package com.pluralsight;

import java.util.List;

public class Order {
    /*---------------VARIABLES---------------*/

    List<Sandwich> sandwiches;
    List<Drink> drinks;
    List<Chips> chips;

    /*--------------CONSTRUCTORS-------------*/

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    /*------------GETTERS/SETTERS------------*/

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    /*---------------FUNCTIONS---------------*/

    public Sandwich orderSandwich(){

        return null;
    }

    public Drink orderDrink(){
        return null;
    }

    public Chips orderChips(){
        return null;
    }
}
