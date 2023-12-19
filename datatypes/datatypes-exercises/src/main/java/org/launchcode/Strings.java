package org.launchcode;
import java.util.Scanner;
public class Strings {
    public static void main (String [] args){

        //while(0 == 0){
            Scanner input = new Scanner(System.in);
            String aliceText = "Alice was beginning to get very tired of sitting by her sister on " +
                    "the bank, and of having nothing to do: once or twice she had peeped into " +
                    "the book her sister was reading, but it had no pictures or conversations in" +
                    " it, ‘and what is the use of a book,’ thought Alice ‘without pictures or " +
                    "conversation?’";
            System.out.println("You are checking to see if Alice and Wonderland contains a substring.");
            System.out.println("Input string to check: ");
            String aliceContains = input.nextLine();
            if (aliceText.toLowerCase().contains(aliceContains.toLowerCase())){
                Integer aliceIndex = aliceText.indexOf(aliceContains);
                System.out.println("String at index " + aliceIndex + " removed!");
                System.out.println(aliceText.substring(0, aliceIndex).concat(aliceText.substring( aliceIndex + aliceContains.length(), aliceText.length())));
                //System.out.println(aliceText);
                //System.out.println(aliceText.substring(aliceIndex, aliceIndex + aliceContains.length()));
            }
            else{
                System.out.println("String Not Found.");
            }
        //}


    }
}
