package com.pluralsight;

//Class diagram https://lucid.app/lucidchart/c47034a4-1521-4ceb-847c-785be91c9266/edit?invitationId=inv_1a56c59d-867c-44f7-a3d5-7057d22ce5fc&page=HWEp-vi-RSFO



import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

    }

    public void checkout(Order order, ReceiptManager receiptManager) {
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);
        for (Sandwich sandwich : order.getSandwiches()) {
            total += sandwich.getPrice();
        }
        for (Drink drink : order.getDrinks()) {
            total += drink.getPrice();
        }
        for (Chips chips : order.getChips()) {
            total += chips.getPrice();
        }
        System.out.printf("The total for the order is $%.2f.", total);
        System.out.print("Do you agree to this price? (Y/N)");
        char command = scanner.nextLine().toUpperCase().charAt(0);
        //TODO: Figure out how to handle rejecting order
        if (command == 'Y') {
            receiptManager.saveReceipt(order);
        }
    }
}
