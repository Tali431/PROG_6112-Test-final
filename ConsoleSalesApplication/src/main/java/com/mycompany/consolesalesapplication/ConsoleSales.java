/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesalesapplication;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Console {

    // Constructor for ConsoleSales
    // It accepts the console type, store name and total sales
    public ConsoleSales(String consoleType, String store, int totalSales) {

        // Call the constructor of the parent Console class
        super(consoleType, store, totalSales);
    }

    // Method to print the console sales report
    public void printReport() {

        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("====================");

        // Display the console type
        System.out.println("CONSOLE TYPE: " + getConsoleType());

        // Display the store name
        System.out.println("STORE: " + getStore());

        // Display the total sales
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}


