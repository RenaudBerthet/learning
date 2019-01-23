package be.rbe.learning.codewars;

import be.rbe.learning.codewars.Banjo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AreYouPlayingBanjoTest {
    public static final String PLAYING_BANJO_MESSAGE = " plays banjo";
    public static final String NOT_PLAYING_BANJO_MESSAGE = " does not play banjo";

    @DisplayName("Banjos:")
    @ParameterizedTest()
    @ValueSource(strings = {"RHello", "rJUnit"})
    void areyouplayingbanjo_with_string_beginning_with_valid_char_should_return_play_banjo(String word) {
        String actualResult = Banjo.isPlayingBanjo(word);
        String expectedResult = word + PLAYING_BANJO_MESSAGE;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @DisplayName("Not Banjos:")
    @ParameterizedTest
    @ValueSource(strings = {"", "Hello", "JUnit"})
    void areyouplayingbanjo_with_string_not_beginning_with_valid_char_should_return_does_not_play_banjo(String word) {
        String actualResult = Banjo.isPlayingBanjo(word);
        String expectedResult = word + NOT_PLAYING_BANJO_MESSAGE;
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
