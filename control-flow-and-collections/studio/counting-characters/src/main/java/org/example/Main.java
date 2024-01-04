package org.example;
//package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String sampleText = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. So if you move " +
                "all the terms over to one side, you can put the quadratics into a form " +
                "that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] sampleChars = sampleText.toCharArray();
        HashMap<Character, Integer> characterTotal = new HashMap<>();

        for (char character: sampleChars){
            int charCount = 0;
            for (int i = 0; i < sampleChars.length; i++){
                if( sampleChars[i] == character){
                    charCount = charCount + 1;
                }
                characterTotal.put(character, charCount);
            }


        }
        System.out.println(characterTotal);
    }

}