/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesalesapplication;

/**
 *
 * @author Student
 */
public class Console {
    // Variables to store console information
    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor to initialise the console details
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Getter method to return the console type
    public String getConsoleType() {
        return consoleType;
    }

    // Getter method to return the store name
    public String getStore() {
        return store;
    }

    // Getter method to return the total sales
    public int getTotalSales() {
        return totalSales;
    }
}
    


