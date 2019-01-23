package be.rbe.learning.euler;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LargestPrimeFactorTest {

    @Test
    void findPrimeFactors() {
        //given
        int givenInt = 13195;
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(5, 7, 13, 29));
        //when
        List<Integer> actualResult = LargestPrimeFactor.findPrimeFactors(givenInt);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test()
    void multiply() {
        // given
        Integer[] array = {1, 2, 3};
        List<Integer> givenList = new ArrayList<>(Arrays.asList(array));
        int expectedResult = 6;
        // when
        int actualResult = LargestPrimeFactor.multiply(givenList);
        // then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @ParameterizedTest()
    @MethodSource("primeFeader")
    void test_isPrime(int value, boolean expectedResult) {
        Assertions.assertThat(expectedResult).isEqualTo(LargestPrimeFactor.isPrime(value));
    }

    private static Stream<Arguments> primeFeader() {
        return Stream.of(
                Arguments.of("2", true),
                Arguments.of("3", true),
                Arguments.of("4", false),
                Arguments.of("5", true),
                Arguments.of("6", false),
                Arguments.of("7", true)
        );
    }


}