/*
Two strings have a letter in common if it appears in both strings. The position of letter is not important for 
it to be counted as common. Once a particular letter is counted as in common, it cannot be counted again. For example, 
an o appearing twice in one word but only once in the other counts only as one letter in common. However, an o 
appearing twice both words counts as two letters in common. Write a function that takes two strings and returns the 
number of letters they have in common.
*/

import java.util.ArrayList;

public class Common {
    public int count (String a, String b) {
        int i;
        int j;
        ArrayList<Character> lettersA = new ArrayList<Character>();
        ArrayList<Character> lettersB = new ArrayList<Character>();

        // Fill the lettersA and lettersB with the characters from the a and b strings
        for(i = 0; i < a.length(); i++) {
            lettersA.add(a.charAt(i));
            lettersB.add(b.charAt(i));
        }

        // Check for matches
        int total = 0;
        for(i = 0; i < a.length(); i++) {
            for(j = 0; j < b.length(); j++) {
                if(lettersA.get(i) == lettersB.get(j)) {
                    total += 1;
                    lettersB.set(j, '-');
                    break;
                }
            }
        }
    return total;
    }
}
 