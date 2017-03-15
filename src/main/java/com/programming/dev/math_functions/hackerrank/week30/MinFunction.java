package com.programming.dev.math_functions.hackerrank.week30;

/**
 * Created by wyh669 on 3/14/17.
 */
public class MinFunction {
    static StringBuilder st = new StringBuilder();
    static int endingBrace = 0;
    public static void main(String[] args) {
        System.out.println(minFunction(4));
    }

    public static String minFunction(int i) {

        if (i ==2) {
            st.append("min(int, int)");
            for (i =0;i<endingBrace;i++){
                st.append(")");
            }
            return st.toString();
        } else {
            st.append("min(int, ");
            endingBrace+=1;
            i-=1;
            minFunction(i);
        }
        return st.toString();
    }
}
