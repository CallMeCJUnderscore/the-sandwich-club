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
        //1. Create a double to hold the price of the sandwich
        double priceSandwich = 0.0;
        double smallPrice = 5.50;
        double mediumPrice = 7.00;
        double largePrice = 8.50;
        //2. Determine the starting price of the sandwich (hint: SIZE)

        switch (size) {
            case 'S' -> priceSandwich = smallPrice;
            case 'M' -> priceSandwich = mediumPrice;
            case 'L' -> priceSandwich = largePrice;
        }



        //3. Add the value of every topping to the price (HINT: Every topping has a getPrice method that can be called, but some of them are not complete)
        for (Topping topping : toppings) {
            if(topping instanceof PremiumTopping premiumTopping){
                if(premiumTopping.getName().matches("American|Swiss|Provolone|Cheddar")){
                    switch (size) {
                        case 'S' -> priceSandwich += .75;
                        case 'M' -> priceSandwich += 1.50;
                        case 'L' -> priceSandwich += 2.25;
                    }
                }
                else{
                    switch (size) {
                        case 'S' -> priceSandwich += 1.00;
                        case 'M' -> priceSandwich += 2.00;
                        case 'L' -> priceSandwich += 3.00;
                    }
                }
            }

            else {
                priceSandwich += topping.getPrice();
            }
        }
        //4. Check if they ordered extra meat or cheese, and add it to the price
        double extraMeatPrice = 1.0; // Assuming a fixed price for extra meat
        double extraCheesePrice = 0.5; // Assuming a fixed price for extra cheese

        if (extraMeat != 'X') {
            switch (size) {
                case 'S' -> priceSandwich += .50;
                case 'M' -> priceSandwich += 1.00;
                case 'L' -> priceSandwich += 1.50;
            }
        }

        if (extraCheese != 'X') {
            switch (size) {
                case 'S' -> priceSandwich += .30;
                case 'M' -> priceSandwich += .60;
                case 'L' -> priceSandwich += .90;
            }
        }
        //5. Return the price
        return priceSandwich;
    }
/*    private double calculateToppingPrice(Topping topping) {
        if (topping.isFree()) {
            return 0.0; // All regular toppings are free
        }
        else {

            return topping.getPrice();
        }
    }*/

}

