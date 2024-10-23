/*
 * Program: TestSizeComparison.java
 * Student: Lydia Frame 
 * Purpose: Find the size difference in circumference among the planets relative to the Sun,
 * Using Big Decimal, and wrapped classes.
*/

import java.math.BigDecimal;
import java.util.Scanner; // Import the Scanner class

public class TestSizeComparison {

    public static void main(String[] args) {

        // Create individual planet objects with their respective circumferences
        Planet mercury = new Planet("Mercury", new BigDecimal("15329"));
        Planet venus = new Planet("Venus", new BigDecimal("38025"));
        Planet earth = new Planet("Earth", new BigDecimal("40075"));
        Planet mars = new Planet("Mars", new BigDecimal("21344"));
        Planet jupiter = new Planet("Jupiter", new BigDecimal("439264"));
        Planet saturn = new Planet("Saturn", new BigDecimal("378675"));
        Planet uranus = new Planet("Uranus", new BigDecimal("159354"));
        Planet neptune = new Planet("Neptune", new BigDecimal("154705"));

        // Print circumference differences for each planet
        printCircumferenceDifference(mercury);
        printCircumferenceDifference(venus);
        printCircumferenceDifference(earth);
        printCircumferenceDifference(mars);
        printCircumferenceDifference(jupiter);
        printCircumferenceDifference(saturn);
        printCircumferenceDifference(uranus);
        printCircumferenceDifference(neptune);
    }

    // Method to print the circumference difference
    private static void printCircumferenceDifference(Planet planet) {
        BigDecimal difference = planet.calculateSizeDifference();
        System.out.println(planet.getName() + ": Circumference difference compared to the Sun = " + difference + "(Km)");
    }

 }