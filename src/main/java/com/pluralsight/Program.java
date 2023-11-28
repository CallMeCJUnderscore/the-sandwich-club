package com.pluralsight;

//Class diagram https://lucid.app/lucidchart/c47034a4-1521-4ceb-847c-785be91c9266/edit?invitationId=inv_1a56c59d-867c-44f7-a3d5-7057d22ce5fc&page=HWEp-vi-RSFO



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        boolean run = true;

        ReceiptManager receiptManager = new ReceiptManager();

        List<Sandwich> sandwiches= new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();
        List<Chips> chips = new ArrayList<>();
        Order order = new Order(sandwiches, drinks, chips);



        checkout(order, receiptManager);
        //reset to main menu after this
    }

    public static void checkout(Order order, ReceiptManager receiptManager) {
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);
        for (Sandwich sandwich : order.getSandwiches()) {
            total += sandwich.getPrice();
        }
        for (Drink drink : order.getDrinks()) {
            total += drink.getPrice();
        }
        for (Chips chip : order.getChips()) {
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
