package com.pluralsight;

//Class diagram https://lucid.app/lucidchart/c47034a4-1521-4ceb-847c-785be91c9266/edit?invitationId=inv_1a56c59d-867c-44f7-a3d5-7057d22ce5fc&page=HWEp-vi-RSFO


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Existing imports and code...

                Scanner scanner = new Scanner(System.in);
                boolean quit = false;
                ReceiptManager receiptManager = new ReceiptManager();


                while (!quit) {
                    displayHeader();
                    displayMenu();

                    int choice = scanner.nextInt();
                    scanner.nextLine(); //  newline character

                    switch (choice) {
                        case 1:
                            createSandwich();
                            break;
                        case 2:
                            createDrink();
                            break;
                        case 3:
                            createChips();
                            break;
                        case 4:
                           // receiptManager.saveReceipt(); //This wants the Order object, and then the Total of the order
                            break;
                        case 5:
                            quit = true;
                            System.out.println("Program terminated.");
                            break;
                        case 6:
                            goBack(); // the go backfunction
                            break;
                        default:
                            System.out.println("Invalid choice. Please select again.");
                            break;
                    }
                }
                scanner.close();
            }

    private static void goBack() {
    }

    private static void displayMenu() {
        System.out.println("Order Menu:");
        System.out.println("1. Sandwich");
        System.out.println("2. Drink");
        System.out.println("3. Chips");
        System.out.println("4. Checkout");
        System.out.println("5. Quit");
        System.out.println("6. Go Back"); // Option to go back
        System.out.print("Select an option: ");
    }

    // Implement methods for creating sandwich, drink, chips, and generating receipt
    // Implement the goBack() method to handle going back in the application flow


/*    private static void saveReceipt() {       NOT NEEDED

    }*/

    private static void createChips() {
    }

    private static void createDrink() {

    }

    private static void createSandwich() {

    }

    private static void displayHeader() {
                // Display header implementation
            }




    }

