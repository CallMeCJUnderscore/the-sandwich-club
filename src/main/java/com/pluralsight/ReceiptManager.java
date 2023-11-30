package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {
    /*---------------VARIABLES---------------*/



    /*--------------CONSTRUCTORS-------------*/



    /*------------GETTERS/SETTERS------------*/



    /*---------------FUNCTIONS---------------*/

    public void saveReceipt (Product order, double total){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String fileName = "receipts/"+localDateTime.format(formatter) + ".txt";
        File folder = new File("receipts");
        if(!folder.exists()){
            if(folder.mkdir()){
                System.out.println("Receipts folder created!");
            }
            else{
                System.out.println("Receipts folder already created!");
            }
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            String output = """
                     _____ _          ___               _        _    _       ___ _      _   \s
                    |_   _| |_  ___  / __| __ _ _ _  __| |_ __ _(_)__| |_    / __| |_  _| |__\s
                      | | | ' \\/ -_) \\__ \\/ _` | ' \\/ _` \\ V  V / / _| ' \\  | (__| | || | '_ \\
                      |_| |_||_\\___| |___/\\__,_|_||_\\__,_|\\_/\\_/|_\\__|_||_|  \\___|_|\\_,_|_.__/""";
            bufferedWriter.write(output);
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            output = String.format("Total price: $%.2f", total);
            bufferedWriter.write(output);
                for(Sandwich sandwich : order.getOrderedSandwiches()){
                    output = String.format("%n%n%c Sandwich (%s) - %s Bread", sandwich.getSize(), sandwich.isToasted()?"Toasted":"Not Toasted", sandwich.getBreadType());
                    bufferedWriter.write(output);

                    for(Topping topping : sandwich.getToppings()){
                        if(topping instanceof PremiumTopping premiumTopping){
                            output = String.format("%n\t%s", premiumTopping.getName());
                            bufferedWriter.write(output);
                        }
                    }

                    switch (sandwich.getExtraMeat()) {
                        case 'S' -> {
                            output = "\n\tExtra Steak";
                            bufferedWriter.write(output);
                        }
                        case 'H' -> {
                            output = "\n\tExtra Ham";
                            bufferedWriter.write(output);
                        }
                        case 'A' -> {
                            output = "\n\tExtra Salami";
                            bufferedWriter.write(output);
                        }
                        case 'R' -> {
                            output = "\n\tExtra Roast Beef";
                            bufferedWriter.write(output);
                        }
                        case 'C' -> {
                            output = "\n\tExtra Chicken";
                            bufferedWriter.write(output);
                        }
                        case 'B' -> {
                            output = "\n\tExtra Bacon";
                            bufferedWriter.write(output);
                        }
                    }

                    switch (sandwich.getExtraCheese()) {
                            case 'A' -> {
                                output = "\n\tExtra American";
                                bufferedWriter.write(output);
                            }
                            case 'P' -> {
                                output = "\n\tExtra Provolone";
                                bufferedWriter.write(output);
                            }
                            case 'C' -> {
                                output = "\n\tExtra Cheddar";
                                bufferedWriter.write(output);
                            }
                            case 'S' -> {
                                output = "\n\tExtra Swiss";
                                bufferedWriter.write(output);
                            }
                    }

                    for(Topping topping : sandwich.getToppings()){
                        if(topping instanceof RegularTopping regularTopping){
                            output = String.format("%n\t%s", regularTopping.getName());
                            bufferedWriter.write(output);
                        }
                    }
                    for(Topping topping : sandwich.getToppings()){
                        if(topping instanceof Sauce sauce){
                            output = String.format("%n\t%s", sauce.getName());
                            bufferedWriter.write(output);
                        }
                    }
                    output = String.format("%nPrice: $%.2f", sandwich.getPrice());
                    bufferedWriter.write(output);
                }

                for(Drink drink : order.getOrderedDrinks()){
                    output = String.format("%n%n%s drink - %s Flavor%nPrice: $%.2f", drink.getSize(), drink.getFlavor(), drink.getPrice());
                    bufferedWriter.write(output);
                }

                for(Chips chip : order.getOrderedChips()){
                    output = String.format("%n%nChip bag - %s Flavor%nPrice: $%.2f", chip.getFlavor(), chip.getPrice());
                    bufferedWriter.write(output);
                }

        }
        catch (IOException e){
            System.out.println("ERROR: Issue found with writing receipt to file!");
            e.printStackTrace();
        }
    }
}
