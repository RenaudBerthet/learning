package be.rbe.learning.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static be.rbe.learning.euler.Multiplesof3and5.sumMultiplesof3and5;

class Multiplesof3and5Test {

    @Test
    void test_10() {
        // given
        Integer givenvalueToTest = 10;
        Integer expectedResult = 23;
        // then
        Integer actualResult = sumMultiplesof3and5(givenvalueToTest);
        // when
        Assertions.assertEquals(expectedResult, actualResult);
    }   @Test
    void test_1000() {
        // given
        Integer givenvalueToTest = 1000;
        Integer expectedResult = 233168;
        // then
        Integer actualResult = sumMultiplesof3and5(givenvalueToTest);
        // when
        Assertions.assertEquals(expectedResult, actualResult);
    }

}