package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class Sandwich implements Product{
    public static Product order;



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


    public static Product order() {
        //Add all the sandwich Stuff
    }
        public Sandwich orderSandwich() {
            Scanner scanner = new Scanner(System.in);


            // Get bread type
            //Move to Sandwich Class
            //Use the \n to shorten the print statements
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

            }

            //To Choose the sandwich size
            System.out.println("Select sandwich size: ");
            System.out.println("S 4\"");
            System.out.println("M 8\"");
            System.out.println("L 12\"");
            char sizeChoice = scanner.next().toUpperCase().charAt(0);
            char sandwichSize;

            switch (sizeChoice) {
                case 'S': // FIX CASES
                    sandwichSize = 4;
                    break;
                case 'M':
                    sandwichSize = 8;
                    break;
                case 'L':
                    sandwichSize = 12;
                    break;
                default:
                    sandwichSize = 8; // using the default to choose 8" if an invalid choice is made

            }
            scanner.nextLine(); //only to consume the newline character

            //ASK FOR MEAT CHOICE
            System.out.println("Select meat toppings. Use a comma to separate");
            System.out.println("S. Steak");
            System.out.println("H. Ham");
            System.out.println("A. Salami");

            String meatSelection = scanner.nextLine();
            char[] selectedMeats = meatSelection.toCharArray();


            //ASK FOR EXTRA MEAT
            System.out.println("Would you like extra meat? (Y/N)");

            String extraMeatChoice = scanner.nextLine();
            boolean hasExtraMeat = extraMeatChoice.equalsIgnoreCase("Y");
            double extraMeatCost = 0.0;

            if (hasExtraMeat) {
                if (sandwichSize == 4) {
                    extraMeatCost = 1.00; // for the 4-inch sandwich
                } else if (sandwichSize == 8) {
                    extraMeatCost = 1.50; // for the 8-inch sandwich
                } else {
                    extraMeatCost = 2.00; // for the 12-inch sandwich
                }

            }


            //ADDITIONAL TOPPINGS-Cheese
            System.out.println("Select cheese toppings. Use a comma to separate");
            System.out.println("A. American");
            System.out.println("P. Provolone");
            System.out.println("C. Cheddar");
            System.out.println("S. Swiss");

            String cheeseSelection = scanner.nextLine();
            char[] selectedCheeses = cheeseSelection.toCharArray();
            System.out.println("Would you like extra cheese? (Y/N)");
            String extraCheeseChoice = scanner.nextLine();
            boolean hasExtraCheese = extraCheeseChoice.equalsIgnoreCase("Y");
            //USe SWITCH instead
            double extraCheeseCost = 0.0;
            if (hasExtraCheese) {
                if (sandwichSize == 4) {
                    extraCheeseCost = 0.30;
                } else if (sandwichSize == 8) {
                    extraCheeseCost = 1.50;
                } else {
                    extraCheeseCost = 2.25;
                }
            }

            // Calculate the total price including extra cheese
            double price = 0;
            double totalPrice = price;
            if (hasExtraCheese) {
                totalPrice += extraCheeseCost;
            }

            // Create the sandwich object with extra cheese information
            Sandwich sandwich = new Sandwich(breadType, sandwichSize, totalPrice, selectedMeats, selectedCheeses,
                    selectedOtherToppings, selectedSauces, isToasted, hasExtraCheese, extraCheeseCost);
            //Filling in the remainder of the method that's why they're red

            return sandwich;

            System.out.println("Select sauce toppings. Use a comma to separate");
            System.out.println("M. Mayo");
            System.out.println("R. Ranch");
            System.out.println("K. Ketchup");
            String sauceSelection = scanner.nextLine();
            char[] selectedSauces = sauceSelection.toCharArray();

            // Ask if the user wants it toasted
            System.out.println("Would you like the sandwich toasted? (Y/N)");
            String toastedChoice = scanner.nextLine();
            boolean isToasted = toastedChoice.equalsIgnoreCase("Y");

            return null;
    }


    @Override
    public double getPrice() {
        //1. Create a double to hold the price of the sandwich
        //2. Determine the starting price of the sandwich (hint: SIZE)
        //3. Add the value of every topping to the price (HINT: Every topping has a getPrice method that can be called, but some of them are not complete)
        //4. Check if they ordered extra meat or cheese, and add it to the price
        //5. Return the price
        return 0;
    }
}
