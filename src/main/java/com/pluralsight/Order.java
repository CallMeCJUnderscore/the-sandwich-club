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
    }
}
