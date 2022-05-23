/*
The frequency with which data occurs is sometimes an important statistic. In this problem you'll 
determine how frequently strings occur and return an array representing the frequencies of each 
different/unique string. The array returned contains as many frequencies as there are unique strings. 
The returned frequencies represent an alphabetic/lexicographic ordering of the unique words, so the first
 frequency is how many times the alphabetically first word occurs and the last frequency is the number of 
 times the alphabetically last word occurs.
*/

import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        Arrays.sort(data);
        Set<String> orderedSet = new TreeSet<>(Arrays.asList(data));

        int[] counts = new int[orderedSet.size()];
        for(int i = 0; i < counts.length; i++) {
            counts[i] = Collections.frequency(Arrays.asList(data), orderedSet.toArray(new String[0])[i]);
        }
        return counts;
    }
 }