/*
Write a method stretch that stretches a linked list of integers by a specified 
integer value amount, so that each node of the list parameter is represented by 
amount copies of the node in the list that's returned.
*/

public class ListStretch {
    public ListNode stretch (ListNode list, int amount) {
        ListNode first = list;
        while(list != null) {
            int tempCount = 1;
            while(tempCount < amount) {
                list.next = new ListNode(list.info, list.next);
                list = list.next;  
                tempCount += 1;              
            }
            list = list.next;
        }
        return first;

    }    
}
