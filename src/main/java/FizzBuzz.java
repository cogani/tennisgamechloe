/**
 * Created by nico on 23/02/17.
 */
public class FizzBuzz {

    public static String calculate(int number) {
        String result = "";

        if (number % 3 == 0) {
            result = "Fizz";
        }

        if (number % 5 == 0) {
            result = result + "Buzz";
        }

        if (result.length() == 0) {
            result = Integer.toString(number);
        }

        return result;
    }
}
