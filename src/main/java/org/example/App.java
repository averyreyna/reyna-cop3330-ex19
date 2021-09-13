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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight ");
        double inputWeight = Double.parseDouble(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your height ");
        double inputHeight = Double.parseDouble(input2.nextLine());

        double bmi = ((inputWeight / (inputHeight * inputHeight)) * 703);

        System.out.println(String.format("Your BMI is %.1f.", bmi));

        if (bmi >= 18.5 && bmi <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
