package RPG.example;

import java.util.Random;

/**
 * NaiveGenerator is a class used to as RPG Attributes Generator for the task proposed at: https://rosettacode.org/wiki/RPG_Attributes_Generator
 * This solutions is considered as naive one, on the basis of the solution presented at: https://rosettacode.org/wiki/RPG_Attributes_Generator#Java
 */
public class NaiveGenerator {

    /**
     * @return sum of generated 4 random values subtracting the smallest generated value of the generated 4.
     */
    int genAttribute(){
        Random dice = new Random();
        int smallest =Integer.MAX_VALUE;
        int myValue;
        int total =0;
        for(int i=0; i<=3; i++){
            myValue = dice.nextInt(6)+1;
            if(myValue<smallest){
                smallest = myValue;
            }
            total+=myValue;
        }

        return (total-smallest);
    }


    /**
     * @return array including 6 generated values as RPG Attributes
     */
    int[] generateRPG(){

        int[] RPGValues = new int[6];
        int arraySum=0;
        int fifteenCount = 0;

        while(fifteenCount < 2 || arraySum <75){
            RPGValues= new int[6];
            arraySum=0;
            fifteenCount = 0;

            for (int i = 0; i < 6; i++){
                RPGValues[i] = genAttribute();
                arraySum += RPGValues[i];
                if (RPGValues[i] >= 15){
                    fifteenCount++;
                }
            }
        }

        return RPGValues;
    }

}
