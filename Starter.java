/*
Determine how many unique words in an array of words start with a specified letter. Write a method that 
determines how many different strings in words have a first letter equal to first.
*/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Starter {
        public int begins(String[] words, String first) {
        int k; 
        int total = 0;

        // Use a set to remove dupliate items of the array then convert the set back to an array
        Set<String> setVersion = new LinkedHashSet<String>(Arrays.asList(words));
        String[] uniqueArray = setVersion.toArray(new String[setVersion.size()]);
        

        // Count the number of words that begin with "first"
        for(k = 0; k < uniqueArray.length; k++) {
            if(uniqueArray[k].substring(0,1).equals(first)) {
                total += 1;
            }
            else {
                total += 0;
            }
        }
        return total;
    }
}

