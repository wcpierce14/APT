/*
Write method unique that returns a sorted list of the unique values stored in the tree referenced by root
*/

import java.util.*;

public class UniqueTreeValues {

    private TreeSet<Integer> mySet;

    private void addSet(TreeNode t) {
        if(t != null) {
            addSet(t.left);
            mySet.add(t.info);
            addSet(t.right);
        }
    }

    public int[] unique(TreeNode root) {
        mySet = new TreeSet<>();
        addSet(root);
        int[] finalArr = new int[mySet.size()];
        int i = 0;
        for(Integer val : mySet) {
            finalArr[i] = val;
            i++;
        }
        return finalArr;

    }
}