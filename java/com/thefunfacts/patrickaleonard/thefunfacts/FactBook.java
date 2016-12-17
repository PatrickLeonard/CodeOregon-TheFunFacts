package com.thefunfacts.patrickaleonard.thefunfacts;

import java.security.SecureRandom;

/**
 * Created by Patrick A Leonard on 7/21/2015.
 */
public class FactBook {

    //Member variables (properties about the object)
    //Create array of facts
    static String[] nFactArray = {"Ants stretch when they wake up in the morning.",
            "Ostriches can fun faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 286.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habbit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."};
    static private SecureRandom nSecureRandom = new SecureRandom();
    static private int lastInt = -2;
    //Methods (abilities; tings the object can do
    static String getFact() {
        //Button was clicked, so update the data for new fact.
        String newFact = "";
        int randomInt = -1;
        //Get a random integer based on the size of the factArray without repeating the last number
        do {
            randomInt = nSecureRandom.nextInt(nFactArray.length);
        }while(randomInt == lastInt);

        newFact = nFactArray[randomInt];
        lastInt = randomInt;
        return newFact;
    }
}
