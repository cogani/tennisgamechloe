/**
 * Created by nico on 23/02/17.
 */
public class FizzBuzz {

    public static String calculate(int number) {
        String result = Integer.toString(number);

        if (number % 15 == 0) result = "FizzBuzz";
        else if (number % 3 == 0) result = "Fizz";
        else if (number % 5 == 0) result = "Buzz";

        return result;
    }
}
