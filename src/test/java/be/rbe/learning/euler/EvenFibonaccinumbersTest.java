package be.rbe.learning.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class EvenFibonaccinumbersTest {

    @ParameterizedTest
    @MethodSource("dataFeader")
    void computeFibonacci(int value, int expectedResult) {
        Assertions.assertEquals(expectedResult, EvenFibonaccinumbers.computeFibonacci(value));
    }

    private static Stream<Arguments> dataFeader() {
        return Stream.of(
                Arguments.of("0", "0"),
                Arguments.of("1", "1"),
                Arguments.of("2", "1"),
                Arguments.of("3", "2"),
                Arguments.of("4", "3"),
                Arguments.of("5", "5"),
                Arguments.of("6", "8"),
                Arguments.of("7", "13"),
                Arguments.of("8", "21"),
                Arguments.of("9", "34"),
                Arguments.of("10", "55")
        );
    }
}