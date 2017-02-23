

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

}