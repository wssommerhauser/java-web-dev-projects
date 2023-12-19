package org.launchcode;

import java.util.Scanner;
public class NumericTypes {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length for a rectangle: ");
        int length = input.nextInt();
        System.out.println("Input the width for a rectangle: ");
        int width = input.nextInt();
        System.out.println("The area of this rectangle would be " + (width * length) + " square units.");
    }
}
