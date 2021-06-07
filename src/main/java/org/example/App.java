package org.example;

/**
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Vincent Verapen
 */
public class App 
{
    public static void main( String[] args )
    {
        CalcBMI b = new CalcBMI();
        int weight = b.getWeight();
        int height = b.getHeight();
        double bmi = b.bmi(weight, height);
        b.checkBMI(bmi);
    }
}
