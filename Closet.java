/*
Write method anywhere that finds each word that appears in any element of parameter String[] 
list and returns a String containing these words in alphabetical order, each separated by a space.
Each word in the string returned should be unique/different.

Each element of list is a string of words, each separated by a space. Each of these words, 
that appear in any element of list, are represented in the string returned.
*/

import java.util.*;

public class Closet {
    public String anywhere(String[] list) {

        // Make one large list of the words in list (split by space)
        List<String> totalList = new ArrayList<String>();
        for(int i = 0; i < list.length; i++) {
            String[] tempInd = list[i].split(" ");
            for(int k = 0; k < tempInd.length; k++) {
                totalList.add(tempInd[k]);
            }
        }        

        // Make a set containing the unique elements of the list 
        Set<String> uniqueWords = new TreeSet<>(totalList);
        // String[] finalArray = Set.toArray(uniqueWords);

        // Return a string of the elements in words
        List<String> finalList = new ArrayList<String>();
        finalList.addAll(uniqueWords);
        String finalString = String.join(" ", finalList);

        return finalString;
    }
}