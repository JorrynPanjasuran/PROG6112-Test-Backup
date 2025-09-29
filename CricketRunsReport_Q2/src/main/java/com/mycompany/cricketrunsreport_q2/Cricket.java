/*
 * PACKAGE: This places the class in the project folder structure.
 */
package com.mycompany.cricketrunsreport_q2;

/**
 * Author: Jorryn Panjasuran - ST10448822
 * Institution: VARSITY COLLEGE DURBAN NORTH
 * Module: PROG6112
 *
 * CLASS PURPOSE:
 * This is the ABSTRACT CLASS for Question 2.
 * - Implements the ICricket interface (so it must provide code for the methods).
 * - Contains VARIABLES (stadium, batsman, runs).
 * - Has a CONSTRUCTOR to initialize the variables.
 * - Provides GET METHODS to return the values.
 * - It cannot be used directly — a child class must extend it.
 */
public abstract class Cricket implements ICricket {

    // ----------------------------------------------------------------------
    // CODE ATTRIBUTION (DECLARING VARIABLES)
    // TITLE: Java Programming, 9th Edition
    // AUTHOR: Joyce Farrell
    // DATE: Accessed 29 Sept. 2025
    // AVAILABLE: Cengage Learning (Textbook reference for declaring variables)
    // ----------------------------------------------------------------------

    // Variable to store the stadium name
    String stadium;

    // Variable to store the batsman name
    String batsman;

    // Variable to store the runs scored
    int runs;

    // ----------------------------------------------------------------------
    // CODE ATTRIBUTION (CONSTRUCTOR IN ABSTRACT CLASS)
    // TITLE: Abstract Classes and Interfaces
    // AUTHOR: Oracle
    // DATE: Accessed 29 Sept. 2025
    // AVAILABLE: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
    // ----------------------------------------------------------------------

    // Constructor: initializes the stadium, batsman and runs when creating an object
    public Cricket(String stadium, String batsman, int runs) {
        this.stadium = stadium;
        this.batsman = batsman;
        this.runs = runs;
    }

    // ----------------------------------------------------------------------
    // CODE ATTRIBUTION (INTERFACE IMPLEMENTATION)
    // TITLE: Java Interfaces and Abstract Classes
    // AUTHOR: W3Schools
    // DATE: Accessed 29 Sept. 2025
    // AVAILABLE: https://www.w3schools.com/java/java_abstract.asp
    // ----------------------------------------------------------------------

    // Method returns the stadium name (from ICricket interface)
    @Override
    public String getStadium() {
        return stadium;
    }

    // Method returns the batsman name (from ICricket interface)
    @Override
    public String getBatsman() {
        return batsman;
    }

    // Method returns the runs scored (from ICricket interface)
    @Override
    public int getRuns() {
        return runs;
    }
}
