/*
Write method tighten that removes every node with a single child (either left or right), 
replacing such nodes with their single child. This tightening process is repeatedly applied 
so that when completed all nodes have either zero or two children
*/

public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if(t.left == null && t.right == null) {
            return t;
        }
        if(t.left != null && t.right != null) {
            t.left = tighten(t.left);
            t.right = tighten(t.right);
        }
        if(t.left == null) {
            return tighten(t.right);
        }
        if(t.right == null) {
            return tighten(t.left);
        }
        return t;
    }
}