/*
The frequency with which data occurs is sometimes an important statistic. In this problem you are 
given an array of strings and must determine how frequently the strings occur. Return an array of 
strings that is sorted (ordered) by frequency. The first element of the returned array is the most 
frequently occurring string, the last element is the least frequently occurring. Ties are broken by 
listing strings in lexicographic/alphabetical order. The returned array contains one occurrence of 
each unique string from the array parameter.
*/

import java.util.*;

public class SortByFreqs {

    private class Counts {
        String myWord;
        int myCount;
        
        Counts(String word) {
            myWord = word;
        }

        public int getCount() {
            return myCount;
        }

        @Override
        public String toString() {
            return String.format("%s",
                    myWord);
        }
    }

    public String[] sort(String[] data) {
        Map<String, Counts> finalMap = new HashMap<>();
        for(String s : data) {
            if(!finalMap.containsKey(s)){
                finalMap.put(s, new Counts(s));
            }
            finalMap.get(s).myCount += 1;
        }

        ArrayList<Counts> list = new ArrayList<>(finalMap.values());
        Comparator<Counts> freq = Comparator.comparing(Counts::getCount).reversed();
        Comparator<Counts> alpha = Comparator.comparing(Counts::toString);
        Collections.sort(list, freq.thenComparing(alpha));


        String[] finalArray = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            finalArray[i] = list.get(i).toString();
        }

        return finalArray;
        
    }
 }