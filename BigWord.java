/*
In days of yore, aka BG (Before Google), search engines ranked webpages in part by the number of 
occurrences of a word on the page. You should write method most to determine and return the word that 
occurs most often in an array of sentences. This most frequently occurring word will be unique --- that
is you don't need to worry about two words both occuring more often than any other word. The word returned s
hould be all lower-case regardless of the case of leters in sentences.
Each string in sentences represents several words, each word is delimited by spaces from other words. 
Words should be considered the same without respect to case, so BIG is the same word as big, for example.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class BigWord {
    public String most(String[] sentences) {
        
        String joinedString = String.join(" ", sentences);
        String[] singleWords = joinedString.split(" ");
        List<String> wordList = Arrays.asList(singleWords);
        List<String> wordListFinal = new ArrayList<String>(); 

        // Convert all words to lowercase
        for(int i = 0; i < wordList.size(); i++) {
            wordListFinal.add(wordList.get(i).toLowerCase());
        }
        
        String longestWord = "";
        int largestWordCount = -1;
        for(String word : wordListFinal) {
            int frequency = Collections.frequency(wordListFinal, word);
            if(frequency > largestWordCount) {
                largestWordCount = frequency;
                longestWord = word;
            }
        }
        return longestWord;
        }
    }
