/*
Write method rewire that returns a new tree, isomorphic (same shape) as the tree 
parameter, but in which each node's info field is equal to that node's height in the tree
*/

import java.math.*;

public class HeightLabel {
    private int height(TreeNode t) {
        if(t == null) {
            return 0;
        }
        return 1 + Math.max(height(t.left), height(t.right));
    }

    public TreeNode rewire(TreeNode t) {
        if(t == null) {
            return null;
        }
        return new TreeNode(height(t), rewire(t.left), rewire(t.right));
    }
}