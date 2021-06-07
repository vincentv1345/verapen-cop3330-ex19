package org.example;

public class CalcBMI extends getWeightandHeight{
    public double bmi(double weight, double height){
        return Math.round(((weight / (height*height)) * 703)*100.0)/100.0;
    }
    public void checkBMI(double BMI){
        if(BMI > 18.5 && BMI<25){
            System.out.println("Your BMI is " + BMI + "\n" + "You are within the ideal weight range");
        }
        else
            System.out.println("Your BMI is " + BMI + "\n" + "You are overweight. You should see your doctor.");
    }
}
