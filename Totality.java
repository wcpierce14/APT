/*
The phrases even keeled, odd job, and total eclipse might come to mind as you solve this APT. 
Given an array of int values, return the sum of those values that are at odd indexes, even indexes, or 
every index depending on whether the value of the String stype is "odd", "even", or "all", respectively.
*/

public class Totality {
    public int sum(int[] a, String stype) {
        int sum = 0;
        int k;

        if(stype.equals("all")) {
            for(k = 0; k < a.length; k += 1) {
                sum = sum + a[k];
            }
            return sum;
        }

        else if(stype.equals("odd")) {
            for(k = 1; k < a.length; k += 2) {
                sum = sum + a[k];
            }
            return sum;
        }
        
        else {
            for(k=0; k < a.length; k += 2) {
                sum = sum + a[k];
            }
            return sum;
        }
       
    }
}

