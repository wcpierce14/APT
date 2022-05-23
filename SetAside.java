/*
Write method common that finds each word that appears in every element of parameter String[] 
list and returns a String containing these words in alphabetical order, each separated by a space.
Each word in the string returned should be unique/different.

Each element of list is a string of words, each separated by a space. If there are no words 
that appear in each and every element of list return an empty string: "".
*/

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.Arrays;

public class SetAside {
    public String common(String[] list) {
        Set<String> words = new TreeSet<>(Arrays.asList(list[0].split(" ")));
        for(int i = 1; i < list.length; i++) {
            Set<String> otherWords = new TreeSet<>(Arrays.asList(list[i].split(" ")));
            words.retainAll(otherWords);
        }
        String finalString = String.join(" ", words);

        return finalString;
    }
}