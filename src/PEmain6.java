/**
 * Created by MichaelApposing on 14/12/2016.
 */
public class PEmain6 {

    public static void main(String[] args) {
        //Problem 6
//        The sum of the squares of the first ten natural numbers is,
//        12 + 22 + ... + 102 = 385
//        The square of the sum of the first ten natural numbers is,
//        (1 + 2 + ... + 10)2 = 552 = 3025
//        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

        Util.printOut("Sum of Squares", getSumOfSquares());
        Util.printOut("Square of Sum", getSquareOfSum());
        Util.printOut("Difference", getSquareOfSum() - getSumOfSquares());


    }

    private static int getSumOfSquares() {

        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += square(i);
        }


        return sum;
    }

    private static int getSquareOfSum() {

        int sum = 0;

        for (int i = 1; i < 101; i++) {
            sum += i;
        }

        return square(sum);
    }

    private static int square(int i) {
        return i * i;
    }

}
