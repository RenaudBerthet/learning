package be.rbe.learning.euler;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Multiplesof3and5 {
    //    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//    Find the sum of all the multiples of 3 or 5 below 1000.
    public static Integer sumMultiplesof3and5(Integer upperBound) {
        return IntStream.range(1, upperBound).filter(isMultipleof3And5()).sum();
    }

    public static IntPredicate isMultipleof3And5() {
        return (p) -> (p % 3 == 0 || p % 5 == 0);
    }
}
