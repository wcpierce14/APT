/*
Sometimes sorting helps in recognizing patterns. Given an array of strings, write the method recognize 
that returns an array of the same strings, but sorted by length with the shortest strings first and the 
longest strings last in the returned array. You can create a new array or sort the array parameter value, 
but you must return a sorted array containing the same strings that are in values.
In the returned array, strings that are the same length should be sorted in alphabetical order. 
*/

import java.util.Comparator;
import java.util.Arrays;

public class LengthSort {
    public String[] rearrange(String[] values){
        Comparator<String> wordLength = Comparator.comparing(String::length);
        Comparator<String> finalComp = wordLength.thenComparing(Comparator.naturalOrder());
        Arrays.sort(values, finalComp);
        return values;
    }
}