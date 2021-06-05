/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

import java.text.DecimalFormat;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Scanner declaration

        //These are the variables that we are going to be using
        int length;
        int width;

        System.out.print("What is the lenght of the room in feet? ");
        length = in.nextInt(); //Here we are inputting the lenght

        System.out.print("What is the width of the room in feet? ");
        width = in.nextInt(); //Here we are inputting the width

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");

        int area = length * width;
        double convert = area * 0.09290304; //Here we are converting the area of feet square in meters square.

        System.out.println(area + " square feet"); //Here we are printing the square feet.
        System.out.printf("%.3f square meters",convert); //Here we are printing with %.3f so the double can be rounded three figures after the point.



    }
}
