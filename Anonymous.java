/*
If you want to write a message anonymously, one way to do it is to cut out letters from headlines in a 
newspaper and paste them onto a blank piece of paper to form the message you want to write. Given 
several headlines that you have cut out, determine how many messages from a list you can write using 
the letters from the headlines. You should only consider each message by itself and not in conjunction 
with the others, see example 2.
Write the method howMany which takes as parameters a String[] headlines containing the headlines which 
you have cut out as well as a String[] messages with the messages you may want to write, and returns an 
int which is the total number of messages you can write.
*/

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int totalCount = 0;
        for(int i = 0; i < messages.length; i++) {
            String[] singleStringArray = new String[1];
            singleStringArray[0] = messages[i];
            int tempCount = 0;
            for(int k = 0; k < 300; k++) {
                if((getCounts(headlines)[k] < getCounts(singleStringArray)[k]) && (k != ' ')) {
                    break;
                }
                tempCount += 1;
            }
            if(tempCount == 300) {
                totalCount += 1;
            }
    
        }
        return totalCount;
    }

    private int[] getCounts(String[] strings){
        int[] counts = new int[300];
        for(String s : strings) {
            for(char ch : s.toLowerCase().toCharArray()) {
                counts[ch] += 1;
            }
        }
        return counts;

    }
 }