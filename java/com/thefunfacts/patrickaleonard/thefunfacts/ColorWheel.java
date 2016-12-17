package com.thefunfacts.patrickaleonard.thefunfacts;

import android.graphics.Color;

import java.security.SecureRandom;

/**
 * Created by Patrick A Leonard on 7/21/2015.
 */
public class ColorWheel {

    //Member variables (properties about the object)
    //Create array of facts
    static public String[] nColors = {"#39add1","#3079ab","#c25975",
            "#e15258","#f9845b","#838cc7","#7d569e","#53bbb4",
            "#51b46d","#e0ab18","#637a91","#f092b0","#b7c0c7"};
    static private SecureRandom nSecureRandom = new SecureRandom();
    static private int lastInt = -1;
    //Methods (abilities; tings the object can do
    static public int getColor() {
        //Button was clicked, so update the data for new fact.
        String newColor = "";
        int randomInt = 0;
        //Get a random integer based on the size of the factArray without repeating the last number
        do {
            randomInt = nSecureRandom.nextInt(nColors.length);
        }while(randomInt == lastInt);

        newColor = nColors[randomInt];
        lastInt = randomInt;
        int colorAsInt = Color.parseColor(newColor);
        return colorAsInt;
    }
}
