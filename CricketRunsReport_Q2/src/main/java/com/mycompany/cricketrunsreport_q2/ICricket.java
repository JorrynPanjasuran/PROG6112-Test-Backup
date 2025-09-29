package com.mycompany.cricketrunsreport_q2;

/**
 * INTERFACE for Cricket application.
 * - Acts like IRoadAccidents in the past paper.
 * - Declares methods only (no body).
 * - Abstract class (Cricket) and child class (CricketRunsScored) must implement these.
 */
public interface ICricket 
{
    String getStadium();
    String getBatsman();
    int getRuns();
}


