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


    public String getFlavor() {
        return flavor;
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
                case 'L':
                    size = "Large";
                    break;
                case 'M':
                    size = "Medium";
                    break;
                case 'S':
                    size = "Small";
                    break;
                default:
                    size = "Small";
            }

            System.out.println("Select drink flavor:");
            System.out.println("1. Coke");
            System.out.println("2. Pepsi");
            System.out.println("3. Lemonade");
            int flavorChoice = scanner.nextInt();

            String flavor;
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
            double smallPrice = 2.0;
            double mediumPrice = 2.5;
            double largePrice = 3.0;

        // assign the price based on the size of the drink
        double price = 0.0;

        switch (size) {
            case 'S' -> price = smallPrice;
            case 'M' -> price = mediumPrice;
            case 'L' -> price = largePrice;
            default -> System.out.println("Invalid size");
        }
        return price;
    }



}
