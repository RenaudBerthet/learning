package be.rbe.learning.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumSquareDifferenceTest {

    @Test
    void findDifference() {
        int givenValue = 10;
        long expectedResult = 2640L;
        long actualResult = SumSquareDifference.findDifference(givenValue);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //1^2 + 2^2 + ... + 10^2 = 385
    //    The square of the sum of the first ten natural numbers is,
    //
    //(1 + 2 + ... + 10)^2 = 55^2 = 3025


    @Test
    void sumOfSquares() {
        int givenValue = 10;
        long expectedResult = 385L;
        long actualResult = SumSquareDifference.sumOfSquares(givenValue);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void squareOfSum() {
        int givenValue = 10;
        long expectedResult = 3025L;
        long actualResult = SumSquareDifference.squaresOfSum(givenValue);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}