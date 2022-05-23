/*
Write a method remove that removes the node with the minimal value from the linked-list 
parameter list, returning a linked list that has one less node than list since the 
minimal node is removed. The other nodes in the returned list should be in the same 
order as they are in parameter list.
*/

public class RemoveMin {

    public ListNode remove (ListNode list) {
        ListNode first = list;
        ListNode end = list;
        int minVal = list.info;
        while(list.next != null) {
            if(list.next.info < minVal) {
                minVal = list.next.info;
            }
            list = list.next;
        }
        
        while(first != null) {
            if(first.info == minVal){
                end = first.next;
            }
            if(first.next != null && first.next.info == minVal) {
                first.next = first.next.next;
            }
            first = first.next;
        }
    return end;
    }
} 