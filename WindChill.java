package com.company1.Day5FunctionalPrograms;

public class WindChill {
    public static void main(String args[]){

        //getting input from command line
        double temp = Double.parseDouble(args[0]);
        double speed = Double.parseDouble(args[1]);

        System.out.println("Temperature is :- " + temp);
        System.out.println("Wind speed is :- " + speed);

        if(temp<50 && (speed<120 && speed>3))
        {
            //formula for calculating wind
            double w = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(speed, 0.16);
            System.out.println("Wind chill :- " + w);
        }else{
            System.out.println("Invalid inputs");
        }

    }
}
