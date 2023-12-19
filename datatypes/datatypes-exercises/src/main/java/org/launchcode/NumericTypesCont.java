package org.launchcode;
import java.util.Scanner;
public class NumericTypesCont {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double distance = input.nextDouble();
        System.out.println("and how many gallons did you expend?");
        Double gallons = input.nextDouble();

        System.out.println("Your average miles per gallon is " + (distance / gallons));

    }
}
