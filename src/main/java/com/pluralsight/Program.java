package com.pluralsight;

//Class diagram https://lucid.app/lucidchart/c47034a4-1521-4ceb-847c-785be91c9266/edit?invitationId=inv_1a56c59d-867c-44f7-a3d5-7057d22ce5fc&page=HWEp-vi-RSFO


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        public void display () {
            boolean quit = false;
            while (!quit) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("The Sandwich Club Order Menu:");
                System.out.println("1. Sandwich");
                System.out.println("2. Drink");
                System.out.println("3. Chips");
                System.out.println("4. Checkout");
                System.out.println("5. Quit");
                System.out.println("6. Go Back"); // option to go back
                System.out.print("Select an option: ");

                int choice = scanner.nextInt();

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
                        //receiptManager.saveReceipt(); //This wants the Order object, and then the Total of the order
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
        }