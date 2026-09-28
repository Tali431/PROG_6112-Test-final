/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class Gamingconsolereport {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        

        // Single-dimensional array containing the city names
        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };

        // Single-dimensional array containing the gaming console names
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        /*
         * Two-dimensional array containing the sales data.
         *
         * Rows represent the cities:
         * Row 0 = Cape Town
         * Row 1 = Port Elizabeth
         * Row 2 = Pretoria
         *
         * Columns represent the consoles:
         * Column 0 = PS5
         * Column 1 = XBOX
         * Column 2 = SWITCH
         */
        int[][] sales = {
            {1000, 2000, 3000},  // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };

        // Array to store the total sales for each city
        int[] cityTotals = new int[cities.length];

        // Calculate the total sales for each city
        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {
                cityTotals[i] += sales[i][j];
            }
        }

        // Find the city with the highest total sales
        int highestSales = cityTotals[0];
        int highestCityIndex = 0;

        for (int i = 1; i < cityTotals.length; i++) {

            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                highestCityIndex = i;
            }
        }

        // Display the Gaming Console Report
        System.out.println("------------------------------------------------------------");
        System.out.println("                 GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");

        // Display the headings
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "CITY", consoles[0], consoles[1], consoles[2]);

        // Display the sales data
        for (int i = 0; i < sales.length; i++) {

            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        // Display the total sales for each city
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s %d%n",
                    cities[i], cityTotals[i]);
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: "
                + cities[highestCityIndex]);

        System.out.println("------------------------------------------------------------");
    }
}

