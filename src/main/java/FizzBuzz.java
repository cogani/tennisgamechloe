/**
 * Created by nico on 23/02/17.
 */
public class FizzBuzz {
    public String calculate(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
