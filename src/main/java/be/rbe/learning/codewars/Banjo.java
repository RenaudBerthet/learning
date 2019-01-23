package be.rbe.learning.codewars;

import java.util.Objects;

public class Banjo {


    public static final String PLAYING_BANJO_MESSAGE = " plays banjo";
    public static final String NOT_PLAYING_BANJO_MESSAGE = " does not play banjo";

    public static String isPlayingBanjo(String word) {
        Objects.requireNonNull(word, "isPlayingBanjo does not accept <null> as parameter");

        if (isBanjoWord(word)) {
            return word + PLAYING_BANJO_MESSAGE;
        } else {
            return word + NOT_PLAYING_BANJO_MESSAGE;
        }
    }

    private static boolean isBanjoWord(String word) {
        return word.startsWith("r") || word.startsWith("R");
    }

}
