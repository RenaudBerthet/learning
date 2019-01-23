package be.rbe.learning.codewars;

import java.util.List;
import java.util.stream.IntStream;

import static java.lang.Math.pow;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // from left to right
        return IntStream.range(0, binary.size())
                .map(i -> (int) (binary.get(i) * pow(2, (binary.size() - i - 1))))
                .sum();
    }
    public static int ConvertBinaryArrayToIntV2(List<Integer> binary) {
        // from left to right
        int len = binary.size();
        int buffer = 0;
        for (int i = len - 1; i >= 0; --i) {
            buffer += binary.get(i) * pow(2, len - i - 1);
        }
        return buffer;
    }

    public static int ConvertBinaryArrayToIntV1(List<Integer> binary) {
        // from left to right
        int len = binary.size();
        int buffer = 0;
        for (int i = 0; i < len; i++) {
            buffer += binary.get(i) * pow(2, len - i - 1);
        }
        return buffer;
    }
}
