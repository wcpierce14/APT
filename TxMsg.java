/*
Strange abbreviations are often used to write text messages on uncomfortable mobile devices. 
One particular strategy for encoding texts composed of alphabetic characters and spaces is the following:
- Spaces are maintained, and each word is encoded individually. A word is a consecutive string of alphabetic characters.
- If the word is composed only of vowels, it is written exactly as in the original message.
- If the word has at least one consonant, write only the consonants that do not have another consonant immediately before them. Do not write any vowels.
The letters considered vowels in these rules are 'a', 'e', 'i', 'o' and 'u'. All other letters are considered consonants.
For instance, "ps i love u" would be abbreviated as "p i lv u" while "please please me" would be abbreviated as "ps ps m". 
You will be given the original message in the string parameter original. Return a string with the message abbreviated using the described strategy.
*/

import java.util.ArrayList;
import java.lang.StringBuilder;

public class TxMsg {
    public String convert(String word){ 
    String finalString = new String(); 
        if (!word.contains("b") && !word.contains("c") && !word.contains("d") && !word.contains("f") && !word.contains("g") &&
        !word.contains("h") && !word.contains("j") && !word.contains("k") && !word.contains("l") && !word.contains("m") &&
        !word.contains("n") && !word.contains("p") && !word.contains("q") && !word.contains("r") && !word.contains("s") &&
        !word.contains("t") && !word.contains("v") && !word.contains("w") && !word.contains("x") && !word.contains("y") &&
        !word.contains("z")) {
            finalString = word;
        }
        else{
            char[] wordChar = word.toCharArray();
            ArrayList<Character> lettersKept = new ArrayList<Character>();
            lettersKept.add(wordChar[0]);

            for(int i = 1; i < wordChar.length; i++) {
                if(wordChar[i-1] == 'a' || wordChar[i-1] == 'e' || wordChar[i-1] == 'i' || wordChar[i-1] == 'o' || wordChar[i-1] == 'u') {
                    lettersKept.add(wordChar[i]);
                }
            }

            StringBuilder helper = new StringBuilder(lettersKept.size());
            for(int i = 0; i < lettersKept.size(); i++) {
                helper.append(lettersKept.get(i));
            }
            String finalStringWithVowels = helper.toString();
            finalString = finalStringWithVowels.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
        }
        return finalString;  
    } 


    public String getMessage(String original) {
        String [] data = original.split(" ");
        String [] ret = new String[data.length];

        for(int i = 0; i < data.length; i++) {
            ret[i] = convert(data[i]);
            }
        return String.join(" ", ret);

    }
}   


