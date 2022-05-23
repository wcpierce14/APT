/*
Write a method bigify that "doubles" a list so that the list [1,2,3] becomes [1,1,2,2,3,3]. 
For every node Ni in the list passed a parameter.a new node is added following Ni holding the 
same value as Ni and pointing to Ni+1. The last node in the original list points at a new last 
node with the same value.
*/

public class DoubleList {
    public ListNode bigify(ListNode list) {
        ListNode first = list;
        while(list != null) {
            list.next = new ListNode(list.info, list.next);
            list = list.next.next;
        }

        return first;
    }
}