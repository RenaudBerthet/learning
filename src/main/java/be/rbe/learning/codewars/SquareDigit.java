package be.rbe.learning.codewars;

public class SquareDigit {

    public static int squareMagicDigitV1(int value) {

        int remainder = value;
        int digitCounter = 1;
        int accumulator = 0;
        int squaredNumber;
        while (remainder > 0) {
            squaredNumber = (remainder % 10) * (remainder % 10);
            accumulator += squaredNumber * digitCounter * 10;
            if (squaredNumber >= 10) {
                digitCounter += 2;
            } else {
                digitCounter += 1;
            }
            remainder = remainder / 10;
        }
        return accumulator;
    }

    public static int squareMagicDigitV2(int value) {
        return 0;
    }

}
