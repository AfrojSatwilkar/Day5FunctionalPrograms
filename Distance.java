package com.company1.Day5FunctionalPrograms;

import java.util.Scanner;

public class Distance {
    public static void euclideanDistance(int pointX1,int pointX2,int pointY1,int pointY2) {
        //calculating Euclidean distance
        System.out.print("Euclidean distance is : "+
                Math.sqrt(Math.pow(pointX2-pointX1, 2) + Math.pow(pointY2-pointY1,2)));
    }
    public static void main(String[] args) {
        Scanner userInput =new Scanner(System.in);
        //getting input for point X1
        System.out.println("point x1");
        int pointX1=userInput.nextInt();

        //getting input for point X2
        System.out.println("point x2");
        int pointX2=userInput.nextInt();

        //getting input for point y1
        System.out.println("point y1");
        int pointY1=userInput.nextInt();

        //getting input for point y2
        System.out.println("point y2");
        int pointY2=userInput.nextInt();

        //Calling Function for calculate distance
        euclideanDistance(pointX1, pointX2, pointY1, pointY2);
    }
}
