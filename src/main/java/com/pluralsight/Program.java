package com.pluralsight;

//Class diagram https://lucid.app/lucidchart/c47034a4-1521-4ceb-847c-785be91c9266/edit?invitationId=inv_1a56c59d-867c-44f7-a3d5-7057d22ce5fc&page=HWEp-vi-RSFO


import java.util.Scanner;

import static com.pluralsight.Sandwich.order;

public class Program {
    public Program() {
    }
    public static void main(String[] args) {

    }

    public static void displayMenu() {
        System.out.println("Order Menu:");
        System.out.println("1. Sandwich");
        System.out.println("2. Drink");
        System.out.println("3. Chips");
        System.out.println("4. Checkout");
        System.out.println("5. Quit");
        System.out.println("6. Go Back"); // Option to go back
        System.out.print("Select an option: ");


        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ReceiptManager receiptManager = new ReceiptManager();

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine(); //  newline character
            Product var4;

            switch (choice) {
                case 1:
                    var4 = Sandwich.order();
                    break;
                case 2:
                    var4 = Drink.order();
                    break;
                case 3:
                    var4 = Chips.order();
                    break;
                case 4:
                    receiptManager.saveReceipt(Sandwich.order, Sandwich.order.getPrice());                    break;
                case 5:
                    quit = true;
                    System.out.println("Program terminated.");
                    break;
                case 6:
                    goBack(); 
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }
        scanner.close();
    }





    private static void goBack() {
        System.out.println("Going back to the previous menu...");

    }
}
