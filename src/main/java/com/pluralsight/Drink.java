package com.pluralsight;

import java.util.Scanner;

public class Drink implements Product{



    /*---------------VARIABLES---------------*/

    public String size;
    public String flavor;

    /*--------------CONSTRUCTORS-------------*/

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public static Product order() {
        return null;
    }

    /*------------GETTERS/SETTERS------------*/

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /*---------------FUNCTIONS---------------*/

        public Drink orderDrink() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Select drink size:");
            System.out.println("S. Small");
            System.out.println("M. Medium");
            System.out.println("L. Large");
            char sizeChoice = scanner.next().toUpperCase().charAt(0);

            String size;
            switch (sizeChoice) {
                case 'S':
                    size = "Small";
                    break;
                case 'M':
                    size = "Medium";
                    break;
                case 'L':
                    size = "Large";
                    break;
                default:
                    size = "Small"; // Default to small if an invalid choice is made
                    break;
            }

            System.out.println("Select drink flavor:");
            System.out.println("1. Coke");
            System.out.println("2. Pepsi");
            System.out.println("3. Lemonade");
            int flavorChoice = scanner.nextInt();

            String flavor;

            // Mapping user input to drink flavor as a string
            switch (flavorChoice) {
                case 1:
                    flavor = "Coke";
                    break;
                case 2:
                    flavor = "Pepsi";
                    break;
                case 3:
                    flavor = "Lemonade";
                    break;
                default:
                    flavor = "Coke"; // Default to Coke if an invalid choice is made

            }

            return new Drink(size, flavor);
    }
        public double getPrice() {
        // Define base prices for each size
        double smallPrice = 2.0;
        double mediumPrice = 2.5;
        double largePrice = 3.0;

        // Assign the price based on the size of the drink
        double price = 0.0;
        switch (size) {
            case "S":
                price = smallPrice;
                break;
            case "M":
                price = mediumPrice;
                break;
            case "L":
                price = largePrice;
                break;
            default:
                System.out.println("Invalid size");
        }
        return price;
    }



}
