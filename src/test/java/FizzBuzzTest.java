

// import static org.junit.Assert.*;

import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.assertEquals;

/**
 * Created by nico on 23/02/17.
 */
public class FizzBuzzTest {

    @Test
    public void givenANormalNumber_whenCalculateIsInvoked_ThenTheSameNumberIsReturned() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int suppliedNumber = 2;

        String result = fizzBuzz.calculate(suppliedNumber);

        assertEquals(Integer.toString(suppliedNumber), result);
    }

    @Test
    public void givenNumberDivisibleBy3_whenCalculateIsInvoked_ThenFizzIsReturned() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int suppliedNumber = 3;

        String result = fizzBuzz.calculate(suppliedNumber);

        assertEquals("Fizz", result);
    }

    @Test
    public void givenNumberDivisibleBy5_whenCalculateIsInvoked_ThenFizzIsReturned() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int suppliedNumber = 5;

        String result = fizzBuzz.calculate(suppliedNumber);

        assertEquals("Buzz", result);
    }

    @Test
    public void givenNumberDivisibleBy3And5_whenCalculateIsInvoked_ThenFizzBuzzIsReturned() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int suppliedNumber = 15;

        String result = fizzBuzz.calculate(suppliedNumber);

        assertEquals("FizzBuzz", result);
    }

}