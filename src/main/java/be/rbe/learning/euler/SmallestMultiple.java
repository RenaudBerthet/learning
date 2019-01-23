package be.rbe.learning.euler;

public class SmallestMultiple {
//    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    public static int findSmallestMultiple(int biggerDivider) {
        int counter = 1;
        while (!dividedByAll(counter, biggerDivider)) {
            counter += 1;
        }
        return counter;
    }

    public static boolean dividedByAll(int value, int upperdivider) {
        for (int i = 1; i <= upperdivider; i++) {
            if (value % i != 0) {
                return false;
            }
        }
        return true;
    }

}
