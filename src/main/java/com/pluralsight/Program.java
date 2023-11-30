package com.pluralsight;

//Class diagram https://lucid.app/lucidchart/c47034a4-1521-4ceb-847c-785be91c9266/edit?invitationId=inv_1a56c59d-867c-44f7-a3d5-7057d22ce5fc&page=HWEp-vi-RSFO


import java.util.Scanner;

import static com.pluralsight.Sandwich.order;

public class Program {
    public Program() {
    }
    public static void main(String[] args) {
        displayMainMenu();
        displayMenu();
    }
    //Main Menu
    public static void displayMainMenu() {
        System.out.println("Press 1 for New Order");
        System.out.println("Press 2 for quit");
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        while (condition == true) {
            int option = scanner.nextInt();
            if (option == 1) {
                displayMenu();
                condition = false;
            } else if (option == 2) {
                System.out.println("Quiting now, Thank you!");
                condition = false;
            } else {
                System.out.println("Invalid option");

                //Order Menu
                public static void displayMenu () {
                    System.out.println("The Sandwich Club Order Menu:");

                    System.out.println("1. Sandwich");
                    System.out.println("2. Drink");
                    System.out.println("3. Chips");
                    System.out.println("4. Checkout");
                    System.out.println("5. Quit");
                    System.out.println("6. Go Back"); // Option to go back
                    System.out.print("Select an option: ");


                    Scanner scanner = new Scanner(System.in);
                    boolean quit = false;
                    ;

                    Order order = new Order();
                    ReceiptManager receiptManager = new ReceiptManager()
                    while (!quit) {
                        int choice = scanner.nextInt();
                        scanner.nextLine(); //  newline character
                        Product item;

                        switch (choice) {
                            case 1:
                                order = new Order();
                                break;
                            case 2:
                                item = Drink.order();
                                break;
                            case 3:
                                item = Chips.order();
                                break;
                            case 4:
                                receiptManager.saveReceipt(order, order.getPrice());
                                break;
                            case 5:
                                quit = true;
                                System.out.println("Program terminated.");
                                break;
                            case 6:
                                System.out.println("I am outside");
                                displayMainMenu();
                                return;

                            default:
                                System.out.println("Invalid choice. Please select again.");
                                break;
                        }
                    }
                    scanner.close();
                }


                private static void goBack () {
                    System.out.println("Going back to the previous menu...");

                }
            }
        
