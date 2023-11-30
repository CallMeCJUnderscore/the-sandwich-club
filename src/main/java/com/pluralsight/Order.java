package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    /*---------------VARIABLES---------------*/

    List<Product> orderItems = new ArrayList<Product>();






    /*------------GETTERS/SETTERS------------*/

    public List<Product> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<Product> orderItems) {
        this.orderItems = orderItems;
    }

    /*---------------FUNCTIONS---------------*/



        /* CHECK 1. Ask for meat choice
        CHECK 2. Ask for extra meat
        CHECK 3. Ask for cheese
       CHECK  4. Ask for extra cheese


        Repeat for regular toppings, then sauces/au jus

        Finally, add to orderedSandwiches*/

        //REMEMBER THE CLASS DIAGRAM
    }
//Move to Drink Class
    public void orderDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Drink Size");
        System.out.println("S. Small ");
        System.out.println("M. Medium ");
        System.out.println("L. Large ");
        char sizeChoice = scanner.next().toUpperCase().charAt(0);
        //MAKE SURE THE DRINK GETS CREATED WITH CAPITAL LETTERS FOR SIZE

               /* Drink newDrink = new Drink();

                switch (sizeChoice) {

                }
                return new Drink();*/

        //Prompt for flavor, then add Drink object to orderedDrinks
    }
//Move to Chips
    public void orderChips() {
            Scanner scanner = new Scanner(System.in);

    }



}

