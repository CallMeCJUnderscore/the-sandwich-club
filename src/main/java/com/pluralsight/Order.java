package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    /*---------------VARIABLES---------------*/

    List<Sandwich> sandwiches;
    List<Drink> drinks;
    List<Chips> chips;

    /*--------------CONSTRUCTORS-------------*/

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();

    }
    public void createSandwich(Scanner scanner) {
        //createSandwich
        System.out.println("\nCreating a new sandwich: ");

        System.out.println("Select the size of the sandwich(4\", 8\", or 12\"):");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Select the type of bread (white, wheat, rye, wrap):");
        String breadType = scanner.nextLine();

        List<String> toppings = chooseToppings(scanner);
        List<String> sauces = chooseSauces(scanner);

        System.out.println("Would you like your sandwich toasted? (yes/no)");
        String toastPreference = scanner.nextLine();

        Sandwich sandwich = new customSandwich(size, breadType, toppings, sauces, toastPreference);

        System.out.println("Sandwich added to the order!");
    }
    private List<String> chooseToppings(Scanner scanner) {
        System.out.println("Choose your toppings (Enter 'DONE' when you're finished): ");
        List<String> toppings = new ArrayList<>();
        String topping;
        do {
            topping = scanner.nextLine();
            if (!topping.equalsIgnoreCase("done")) {
                topping.add(topping);
            }
        } while (!topping.equalsIgnoreCase("done"));
        return toppings;

    }
    private List<String> chooseSauces(Scanner scanner) {
        System.out.println("Choose sauces (Enter 'DONE' when you're finished):" );
        List<String> sauces = new ArrayList<>();
        String sauce; 



    }
}
