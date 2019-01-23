package be.rbe.learning.codewars;

import be.rbe.learning.codewars.SumStringsAsNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SumStringsAsNumbersTest {


    @ParameterizedTest
    @MethodSource("createPairsOfIntegers")
    void sumStrings(String firstInt, String secondInt, String expectedresult) {

        String actualResult = SumStringsAsNumbers.sumStrings(firstInt, secondInt);
        Assertions.assertEquals(expectedresult, actualResult);
    }

    private static Stream<Arguments> createPairsOfIntegers() {
        return Stream.of(
                Arguments.of("1", "1", "2"),
                Arguments.of("1", "2", "3"),
                Arguments.of("5", "1", "6"),
                Arguments.of("1", "9", "10"),
                Arguments.of("1", "0", "1"),
                Arguments.of("1", "5", "6"),
                Arguments.of("4", "1", "5")
        );
    }
}