/*
Write a method fold that has an int[] parameter and that returns an int[] array 
formed by summing each adjacent pairs of integer values in the parameter.
*/

public class PairDown {
    public int[] fold(int[] list) {

        int[] finalArray = new int[(list.length / 2) + (list.length % 2)];

        for(int i = 0; i < list.length; i = i + 2) {
            int k = i / 2;
            if(i + 1 == list.length) {
                finalArray[k] = list[i];
            }
            else{ 
                finalArray[k] = (list[i] + list[i + 1]);
            }
        }

        return finalArray;
    }
}
