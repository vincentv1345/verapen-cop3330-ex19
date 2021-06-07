package org.example;
import java.util.Scanner;
public class getWeightandHeight {
    Scanner n = new Scanner(System.in);
    public int getWeight()
    {
        System.out.print("How much is your weight in pounds? ");
        int weight = n.nextInt();
        return weight;
    }
    public int getHeight(){
        System.out.print("How much is your height in inches? ");
        int height = n.nextInt();
        return height;
    }
}
