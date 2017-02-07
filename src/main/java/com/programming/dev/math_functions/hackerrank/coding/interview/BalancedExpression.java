package com.programming.dev.math_functions.hackerrank.coding.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by wyh669 on 1/26/17.
 */
public class BalancedExpression {

    public static boolean isBalanced(String expression) {
        Stack<Character> st = new Stack<Character>();
        Map<Character,Character> braces = new HashMap<Character, Character>();
        braces.put('(',')');
        braces.put('{','}');
        braces.put('[',']');
        char[] individualExp = expression.toCharArray();

        for(int i=0; i<=individualExp.length-1;i++) {
            if (individualExp[i]=='(' || individualExp[i]=='[' || individualExp[i]=='{' ) {
                st.push(individualExp[i]);
            } else {
                if(!st.isEmpty()) {
                    Character ch = st.pop();
                    Character closingCh = braces.get(ch);
                    if (closingCh != individualExp[i]) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if(!st.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
       System.out.println(isBalanced("{{}("));
    }
}
