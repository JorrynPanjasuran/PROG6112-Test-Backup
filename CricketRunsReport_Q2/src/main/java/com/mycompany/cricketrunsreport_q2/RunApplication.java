/*
 * PACKAGE: Ensures the class is part of the project folder structure.
 */
package com.mycompany.cricketrunsreport_q2;

// Importing Scanner class to allow user input from the keyboard
import java.util.Scanner;

/**
 * Author: Jorryn Panjasuran - ST10448822
 * Institution: VARSITY COLLEGE DURBAN NORTH
 * Module: PROG6112
 *
 * CLASS PURPOSE:
 * - This is the MAIN class for Question 2.
 * - It contains the main() method, which runs the program.
 * - It asks the user for input (stadium, batsman, runs).
 * - It creates a CricketRunsScored object and prints the report.
 */
public class RunApplication {

    // ----------------------------------------------------------------------
    // CODE ATTRIBUTION (MAIN METHOD STRUCTURE)
    // TITLE: Java Main Methods
    // AUTHOR: Oracle
    // DATE: Accessed 29 Sept. 2025
    // AVAILABLE: https://docs.oracle.com/javase/tutorial/getStarted/application/index.html
    // ----------------------------------------------------------------------

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ------------------------------------------------------------------
        // CODE ATTRIBUTION (SCANNER INPUT)
        // TITLE: Java Scanner Class Tutorial
        // AUTHOR: W3Schools
        // DATE: Accessed 29 Sept. 2025
        // AVAILABLE: https://www.w3schools.com/java/java_user_input.asp
        // ------------------------------------------------------------------

        // Ask the user for the stadium name
        System.out.print("Enter the stadium name: ");
        String stadiumInput = scanner.nextLine();

        // Ask the user for the batsman name
        System.out.print("Enter the batsman name: ");
        String batsmanInput = scanner.nextLine();

        // Ask the user for the number of runs scored
        System.out.print("Enter the runs scored: ");
        int runsInput = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        // ------------------------------------------------------------------
        // CODE ATTRIBUTION (OBJECT CREATION FROM CHILD CLASS)
        // TITLE: Java OOP - Creating Objects
        // AUTHOR: W3Schools
        // DATE: Accessed 29 Sept. 2025
        // AVAILABLE: https://www.w3schools.com/java/java_classes.asp
        // ------------------------------------------------------------------

        // Create an object of CricketRunsScored using the values from user input
        CricketRunsScored cricketReport = new CricketRunsScored(stadiumInput, batsmanInput, runsInput);

        // ------------------------------------------------------------------
        // CODE ATTRIBUTION (CALLING METHODS ON OBJECTS)
        // TITLE: Methods in Java
        // AUTHOR: Oracle
        // DATE: Accessed 29 Sept. 2025
        // AVAILABLE: https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
        // ------------------------------------------------------------------

        // Print out the cricket report using the object
        System.out.println();
        System.out.println("CRICKET RUNS REPORT");
        System.out.println("-------------------------");
        cricketReport.printRunsReport();
        System.out.println("-------------------------");
    }
}
