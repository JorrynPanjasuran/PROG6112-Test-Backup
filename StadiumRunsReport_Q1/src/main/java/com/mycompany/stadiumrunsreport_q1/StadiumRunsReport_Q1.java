/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
 * CODE ATTRIBUTION (STADIUM RUNS REPORT)
 * TITLE: PROG6112 Past Paper Memo Solution – Question 1 (2023)
 * AUTHOR: Rochelle Moodley 
 * DATE: Accessed 28 Sept. 2025
 * AVAILABLE: Varsity College PROG6112 Past Paper and Memo (2023)
 *
 * TITLE: Java Programming, 9th Edition
 * AUTHOR: Joyce Farrell
 * DATE: Accessed 28 Sept. 2025
 * AVAILABLE: Cengage Learning (Textbook reference for arrays and loops)
 *
 * TITLE: Java Arrays Tutorial
 * AUTHOR: W3Schools
 * DATE: Accessed 28 Sept. 2025
 * AVAILABLE: https://www.w3schools.com/java/java_arrays.asp
 */

package com.mycompany.stadiumrunsreport_q1;

/**
 * Author: Jorryn Panjasuran - ST10448822 - VARSITY COLLEGE DURBAN NORTH - PROG6112
 */

import java.util.Scanner; 
// CODE ATTRIBUTION: Scanner class documentation
// Oracle. (2024). Scanner (Java SE 8 API). 
// Available at: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
// Scanner allows us to read input from the user (keyboard).

public class StadiumRunsReport_Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // A line separator string used to make the report easier to read
        String line = "---------------------------------";

        // 1D arrays: these store names of stadiums and batsmen
        String[] stadiums = {"KINGS MEAD", "ST GEORGES", "WANDERERS"};
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB De Villiers"};
        // CODE ATTRIBUTION: Java One-Dimensional Arrays
        // W3Schools. (2024). Java Arrays. 
        // Available at: https://www.w3schools.com/java/java_arrays.asp
        // 1D arrays are used to store simple lists of data (like names).

        // 2D array: holds runs scored, where rows = stadiums, columns = batsmen
        int[][] runs = new int[stadiums.length][batsmen.length];
        // CODE ATTRIBUTION: Java Two-Dimensional Arrays
        // GeeksforGeeks. (2024). Multidimensional Arrays in Java.
        // Available at: https://www.geeksforgeeks.org/multidimensional-arrays-in-java/
        // 2D arrays let us store tabular data, like runs by batsman at each stadium.

        // Ask the user to enter runs for each batsman at each stadium
        for (int s = 0; s < stadiums.length; s++) { // loop through stadiums
            for (int b = 0; b < batsmen.length; b++) { // loop through batsmen
                System.out.print("Enter the number runs scored by " 
                        + batsmen[b] + " at " + stadiums[s] + ": ");
                runs[s][b] = scan.nextInt(); // store the entered runs in the 2D array
            }
        }

        // Print the Runs Scored Report heading
        System.out.println("\nRUNS SCORED REPORT");
        System.out.println(line);

        // Outer loop: goes through each batsman
        for (int b = 0; b < batsmen.length; b++) {
            System.out.println(); // leave space for readability
            // Inner loop: prints that batsman's runs at all stadiums
            for (int s = 0; s < stadiums.length; s++) {
                System.out.println(batsmen[b] + " runs scored at " 
                        + stadiums[s] + ": " + runs[s][b]);
            }
        }

        // Now calculate totals for each stadium
        System.out.println("\nTOTAL RUNS AT STADIUMS");
        int maxRuns = 0; // stores the highest total runs found so far
        int maxIndex = 0; // stores the index of the stadium with the highest runs

        // Loop through stadiums again to add up totals
        for (int s = 0; s < stadiums.length; s++) {
            int total = 0; // reset total for each stadium
            for (int b = 0; b < batsmen.length; b++) {
                total += runs[s][b]; // add each batsman’s runs to the total
            }
            System.out.println(stadiums[s] + ": " + total);

            // If this stadium has more runs than the previous max, update max
            if (total > maxRuns) {
                maxRuns = total;
                maxIndex = s;
            }
        }
        // CODE ATTRIBUTION: Finding Maximum in Arrays
        // Baeldung. (2024). Finding Max and Min in Java Arrays.
        // Available at: https://www.baeldung.com/java-array-min-max
        // The logic here compares each total to keep track of the largest.

        // Finally, for the WE will print which stadium had the most runs
        System.out.println("\nSTADIUM WITH THE MOST RUNS: " + stadiums[maxIndex]);
    }
}
