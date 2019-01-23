package be.rbe.learning.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LargestPalindromeProductTest {

    @ParameterizedTest()
    @MethodSource("palindromeFeader")
    void isPalindrome(int value, boolean result) {
        Assertions.assertEquals(result, LargestPalindromeProduct.isPalindrome(value));
    }

    private static Stream<Arguments> palindromeFeader() {
        return Stream.of(
                Arguments.of("2", true),
                Arguments.of("24", false),
                Arguments.of("333", true),
                Arguments.of("404", true),
                Arguments.of("5555", true),
                Arguments.of("6689", false),
                Arguments.of("77477", true)
        );
    }

    @Test
    void findBiggerPalindrome() {
    }
}