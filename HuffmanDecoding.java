/*
When text is encoded using Huffman codes, each symbol is replaced by a string of 0s and 1s 
called a bit string representation. The replacement is done in such a way that the bit string 
representation of a symbol is never the prefix of the bit string representation of any other 
symbol. This property allows us to unambiguously decode the encoded text.
You will be given a String archive and a String[] dictionary. The i-th element of dictionary 
will be the bit string representation of the i-th uppercase letter. Decode archive using dictionary 
and return the result as a single String.
*/

import java.util.*;

public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        String answer = "";
        Map<String, Character> dictMap = new HashMap<>();
        char temp = 'A';
        for(int i = 0; i < dictionary.length; i++) {
            dictMap.put(dictionary[i], temp);
            temp++;
        }
        int base = 0;
        int end = 0;
        while(end != archive.length()) {
            while(!dictMap.containsKey(archive.substring(base, end))) {
                end++;   
            }
            answer += String.valueOf(dictMap.get(archive.substring(base, end)));
            base = end;
        }
        return answer;
    }
 }