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

                Scanner scanner = new Scanner(System.in);
                boolean quit = false;
                ReceiptManager receiptManager = new ReceiptManager();
                Order order = new Order();


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
                        case 1 -> order.orderSandwich(scanner);
                        case 2 -> order.orderDrink(scanner);
                        case 3 -> order.orderChips(scanner);
                        case 4 -> {
                            checkout(order, receiptManager);
                            order = new Order();
                        }
                        case 5 -> {
                            quit = true;
                            System.out.println("Program terminated.");
                        }
                        default -> System.out.println("Invalid choice. Please select again.");
                    }
                    scanner.close();
                }


                private static void goBack () {
                    System.out.println("Going back to the previous menu...");

                }
            }


    private static void displayMenu() {
        System.out.println("Order Menu:");
        System.out.println("1. Sandwich");
        System.out.println("2. Drink");
        System.out.println("3. Chips");
        System.out.println("4. Checkout");
        System.out.println("5. Quit");
        System.out.print("Select an option: ");
    }


    private static void displayHeader() {
        System.out.println("""
                     _____ _          ___               _        _    _       ___ _      _   \s
                    |_   _| |_  ___  / __| __ _ _ _  __| |_ __ _(_)__| |_    / __| |_  _| |__\s
                      | | | ' \\/ -_) \\__ \\/ _` | ' \\/ _` \\ V  V / / _| ' \\  | (__| | || | '_ \\
                      |_| |_||_\\___| |___/\\__,_|_||_\\__,_|\\_/\\_/|_\\__|_||_|  \\___|_|\\_,_|_.__/""");
            }

    public static void checkout(Order order, ReceiptManager receiptManager) {
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);
        for (Sandwich sandwich : order.getOrderedSandwiches()) {
            total += sandwich.getPrice();
        }
        for (Drink drink : order.getOrderedDrinks()) {
            total += drink.getPrice();
        }
        for (Chips chip : order.getOrderedChips()) {
            total += chip.getPrice();
        }
        System.out.printf("The total for the order is $%.2f.", total);
        System.out.print("\nDo you agree to this price? (Y/N) ");
        char command = scanner.nextLine().toUpperCase().charAt(0);
        if (command == 'Y') {
            System.out.println("Thank you! Creating receipt...");
            receiptManager.saveReceipt(order, total);
        }
    }


    }

