package com.programming.dev.math_functions.impl;

/**
 * Created by wyh669 on 1/11/17.
 */
public class FindBug {

    public static void main(String[] args) {
        MakeTheNumbersMatch(-1,-5,-5,-5);
    }

    // The following program increases/decreases the value of A and B until A is equal to X and B is equal to Y. Find the bug:
    public static void MakeTheNumbersMatch(int a, int b, int x, int y)
    {
        while(a!=x && b!=y)
        {
            if(a> x)
            {
                a--;
            }
            else
            {
                a++;
            }
            if(b>y)
            {
                b--;
            }
            else
            {
                b++;
            }
        }
    }
}
