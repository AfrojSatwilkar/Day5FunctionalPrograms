package com.company1.Day5FunctionalPrograms;

import java.util.Scanner;

public class Array2D {
    //creating global variable
    static int[][]  array2D=new int[20][20];
    static int getRows;
    static int getColumn;

    public static void getElement() {
        //storing elements into array
        for (int i=0;i<getRows;i++) {
            for(int j=0;j<getColumn;j++) {
                array2D[i][j]=scanInput.nextInt();
            }
        }
    }

    public static void printElement() {
        //printing elements
        System.out.println("----------------------------------------------");
        System.out.println("Printing Array elements ");
        for (int i=0;i<getRows;i++) {
            for(int j=0;j<getColumn;j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("----------------------------------------------");

    }

    static Scanner scanInput = new Scanner(System.in);
    public static void main(String[] args) {

        //getting number of column
        System.out.print("Number of column : ");
        getColumn=scanInput.nextInt();

        //getting number of rows
        System.out.print("Number of rows : ");
        getRows=scanInput.nextInt();

        System.out.println("Enter number : ");
        //calling function for storing and printing array
        getElement();
        printElement();

    }
}
