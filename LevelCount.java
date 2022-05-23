/*
Write method count that returns the number of nodes in a tree at the level 
specified by parameter level. The root is at level 0, and the root's children 
are at level 1. In general, for any node, it's level is one more than its parent's level.
*/

public class LevelCount {
    public int count(TreeNode t, int level) {
        if(t == null) {
            return 0;
        }
        if(level == 0) {
            return 1;
        }
        return count(t.left, level - 1) + count(t.right, level - 1);
        }
    }