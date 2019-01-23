package be.rbe.learning.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestMultipleTest {

    @Test
    void findSmallestMultiple() {
        // given
        int given_max = 10;
        int expectedResult = 2520;
        // when
        int actualResult = SmallestMultiple.findSmallestMultiple(10);
        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divideByAll() {
//        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        // given
        int given_max = 10;
        int givenValue = 2520;
        // when
        boolean actualResult = SmallestMultiple.dividedByAll(givenValue, given_max);
        // then
        Assertions.assertEquals(true, actualResult);

    }
}