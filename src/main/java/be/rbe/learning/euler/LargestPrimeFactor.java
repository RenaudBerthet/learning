package be.rbe.learning.euler;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

//    The prime factors of 13195 are 5, 7, 13 and 29.
//
//    What is the largest prime factor of the number 600851475143 ?

    public static List<Integer> findPrimeFactors(int value) {

        int half_value = value / 2;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 2; i < half_value; ++i) {
            if (isPrime(i) && value % i == 0) {
                numbers.add(i);
            }
            if (multiply(numbers) >= value)
                break;
        }

        return numbers;

    }

    static int multiply(List<Integer> list) {
        Integer[] arr = list.toArray(new Integer[list.size()]);
        int pro = 1;
        for (int i = 0; i < arr.length; i++)
            pro = pro * arr[i];
        return pro;
    }


    public static boolean isPrime(int value) {
        boolean flag = false;
        for (int i = 2; i <= value / 2; ++i) {
            if (value % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
