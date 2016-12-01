/**
 * Created by MichaelApposing on 01/12/2016.
 */
public class PEmain1 {

    public static void main(String[] args) {

        //Problem 1
        // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
        // Find the sum of all the multiples of 3 or 5 below 1000.

        int total = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                total += i;
            } else if (i % 3 == 0) {
                total += i;
            } else if (i % 5 == 0) {
                total += i;
            }
        }

        Util.printOut("Problem 1", total);
    }
}
