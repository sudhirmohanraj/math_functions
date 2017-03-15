package com.programming.dev.math_functions.hackerrank;

/**
 * Created by wyh669 on 3/13/17.
 */
public class CandyReplenishment {

    public static void main(String[] args) {
        int n = 8;
        int candyToBeAdded = n;
        int t = 4;
        int[] c = {3,1,7,5};
        int candyLeft = 0;
        // your code goes here
        int candyAdded = 0;
        for(int i=1;i<=t;i++) {
            candyLeft = n-c[i-1];
            n = candyLeft;
            if(n<5 && i!=t) {
                candyAdded = candyAdded + candyToBeAdded - candyLeft;
                n = candyToBeAdded;
            } else {
                n = candyLeft;
            }
        }
        System.out.println(candyAdded);
    }
}
