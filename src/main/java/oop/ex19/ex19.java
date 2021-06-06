/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 19 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex19;
import java.util.Scanner;

public class ex19 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        double height = 0, weight = 0;

        System.out.print("Enter your height in inches: ");
        while(true){
            if(userInputScanner.hasNextDouble()){
                height = userInputScanner.nextDouble();
                break;
            }
            else{
                System.out.print("Please enter valid input.\nEnter your height in inches: ");
                userInputScanner.next();
            }
        }

        System.out.print("Enter your weight in pounds: ");
        while(true){
            if(userInputScanner.hasNextDouble()){
                weight = userInputScanner.nextDouble();
                break;
            }
            else{
                System.out.print("Please enter valid input.\nEnter your weight in pounds: ");
                userInputScanner.next();
            }
        }

        double userBMI = (weight / (height * height)) * 703;

        System.out.println("Your BMI is: " + userBMI);

        if(userBMI >= 18.5 && userBMI <= 25){
            System.out.print("You are within the ideal weight range");
        }
        else if (userBMI > 25){
            System.out.print("You are overweight. You should see your doctor.");
        }
        else{
            System.out.print("You are underweight. You should see your doctor.");
        }
    }
}
