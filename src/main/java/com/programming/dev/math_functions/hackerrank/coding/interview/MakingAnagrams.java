package com.programming.dev.math_functions.hackerrank.coding.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.sort;

/**
 * Created by wyh669 on 1/23/17.
 */
public class MakingAnagrams {

    // This method fails when there are multiple duplicate characters.
    public static int numberNeeded(String first, String second) {
        int numberOfDeletion =0;
        char[] firstCh= first.toCharArray();
        char[] secondCh= first.toCharArray();
        sort(firstCh);
        sort(secondCh);
        if(secondCh.equals(firstCh)) {
            return numberOfDeletion;
        }



        for(int i = 0; i< first.length();i++) {
            if(second.indexOf(first.charAt(i))<0) {
                numberOfDeletion+=1;
            }
        }


        for(int i = 0; i< second.length();i++) {
            if(first.indexOf(second.charAt(i))<0) {
                numberOfDeletion+=1;
            }
        }

        return numberOfDeletion;
    }

    // have an array of 26 characters and increment and decrement the array as we go through it.
    // At the end add the sum of the array.
    static int numberNeeded2(String first,String second) {
        int[] lettercounts = new int[26];
        for(char c : first.toCharArray()){
            lettercounts[c-'a']++;
        }
        for(char c : second.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberNeeded("fsqoiaidfaukvngpsugszsnseskicpejjvytviya", "ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget"));
    }
}
