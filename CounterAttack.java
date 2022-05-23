/*
Count how many times each element of words occurs as a white-space delimited string in parameter str. 
Return the number of occurrences in an int[] so that the number of times that words[k] occurs is given 
by the kth value in the returned array.
*/

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        // Split the string into an array of words
        String [] strWords = str.split(" ");
        
        //Empty int array to store counts
        int[] counter = new int[words.length];

        // For loop with if statement
        for(int i = 0; i < words.length; i++) {
            for(int k = 0; k < strWords.length; k++) {
                if(words[i].equals(strWords[k])) {
                    counter[i] += 1;
                }
            }
        }
        return counter;
    }
}