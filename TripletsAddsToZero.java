package com.company1.Day5FunctionalPrograms;

import java.util.Scanner;

public class TripletsAddsToZero {
    static int getUser;

    public static void main(String[] args) {

        //getting user input for array range
        Scanner userInput = new Scanner(System.in);
        System.out.print("Array range : ");
        getUser= userInput.nextInt();

        //Object
        UtilityForTriplet UFT = new UtilityForTriplet();

        //storing elements to array
        UFT.getElementForArray(getUser);

        //printing elements from array
        System.out.println("user inputs are : ");
        UFT.printElementForArray(getUser);

        System.out.println("----------------------------------");
        System.out.println("triplets are : ");

        //checking for triplet condition
        UFT.checkForTriplet(getUser);
        System.out.println("----------------------------------");


    }
}
