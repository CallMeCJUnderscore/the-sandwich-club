package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    /*---------------VARIABLES---------------*/

    List<Sandwich> orderedSandwiches;
    List<Drink> orderedDrinks;
    List<Chips> orderedChips;

    /*--------------CONSTRUCTORS-------------*/

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.orderedSandwiches = new ArrayList<>();
        this.orderedDrinks = new ArrayList<>();
        this.orderedChips = new ArrayList<>();
    }



    /*------------GETTERS/SETTERS------------*/

    public List<Sandwich> getOrderedSandwiches() {
        return orderedSandwiches;
    }

    public void setOrderedSandwiches(List<Sandwich> orderedSandwiches) {
        this.orderedSandwiches = orderedSandwiches;
    }

    public List<Drink> getOrderedDrinks() {
        return orderedDrinks;
    }

    public void setOrderedDrinks(List<Drink> orderedDrinks) {
        this.orderedDrinks = orderedDrinks;
    }

    public List<Chips> getOrderedChips() {
        return orderedChips;
    }

    public void setOrderedChips(List<Chips> orderedChips) {
        this.orderedChips = orderedChips;
    }

    /*---------------FUNCTIONS---------------*/

    public void createSandwich(Scanner scanner) {    /*DELETE THIS*/
        //createSandwich
        System.out.println("\nCreating a new sandwich: ");

    }

    public void orderSandwich() {
        Scanner scanner = new Scanner(System.in);


        // Get bread type
        System.out.println("Select your bread:");
        System.out.println("1. White");
        System.out.println("2. Wheat");
        System.out.println("3. Rye");
        System.out.println("4. Wrap");
        int breadChoice = scanner.nextInt();
        String breadType;
        switch (breadChoice) {
            case 1:
                breadType = "White";
                break;
            case 2:
                breadType = "Wheat";
                break;
            case 3:
                breadType = "Rye";
                break;
            case 4:
                breadType = "Wrap";
                break;
            default:
                breadType = "White"; // using the default to choose white if invalid choice is Made
                break;
        }

        //To Choose the sandwich size
        System.out.println("Select sandwich size: ");
        System.out.println("S 4\"");
        System.out.println("M 8\"");
        System.out.println("L 12\"");
        char sizeChoice = scanner.next().toUpperCase().charAt(0);
        String sandwichSize; /*THIS SHOULD BE AN INT*/
        double price;

        switch (sizeChoice) {
            case 1: /*FIX CASES*/
                sandwichSize = "4\"";
                break;
            case 2:
                sandwichSize = "8\"";
                break;

            case 3:
                sandwichSize = "12\"";
                break;
            default:
                sandwichSize = "8\"";
                //using the default to choose 8\" if invalid choice is Made
                break;

        }
        /*1. Ask for meat choice
        2. Ask for extra meat
        3. Ask for cheese
        4. Ask for extra cheese


        Repeat for regular toppings, then sauces/au jus

        Finally, add to orderedSandwiches*/

        //REMEMBER THE CLASS DIAGRAM
    }

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
                    case 'S':
                        newDrink.setSize(DrinkSize.SMALL);
                        break;
                    case 'M':
                        newDrink.setSize(DrinkSize.SMALL);
                        break;
                    case 'L':
                        newDrink.setSize(DrinkSize.LARGE);
                        break;
                    default:
                        newDrink.setSize(DrinkSize.MEDIUM);
                        break;
                }
                return new Drink();*/

        //Prompt for flavor, then add Drink object to orderedDrinks
    }

    public void orderChips() {
        //Prompt for flavor, then add Chip object to orderedChips

    }



}

