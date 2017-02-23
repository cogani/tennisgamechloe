

// import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import sun.awt.geom.AreaOp;

import static org.junit.Assert.assertEquals;

/**
 * Created by nico on 23/02/17.
 */
public class FizzBuzzTest {
    private int suppliedNumber;

    @Test
    public void givenANormalNumber_whenCalculateIsInvoked_ThenTheSameNumberIsReturned() {
        suppliedNumber = 2;

        String result = FizzBuzz.calculate(suppliedNumber);

        assertEquals(Integer.toString(suppliedNumber), result);
    }

    @Test
    public void givenNumberDivisibleBy3_whenCalculateIsInvoked_ThenFizzIsReturned() {
        suppliedNumber = 3;

        String result = FizzBuzz.calculate(suppliedNumber);

        assertEquals("Fizz", result);
    }

    @Test
    public void givenNumberDivisibleBy5_whenCalculateIsInvoked_ThenFizzIsReturned() {
        suppliedNumber = 5;

        String result = FizzBuzz.calculate(suppliedNumber);

        assertEquals("Buzz", result);
    }

    @Test
    public void givenNumberDivisibleBy3And5_whenCalculateIsInvoked_ThenFizzBuzzIsReturned() {
        suppliedNumber = 15;

        String result = FizzBuzz.calculate(suppliedNumber);

        assertEquals("FizzBuzz", result);
    }

}