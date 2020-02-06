package RPG.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Unit test for NaiveGenerator
 */
public class NaiveGeneratorTest {

    private NaiveGenerator naiveGen;

    @Before
    public void setUp(){
        naiveGen = new NaiveGenerator();

    }

    @Test
    public void genAttribute() {
        int generated = naiveGen.genAttribute();
        assertTrue("Generated random value", (generated>=3 && generated<=18));
    }


    @Test
    public void generateRPG() {
        int[] RPGValues = naiveGen.generateRPG();
        assertTrue("Generated RGP Array", (Arrays.stream(RPGValues).sum() >=75 && (Arrays.stream(RPGValues).filter(x -> x >= 15).toArray()).length >=2));

    }
}