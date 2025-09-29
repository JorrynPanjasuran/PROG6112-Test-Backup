/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * PACKAGE: This places the class in the correct project folder.
 */
package com.mycompany.cricketrunsreport_q2;

/**
 * Author: Jorryn Panjasuran - ST10448822
 * Institution: VARSITY COLLEGE DURBAN NORTH
 * Module: PROG6112
 *
 * CLASS PURPOSE:
 * - This is the CHILD CLASS (subclass) that EXTENDS the abstract Cricket class.
 * - It inherits variables and methods (stadium, batsman, runs, getters).
 * - It adds a method (printRunsReport) to output the report in a neat format.
 */
public class CricketRunsScored extends Cricket {

    // ----------------------------------------------------------------------
    // CODE ATTRIBUTION (EXTENDING AN ABSTRACT CLASS)
    // TITLE: Java Abstract Classes
    // AUTHOR: W3Schools
    // DATE: Accessed 29 Sept. 2025
    // AVAILABLE: https://www.w3schools.com/java/java_abstract.asp
    // ----------------------------------------------------------------------

    // Constructor: passes values (stadium, batsman, runs) up to the parent class
    public CricketRunsScored(String stadium, String batsman, int runs) {
        super(stadium, batsman, runs); // "super" calls the parent class constructor
    }

    // ----------------------------------------------------------------------
    // CODE ATTRIBUTION (PRINTING OUTPUT TO CONSOLE)
    // TITLE: Java System.out.println() Tutorial
    // AUTHOR: Oracle
    // DATE: Accessed 29 Sept. 2025
    // AVAILABLE: https://docs.oracle.com/javase/tutorial/getStarted/application/index.html
    // ----------------------------------------------------------------------

    // Method prints out the cricket report
    public void printRunsReport() {
        System.out.println("Stadium: " + getStadium());   // inherited from parent
        System.out.println("Batsman: " + getBatsman());   // inherited from parent
        System.out.println("Runs Scored: " + getRuns());  // inherited from parent
    }
}
