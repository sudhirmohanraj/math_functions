package com.programming.dev.math_functions.hackerrank.string;

import java.util.Arrays;

/**
 * Created by wyh669 on 1/30/17.
 */
public class IsAnagram {

    static boolean isAnagram(String a, String b) {
        a.startsWith("[");
        // Complete the function by writing your code here.
        char[] aCh = a.toLowerCase().toCharArray();
        char[] bCh = b.toLowerCase().toCharArray();
        Arrays.sort(aCh);
        Arrays.sort(bCh);
        if(String.valueOf(aCh).equals(String.valueOf(bCh))) {
            return true;
        }
        else {
            return false;
        }
    }

   public static void main(String[] args) {
        isAnagram("hello","Hello");
    }
}
