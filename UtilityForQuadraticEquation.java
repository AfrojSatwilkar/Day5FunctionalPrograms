package com.company1.Day5FunctionalPrograms;


public class UtilityForQuadraticEquation {


    //calculating root for the equation
    public void quadraticRoots(Double a,Double b,Double c) {

        double delta=(b*b)-(4*a*c);
        System.out.println(delta);
        if(delta>0) {
            delta=Math.sqrt(delta);
            System.out.println("Root +X1 is :"+((-b+delta))/(2*a));
            System.out.print("Root -X2 is :"+((-b-delta))/(2*a));
        }else {
            System.out.print("imaginary roots");
        }


    }
}
