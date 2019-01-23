package be.rbe.learning.euler;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestPalindromeProduct {

//    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//    Find the largest palindrome made from the product of two 3-digit numbers.

    public static final int UPPER_BOUND_DIGITS = 999;


    public static void main(String[] args) {

        ArrayList<Integer> numbers_digits = new ArrayList<>(Arrays.asList(99, 999, 999));
        for (int digits : numbers_digits) {
            System.out.println("Finding out the biggest palindrome for " + digits + " : " + findBiggerPalindrome(digits));
        }
    }

    public static Boolean isPalindrome(int value) {
        String reversedString = new StringBuilder(String.valueOf(value)).reverse().toString();
        if (String.valueOf(value).equals(reversedString)) {
            return true;
        } else {
            return false;
        }

    }

    public static int findBiggerPalindrome(int upper_bound_digits) {
        for (int left_int = upper_bound_digits; left_int > 0; --left_int) {
            for (int right_int = upper_bound_digits; right_int > 0; --right_int) {
                if (isPalindrome(left_int * right_int)) {
                    return left_int * right_int;
                }
            }
        }
        return 0;
    }
}
