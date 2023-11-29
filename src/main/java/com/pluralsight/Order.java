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

    public Order(List<Sandwich> sandwiches, List<Drink>drinks, List<Chips> chips {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();

    }
    public Sandwich orderSandwich() {
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
        String sandwichSize;
        double price;

        switch (sizeChoice) {
            case 1:
                sandwichSize = "4\"";
                price = 5.50;
                break;
            case 2:
                sandwichSize = "8\"";
                price = 7.00;
                break;

            case 3:
                sandwichSize = "12\"";
                price = 8.50;
                break;
            default:
                sandwichSize = "8\"";
                //using the default to choose 8\" if invalid choice is Made
                price = 7.00;
                break;

        }
}
