/*
The Simple Word Game is a game where a player tries to remember as many words as possible from a given dictionary. 
The score for each distinct word that the player remembers correctly is the square of the word's length.
You are given a String[] player, each element of which is a word remembered by the player. There may be duplicate words, 
but if the same word appears multiple times, it should only be counted once. You are given the dictionary in the String[] 
dictionary, each element of which is a single distinct word. Return the player's total score.
*/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {

        int i;
                        
        // Convert player words to set then back to array in order to only have unique words
        Set<String> setVersion = new LinkedHashSet<String>(Arrays.asList(player));
        String[] uniqueArray = setVersion.toArray(new String[setVersion.size()]);

        // Convert the dictionary words to an array list
        List<String> dictionaryList = new ArrayList<>(Arrays.asList(dictionary));

        // Find common words
        int totalScore = 0;
        for(i = 0; i < uniqueArray.length; i++) {
            if(dictionaryList.contains(uniqueArray[i]) == true) {
                totalScore = totalScore + (uniqueArray[i].length() * uniqueArray[i].length());
            }
        }
        return totalScore; 
    }
}