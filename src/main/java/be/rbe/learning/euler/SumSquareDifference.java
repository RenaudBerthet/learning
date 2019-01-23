package be.rbe.learning.euler;

public class SumSquareDifference {
    //    The sum of the squares of the first ten natural numbers is,
    //
    //1^2 + 2^2 + ... + 10^2 = 385
    //    The square of the sum of the first ten natural numbers is,
    //
    //(1 + 2 + ... + 10)^2 = 55^2 = 3025
    //    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    //
    //    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

    public static long findDifference(int value) {
        return (squaresOfSum(value) - sumOfSquares(value));
    }

    public static long sumOfSquares(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static long squaresOfSum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }
}
