/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesalesapplication;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class ConsoleSalesApplication {

    public static void main(String[] args) {

        // Create Scanner object to accept user input
        Scanner input = new Scanner(System.in);

        // Display the console selection menu
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        // Ask the user to select a console
        System.out.print("\nEnter your choice: ");
        int choice = input.nextInt();

        // Variable to store the selected console
        String consoleType;

        // Determine the console type based on the user's choice
        switch (choice) {

            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                consoleType = "INVALID";
                break;
        }

        // Check if the user entered an invalid choice
        if (consoleType.equals("INVALID")) {

            System.out.println("Invalid console selection.");

        } else {

            // Clear the newline left by nextInt()
            input.nextLine();

            // Ask the user to enter the store name
            System.out.print("Enter the store: ");
            String store = input.nextLine();

            // Ask the user to enter the total sales
            System.out.print("Enter the total sales of "
                    + consoleType + " consoles for "
                    + store + ": ");
            int totalSales = input.nextInt();

            // Create a ConsoleSales object
            ConsoleSales sales = new ConsoleSales(
                    consoleType,
                    store,
                    totalSales
            );

            // Print the report
            sales.printReport();
        }

        // Close the Scanner
        input.close();
    }
}

