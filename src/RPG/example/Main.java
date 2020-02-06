package RPG.example;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Generator gen = new Generator();
        NaiveGenerator naiveGen = new NaiveGenerator();

        System.out.println("Values using Generator: " + Arrays.toString(gen.generateRPG()));
        System.out.println("Values using Naive Generator: " + Arrays.toString(naiveGen.generateRPG()));
    }
}
