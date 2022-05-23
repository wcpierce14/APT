/*
Write a method sum that returns the sum of the values greater than thresh in its 
list parameter, a linked list of int values
*/

public class ListSum {

    public int sum(ListNode list, int thresh) {
        int total = 0;
        while(list != null) {
            if(list.info > thresh) {
                total += list.info;
            }
            list = list.next;
        }
        return total;
    }
}

