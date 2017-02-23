

// import static org.junit.Assert.*;

import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.assertEquals;

/**
 * Created by nico on 23/02/17.
 */
public class FizzBuzzTest {

    @Test
    public void whenWeReceive2_ThenWeAreGonnaReturnTheSameNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int suppliedNumber = 2;

        String result = fizzBuzz.calculate(suppliedNumber);

        assertEquals(Integer.toString(suppliedNumber), result);
    }

    @Test
    public void whenWeReceive4_ThenWeAreGonnaReturnTheSameNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int suppliedNumber = 4;

        String result = fizzBuzz.calculate(suppliedNumber);

        assertEquals(Integer.toString(suppliedNumber), result);
    }

    @Test
    public void whenWeReceive3_ThenWeAreGonnaReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int suppliedNumber = 3;

        String result = fizzBuzz.calculate(suppliedNumber);

        assertEquals("Fizz", result);
    }

    @Test
    public void whenWeReceive6_ThenWeAreGonnaReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int suppliedNumber = 6;

        String result = fizzBuzz.calculate(suppliedNumber);

        assertEquals("Fizz", result);
    }

    @Test
    public void whenWeReceive9_ThenWeAreGonnaReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int suppliedNumber = 9;

        String result = fizzBuzz.calculate(suppliedNumber);

        assertEquals("Fizz", result);
    }

}