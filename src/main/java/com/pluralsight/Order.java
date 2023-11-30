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
        List<Topping> toppings = new ArrayList<>();


        // Get bread type
        System.out.println("Select your bread:");
        System.out.println("1. White");
        System.out.println("2. Wheat");
        System.out.println("3. Rye");
        System.out.println("4. Wrap");
        int breadChoice = scanner.nextInt();
        scanner.nextLine();
        String breadType = switch (breadChoice) {
            case 1 -> "White";
            case 2 -> "Wheat";
            case 3 -> "Rye";
            case 4 -> "Wrap";
            default -> "White"; // using the default to choose white if invalid choice is Made
        };

        //To Choose the sandwich size
        System.out.println("Select sandwich size: ");
        System.out.println("1. S (4\")");
        System.out.println("2. M (8\")");
        System.out.println("3. L (12\")");
        int sizeChoice = scanner.nextInt();
        char sandwichSize;

        sandwichSize = switch (sizeChoice) {
            case 1 -> 'S';
            case 2 -> 'M';
            case 3 -> 'L';
            default -> 'S';
            //using the default to choose Medium if invalid choice is Made
        };

        System.out.print("Would you like your sandwich toasted (Y/N)? ");
        char toastedChoice = scanner.nextLine().toUpperCase().charAt(0);
        boolean toasted = toastedChoice == 'Y';

        System.out.println("Please select a Meat: ");
        System.out.println("1. Steak");
        System.out.println("2. Ham");
        System.out.println("3. Salami");
        System.out.println("4. Roast Beef");
        System.out.println("5. Chicken");
        System.out.println("6. Bacon");
        System.out.println("7. None");
        System.out.print("Which would you like? ");
        int meatChoice = scanner.nextInt();
        scanner.nextLine();

        switch (meatChoice) {
            case 1 -> toppings.add(new PremiumTopping("Steak"));
            case 2 -> toppings.add(new PremiumTopping("Ham"));
            case 3 -> toppings.add(new PremiumTopping("Salami"));
            case 4 -> toppings.add(new PremiumTopping("Roast Beef"));
            case 5 -> toppings.add(new PremiumTopping("Chicken"));
            case 6 -> toppings.add(new PremiumTopping("Bacon"));
            default -> meatChoice = -1;

        }
        char extraMeat = 'X';
        if(meatChoice != -1){

            System.out.println("Please select an Extra Meat: ");
            System.out.println("1. Steak");
            System.out.println("2. Ham");
            System.out.println("3. Salami");
            System.out.println("4. Roast Beef");
            System.out.println("5. Chicken");
            System.out.println("6. Bacon");
            System.out.println("7. None");
            System.out.print("Which would you like? ");
            meatChoice = scanner.nextInt();
            scanner.nextLine();

            switch (meatChoice) {
                case 1 -> extraMeat = 'S';
                case 2 -> extraMeat = 'H';
                case 3 -> extraMeat = 'A';
                case 4 -> extraMeat = 'R';
                case 5 -> extraMeat = 'C';
                case 6 -> extraMeat = 'B';
            }
        }


        System.out.println("Please select a Cheese: ");
        System.out.println("1. American");
        System.out.println("2. Provolone");
        System.out.println("3. Cheddar");
        System.out.println("4. Swiss");
        System.out.println("5. None");
        System.out.print("Which would you like? ");
        int cheeseChoice = scanner.nextInt();
        scanner.nextLine();

        switch (cheeseChoice) {
            case 1 -> toppings.add(new PremiumTopping("American"));
            case 2 -> toppings.add(new PremiumTopping("Provolone"));
            case 3 -> toppings.add(new PremiumTopping("Cheddar"));
            case 4 -> toppings.add(new PremiumTopping("Swiss"));
            default -> cheeseChoice = -1;

        }
        char extraCheese = 'X';
        if (cheeseChoice != -1){

            System.out.println("Please select an extra Cheese: ");
            System.out.println("1. American");
            System.out.println("2. Provolone");
            System.out.println("3. Cheddar");
            System.out.println("4. Swiss");
            System.out.println("5. None");
            System.out.print("Which would you like? ");
            cheeseChoice = scanner.nextInt();
            scanner.nextLine();

            switch (cheeseChoice) {
                case 1 -> extraCheese = 'A';
                case 2 -> extraCheese = 'P';
                case 3 -> extraCheese = 'C';
                case 4 -> extraCheese = 'S';
            }
        }

        int toppingChoice = 0;
        boolean doneWithToppings = false;
        do{
            System.out.println("Please select as many Regular toppings as you'd like: ");
            System.out.println("1. Lettuce");
            System.out.println("2. Peppers");
            System.out.println("3. Onions");
            System.out.println("4. Tomatoes");
            System.out.println("5. Jalapenos");
            System.out.println("6. Cucumbers");
            System.out.println("7. Guacamole");
            System.out.println("8. Mushrooms");
            System.out.println("9. No more");
            System.out.print("Which would you like? ");
            toppingChoice = scanner.nextInt();
            scanner.nextLine();

            switch (toppingChoice) {
                case 1 -> toppings.add(new RegularTopping("Lettuce"));
                case 2 -> toppings.add(new RegularTopping("Peppers"));
                case 3 -> toppings.add(new RegularTopping("Onions"));
                case 4 -> toppings.add(new RegularTopping("Tomatoes"));
                case 5 -> toppings.add(new RegularTopping("Jalapenos"));
                case 6 -> toppings.add(new RegularTopping("Cucumbers"));
                case 7 -> toppings.add(new RegularTopping("Guacamole"));
                case 8 -> toppings.add(new RegularTopping("Mushrooms"));
                default -> doneWithToppings = true;
            }
        }while(!doneWithToppings);

        boolean doneWithSauces = false;
        do{
            System.out.println("Please select as many Sauces as you'd like: ");
            System.out.println("1. Mayo");
            System.out.println("2. Mustard");
            System.out.println("3. Ketchup");
            System.out.println("4. Ranch");
            System.out.println("5. Thousand Island");
            System.out.println("6. Vinaigrette");
            System.out.println("7. Au Jus");
            System.out.println("8. No more");
            System.out.print("Which would you like? ");
            toppingChoice = scanner.nextInt();
            scanner.nextLine();

            switch (toppingChoice) {
                case 1 -> toppings.add(new Sauce("Mayo"));
                case 2 -> toppings.add(new Sauce("Mustard"));
                case 3 -> toppings.add(new Sauce("Ketchup"));
                case 4 -> toppings.add(new Sauce("Ranch"));
                case 5 -> toppings.add(new Sauce("Thousand Island"));
                case 6 -> toppings.add(new Sauce("Vinaigrette"));
                case 7 -> toppings.add(new Sauce("Au Jus"));
                default -> doneWithSauces = true;
            }
        }while (!doneWithSauces);

        orderedSandwiches.add(new Sandwich(sandwichSize,breadType,  toasted, extraMeat, extraCheese, toppings));
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

