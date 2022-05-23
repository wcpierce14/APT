/*
Two phrases are anagrams if they are permutations of each other, ignoring spaces and capitalization. 
For example, "Aaagmnrs" is an anagram of "anagrams", and "TopCoder" is an anagram of "Drop Cote". 
Given a String[] phrases, remove each phrase that is an anagram of an earlier phrase, and return the 
remaining phrases in their original order.
In writing code you'll need to return a new array whose elements aren't anagrams of each other.
*/

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        // Create a duplicate array of phrases without spaces and in all 
        // lowercase and sort each word alphabetically

        String[] dupPhrases = new String[phrases.length];
        for(int i = 0; i < phrases.length; i++) {
            dupPhrases[i] = phrases[i].toLowerCase().replaceAll("\\s", "");
            char charArray[] = dupPhrases[i].toCharArray();
            Arrays.sort(charArray);
            dupPhrases[i] = new String(charArray);
        }

        // Create a map with the alphabetically ordered word as the key and the element in 
        // phrases as the value 
        
        Map<String, String> alphaMap = new HashMap<String, String>();
        List<String> finalList = new ArrayList<String>();
        

        for(int i = 0; i < dupPhrases.length; i++) {
            if(!alphaMap.containsKey(dupPhrases[i])) {
                alphaMap.put(dupPhrases[i], phrases[i]);
                finalList.add(phrases[i]);
            }
        }
        String[] finalArray = finalList.toArray(new String[0]);

        return finalArray;
    }
 }