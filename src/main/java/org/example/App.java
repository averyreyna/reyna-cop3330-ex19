/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        // these two inputs ask the user for their weight and height
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight ");
        double inputWeight = Double.parseDouble(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your height ");
        double inputHeight = Double.parseDouble(input2.nextLine());

        // math for bmi calculations
        double bmi = ((inputWeight / (inputHeight * inputHeight)) * 703);

        System.out.println(String.format("Your BMI is %.1f.", bmi));

        // these if statements determine whether or not you are over or under weight
        if (bmi < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }

        else if (bmi >= 18.5 && bmi <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else if (bmi > 25)
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
