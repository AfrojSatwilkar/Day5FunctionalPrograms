package com.company1.Day5FunctionalPrograms;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        //initializing variables
        double a;
        double b;
        double c;

        System.out.println("give the input for equation ax2+bx+c -");
        //getting input from user
        Scanner userInput = new Scanner(System.in);
        a=userInput.nextDouble();
        b=userInput.nextDouble();
        c=userInput.nextDouble();

        //calculating roots
        UtilityForQuadraticEquation QE = new UtilityForQuadraticEquation();
        QE.quadraticRoots(a, b, c);

    }
}
