package com.programming.dev.math_functions.util;

/**
 * Description.
 * @author Your Name
 */
public class UtilityClass {

    public static String intToBinary(final int binary, final int digits) {

        final String temp = Integer.toBinaryString(binary);
        final int foundDigits = temp.length();
        String returner = temp;
        for (int i = foundDigits; i < digits; i++) {
            returner = "0" + returner;
        }

        return returner;
    }

}
