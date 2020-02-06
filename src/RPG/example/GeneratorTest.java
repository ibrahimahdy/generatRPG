package RPG.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for Generator
 */
public class GeneratorTest {

    private Generator gen;
    private int size;
    private int lower;
    private int upper;

    @Before
    public void setUp(){
        gen = new Generator();
        size =4;
        lower =1;
        upper =6;
    }

    @Test
    public void genRandomSize() {
        List<Integer> generatedRandom = gen.genRandom(size,lower,upper);
        assertEquals("List size", size, generatedRandom.size());
    }

    @Test
    public void genRandomSizeNegative() {
        List<Integer> generatedRandom = gen.genRandom(0,lower,upper);
        assertEquals("List is empty", 0, generatedRandom.size());
    }


    @Test
    public void genRandomSizeValues() {
        List<Integer> generatedRandom = gen.genRandom(size,lower,upper);
        for (int element: generatedRandom) {
            assertTrue("Generated random value", (element>=lower&&element<=upper));
        }
    }

    @Test
    public void genRandomSizeValuesNegative() {
        List<Integer> generatedRandom = gen.genRandom(size,upper,lower);
        assertEquals("Upper is smaller than lower bound!", 0, generatedRandom.size());
    }

    @Test
    public void largestNSum() {
        List<Integer> generatedRandom = new ArrayList<Integer>();
        generatedRandom.add(5);
        generatedRandom.add(1);
        generatedRandom.add(2);
        generatedRandom.add(4);
        generatedRandom.add(6);

        assertEquals("Sum of largest 3 numbers", 15, gen.largestNSum(generatedRandom,3));
    }


    @Test
    public void largestNSumNIndexError() {
        List<Integer> generatedRandom = new ArrayList<Integer>();
        generatedRandom.add(5);
        generatedRandom.add(1);
        generatedRandom.add(2);
        generatedRandom.add(4);
        generatedRandom.add(6);

        assertEquals("Count of numbers to sum is largest than list size", 0, gen.largestNSum(generatedRandom,55));
    }

    @Test
    public void generateRPG() {
        int[] RPGValues = gen.generateRPG();
        assertTrue("Generated RPG array", (Arrays.stream(RPGValues).sum() >=75 && (Arrays.stream(RPGValues).filter(x -> x >= 15).toArray()).length >=2));
    }

}