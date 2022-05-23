/*
Write a method equal that returns 1 if its two linked list parameters are equal, and 
returns 0 if they are not equal.
*/

public class ListsEqual {

    public int equal (ListNode a1, ListNode a2) {
        int finalOutput = 0;
        
        if(a1 == null && a2 == null) {
            finalOutput = 1;
        }
        else if(a1 == null || a2 == null) {
            finalOutput = 0;
        }
        else {
            while(a1.next != null && a2.next != null) {
                if(a1.info == a2.info) {
                    a1 = a1.next;
                    a2 = a2.next;
                    continue;
                }
            }
            if(a1.next == null && a2.next == null) {
                finalOutput = 1;
            }
            else {
                finalOutput = 0;
            }
        }
    return finalOutput;
}
}