/*
Write method trails that returns an array of the binary encoded root-to-leaf paths for each 
leaf node of its tree parameter tree.
Values stored in leaf nodes will be unique, that is the same value will not appear in more 
than one leaf.

In traversing from the root to a leaf a path is represented by going left or right. Going left 
is encoding by a zero and going right is encoded by a one. The path left,left,right would thus 
be encoded as "001" in the binary encoding of the root-to-leaf path.

The strings stored in the array should be sorted by the value stored in the leaf node represented 
by the path.
*/

import java.util.HashMap;
import java.util.*;

public class LeafTrails {

    private HashMap<Integer, String> pathMap = new HashMap<>();

    private void path(TreeNode t, String p) {
        if(t == null) {
            return;
        }
        if(t.left == null && t.right == null) {
            pathMap.put(t.info, p);
            return;
        }
        path(t.left, p + "0");
        path(t.right, p + "1");
    }
    public String[] trails(TreeNode tree) {
        path(tree, "");

        String[] finalArr = new String[pathMap.size()];
        Object[] keys = pathMap.keySet().toArray();
        Arrays.sort(keys);

        int i = 0;
        for(Object key : keys) {
            finalArr[i] = pathMap.get(key);
            i++;
        }
        return finalArr;
    }
}