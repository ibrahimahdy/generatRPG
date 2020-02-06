package RPG.example;

import java.util.*;

/**
 * Generator is a class used to as RPG Attributes Generator for the task proposed at: https://rosettacode.org/wiki/RPG_Attributes_Generator
 *
 */
class Generator {

    /**
     * @param size: indicate how many random numbers to generate
     * @param lowerBound: lower bound for the generator
     * @param upperBound: upper bound for the generator
     *                  the generated number is in the range between @param lowerBound and @param upperBound (both inclusive)
     * @return a list with the generated numbers.
     */
    List<Integer> genRandom(int size, int lowerBound, int upperBound){
        List<Integer> randomValues = new ArrayList<Integer>();
        if(upperBound - lowerBound >= 0 && size > 0) {
            Random dice = new Random();
            for(int i = 0; i < size; i++){
                randomValues.add(dice.nextInt(upperBound - lowerBound + 1)+lowerBound);
            }

        }else{
            System.out.println("Bound must be positive");
        }
        return randomValues;
    }


    /**
     * @param list: list of integer numbers
     * @param count: how many numbers from the list to sum and return their value
     * @return sum of largest @param count numbers of @param list
     */
    int largestNSum(List<Integer> list, int count) {
        int total=0;
        if(list.size() >= count && count > 0) {
            list.sort(Collections.reverseOrder());
            for(int i = 0; i < count; i++){
                total+= list.get(i);
            }
        }else{
            System.out.println("Number of summed items must be smaller than or equal to the number of items in the list");
        }
        return total;
    }


    /**
     * @return array including 6 generated values as RPG Attributes
     */
    int[] generateRPG(){
        while(true){
            int[] RPGValues = new int[6];
            for (int i = 0; i < 6; i++) {
                List<Integer> myList = genRandom(4,1,6);
                RPGValues[i] = largestNSum(myList, 3);

                if(myList.size() == 0 || RPGValues[i] == 0) {
                    System.out.println("You have an error!");
                    return RPGValues;
                }
            }

            if(Arrays.stream(RPGValues).sum() >= 75 && (Arrays.stream(RPGValues).filter(x -> x >= 15).toArray()).length >= 2){
                return RPGValues;
            }
        }
    }
}
