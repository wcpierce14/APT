/*
Filtering data often requires determining which data elements satisfy a specific criterion. Write method 
filter which has two parameters: a String[] of data to be filtered and an int parameter indicating the minimum 
acceptable length for the string data.
Return a String[] array of the unique strings in list whose lengths are greater than or equal to minLength.
*/

import java.util.ArrayList;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {

        // Get unique words in correct order
        ArrayList<String> uniqueWords = new ArrayList<String>();
        for(int i = 0; i < list.length; i++) {
            if(!uniqueWords.contains(list[i])) {
                uniqueWords.add(list[i]);
            }
        }
        // Keep words that are longer than minLength
        ArrayList<String> uniqueLongWords = new ArrayList<String>();
        for(int i = 0; i < uniqueWords.size(); i++) {
            if(uniqueWords.get(i).length() >= minLength) {
                uniqueLongWords.add(uniqueWords.get(i));
            }
        }
        // Create final array with correct elements
        String [] finalArray = new String[uniqueLongWords.size()];
        for(int i = 0; i < uniqueLongWords.size(); i++) {
            finalArray[i] = uniqueLongWords.get(i);
        }
        return finalArray;
    }
}