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

    public void saveReceipt (Order order, double total){
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
                for(Sandwich sandwich : order.getSandwiches()){
                    output = String.format("%n%n ");
                    bufferedWriter.write(output);
                }

                for(Drink drink : order.getDrinks()){
                    output = String.format("%n%n%c drink - %s Flavor%nPrice: $%.2f", drink.getSize(), drink.getFlavor(), drink.getPrice());
                    bufferedWriter.write(output);
                }

                for(Chips chip : order.getChips()){
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
