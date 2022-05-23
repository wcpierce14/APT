/*
Write a method create that creates a linked-list of nodes whose values are the lengths of the 
unique strings in words when considered in alphabetical order.
*/

import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.TreeSet;

public class AlphaLength {

    public ListNode create (String[] words) {
        
        // Convert the string array to a TreeSet to get unique alphabetized elements
        List<String> tempList = Arrays.asList(words);
        Set<String> treeUnique = new TreeSet<String>(tempList);
        String[] stringArray = new String[treeUnique.size()];
        stringArray = treeUnique.toArray(stringArray);


        ListNode finalList = new ListNode(stringArray[0].length());
        ListNode first = finalList;
        for(int i = 1; i < stringArray.length; i++) {
            finalList.next = new ListNode(stringArray[i].length());
            finalList = finalList.next;
        }
        return first;
    }
}